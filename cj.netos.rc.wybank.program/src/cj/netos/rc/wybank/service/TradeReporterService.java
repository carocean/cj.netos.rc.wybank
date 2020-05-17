package cj.netos.rc.wybank.service;

import cj.netos.rc.wybank.IExchangeService;
import cj.netos.rc.wybank.IPurchaseService;
import cj.netos.rc.wybank.ITradeReporterService;
import cj.netos.rc.wybank.model.ExchangeIndex;
import cj.netos.rc.wybank.model.ExchangeLedger;
import cj.netos.rc.wybank.model.PurchIndex;
import cj.netos.rc.wybank.model.PurchLedger;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "tradeReporterService")
public class TradeReporterService implements ITradeReporterService {
    @CjServiceRef
    IExchangeService exchangeService;

    @CjServiceRef
    IPurchaseService purchaseService;

    @CjTransaction
    @Override
    public PurchIndex getPurchaseIndex(String wenyBankid) {
        return purchaseService.getAndInitPurchIndex(wenyBankid);
    }

    @CjTransaction
    @Override
    public List<PurchIndex> pagePurchaseIndex(int limit, int offset) {
        return purchaseService.pageIndex(limit,offset);
    }

    @CjTransaction
    @Override
    public List<ExchangeLedger> pageExchangeLedger(String wenyBankid, int limit, int offset) {
        return exchangeService.pageLedger(wenyBankid,limit,offset);
    }

    @CjTransaction
    @Override
    public List<ExchangeIndex> pageExchangeIndex(int limit, int offset) {
        return exchangeService.pageIndex(limit,offset);
    }

    @CjTransaction
    @Override
    public ExchangeIndex getExchangeIndex(String wenyBankid) {
        return exchangeService.getAndInitIndex(wenyBankid);
    }

    @CjTransaction
    @Override
    public List<PurchLedger> pagePurchaseLedger(String wenyBankid, int limit, int offset) {
        return purchaseService.pageLedger(wenyBankid,limit,offset);
    }
}
