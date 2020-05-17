package cj.netos.rc.wybank.ports;

import cj.netos.rabbitmq.RabbitMQException;
import cj.netos.rc.wybank.ITradeReporterService;
import cj.netos.rc.wybank.bo.WenyBankBO;
import cj.netos.rc.wybank.model.ExchangeIndex;
import cj.netos.rc.wybank.model.ExchangeLedger;
import cj.netos.rc.wybank.model.PurchIndex;
import cj.netos.rc.wybank.model.PurchLedger;
import cj.netos.rc.wybank.util.ITradeReporterPorts;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.annotation.CjServiceSite;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;
import cj.ultimate.gson2.com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CjService(name = "/trade.ports")
public class TradeReporterPorts implements ITradeReporterPorts {

    @CjServiceRef
    ITradeReporterService tradeReporterService;

    @CjServiceSite
    IServiceSite site;
    WenyBankBO getWenyBank(String wenyBankid,String accessToken) throws CircuitException {
        OkHttpClient client = (OkHttpClient) site.getService("@.http");

        String bankPortsUrl = site.getProperty("ports.gateway.wybank");
        final Request request = new Request.Builder()
                .url(String.format("%s?banksn=%s",bankPortsUrl,wenyBankid))
                .addHeader("Rest-Command", "getWenyBank")
                .addHeader("cjtoken", accessToken)
                .get()
                .build();
        final Call call = client.newCall(request);
        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            throw new CircuitException("1002", e);
        }
        if (response.code() >= 400) {
            throw new CircuitException("1002", String.format("远程访问失败:%s", response.message()));
        }
        String json = null;
        try {
            json = response.body().string();
        } catch (IOException e) {
            throw new CircuitException("1002", e);
        }
        Map<String, Object> map = new Gson().fromJson(json, HashMap.class);
        if (Double.parseDouble(map.get("status") + "") >= 400) {
            throw new CircuitException(map.get("status") + "", map.get("message") + "");
        }
        json = (String) map.get("dataText");
        return new Gson().fromJson(json, WenyBankBO.class);
    }

    void demandAministratorRights(ISecuritySession securitySession) throws CircuitException {
        if (!securitySession.roleIn("platform:administrators")) {
            throw new CircuitException("800", "无权访问");
        }
    }

    boolean hasRights(ISecuritySession securitySession) {
        return securitySession.roleIn("platform:administrators");
    }

    @Override
    public PurchIndex getPurchaseIndex(ISecuritySession securitySession, String wenyBankid) throws CircuitException {
        WenyBankBO wenyBankBO = getWenyBank(wenyBankid,(String)securitySession.property("accessToken"));
        if (wenyBankBO == null) {
            throw new CircuitException("404", "不存在纹银银行:" + wenyBankid);
        }
        if (!hasRights(securitySession) && !wenyBankBO.getOwner().equals(securitySession.principal())) {
            throw new CircuitException("500", String.format("不是行长。%s!=%s", securitySession.principal(), wenyBankBO.getOwner()));
        }
        return tradeReporterService.getPurchaseIndex(wenyBankid);
    }

    @Override
    public List<PurchIndex> pagePurchaseIndex(ISecuritySession securitySession, int limit, int offset) throws CircuitException {
        demandAministratorRights(securitySession);
        return tradeReporterService.pagePurchaseIndex(limit, offset);
    }

    @Override
    public List<PurchLedger> pagePurchaseLedger(ISecuritySession securitySession, String wenyBankid, int limit, int offset) throws CircuitException {
        WenyBankBO wenyBankBO = getWenyBank(wenyBankid,(String)securitySession.property("accessToken"));
        if (wenyBankBO == null) {
            throw new CircuitException("404", "不存在纹银银行:" + wenyBankid);
        }
        if (!hasRights(securitySession) && !wenyBankBO.getOwner().equals(securitySession.principal())) {
            throw new CircuitException("500", String.format("不是行长。%s!=%s", securitySession.principal(), wenyBankBO.getOwner()));
        }
        return tradeReporterService.pagePurchaseLedger(wenyBankid, limit, offset);
    }

    @Override
    public ExchangeIndex getExchangeIndex(ISecuritySession securitySession, String wenyBankid) throws CircuitException {
        WenyBankBO wenyBankBO = getWenyBank(wenyBankid,(String)securitySession.property("accessToken"));
        if (wenyBankBO == null) {
            throw new CircuitException("404", "不存在纹银银行:" + wenyBankid);
        }
        if (!hasRights(securitySession) && !wenyBankBO.getOwner().equals(securitySession.principal())) {
            throw new CircuitException("500", String.format("不是行长。%s!=%s", securitySession.principal(), wenyBankBO.getOwner()));
        }
        return tradeReporterService.getExchangeIndex(wenyBankid);
    }

    @Override
    public List<ExchangeIndex> pageExchangeIndex(ISecuritySession securitySession, int limit, int offset) throws CircuitException {
        demandAministratorRights(securitySession);
        return tradeReporterService.pageExchangeIndex(limit, offset);
    }

    @Override
    public List<ExchangeLedger> pageExchangeLedger(ISecuritySession securitySession, String wenyBankid, int limit, int offset) throws CircuitException {
        //只有纹银银行的行主可以看，当然平台管理员也可以看
        WenyBankBO wenyBankBO = getWenyBank(wenyBankid,(String)securitySession.property("accessToken"));
        if (wenyBankBO == null) {
            throw new CircuitException("404", "不存在纹银银行:" + wenyBankid);
        }
        if (!hasRights(securitySession) && !wenyBankBO.getOwner().equals(securitySession.principal())) {
            throw new CircuitException("500", String.format("不是行长。%s!=%s", securitySession.principal(), wenyBankBO.getOwner()));
        }
        return tradeReporterService.pageExchangeLedger(wenyBankid, limit, offset);
    }
}
