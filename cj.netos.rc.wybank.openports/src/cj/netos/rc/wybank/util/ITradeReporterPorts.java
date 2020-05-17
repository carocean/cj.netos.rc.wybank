package cj.netos.rc.wybank.util;

import cj.netos.rc.wybank.model.ExchangeIndex;
import cj.netos.rc.wybank.model.ExchangeLedger;
import cj.netos.rc.wybank.model.PurchIndex;
import cj.netos.rc.wybank.model.PurchLedger;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;

@CjOpenports(usage = "服表中心交易类指标信息开放api")
public interface ITradeReporterPorts extends IOpenportService {

    @CjOpenport(usage = "获取指定银行的申购指标")
    PurchIndex getPurchaseIndex(ISecuritySession securitySession,
                                @CjOpenportParameter(usage = "纹银银行id", name = "wenyBankid") String wenyBankid
    ) throws CircuitException;

    @CjOpenport(usage = "分页获取各银行的申购指标")
    List<PurchIndex> pagePurchaseIndex(ISecuritySession securitySession,
                                       @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                       @CjOpenportParameter(usage = "位置", name = "offset") int offset
    ) throws CircuitException;

    @CjOpenport(usage = "分页获取指定银行的台账")
    List<PurchLedger> pagePurchaseLedger(ISecuritySession securitySession,
                                         @CjOpenportParameter(usage = "纹银银行id", name = "wenyBankid") String wenyBankid,
                                         @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                         @CjOpenportParameter(usage = "位置", name = "offset") int offset
    ) throws CircuitException;

    @CjOpenport(usage = "获取承兑指标")
    ExchangeIndex getExchangeIndex(ISecuritySession securitySession,
                                   @CjOpenportParameter(usage = "纹银银行id", name = "wenyBankid") String wenyBankid
    ) throws CircuitException;

    @CjOpenport(usage = "分页获取各银行的承兑指标")
    List<ExchangeIndex> pageExchangeIndex(ISecuritySession securitySession,
                                          @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                          @CjOpenportParameter(usage = "位置", name = "offset") int offset
    ) throws CircuitException;

    @CjOpenport(usage = "分页获取指定行的台账信息")
    List<ExchangeLedger> pageExchangeLedger(ISecuritySession securitySession,
                                            @CjOpenportParameter(usage = "纹银银行id", name = "wenyBankid") String wenyBankid,
                                            @CjOpenportParameter(usage = "页大小", name = "limit") int limit,
                                            @CjOpenportParameter(usage = "位置", name = "offset") int offset
    ) throws CircuitException;
}
