package cj.netos.rc.wybank;

import cj.netos.rc.wybank.model.ExchangeIndex;
import cj.netos.rc.wybank.model.ExchangeLedger;
import cj.netos.rc.wybank.model.PurchIndex;
import cj.netos.rc.wybank.model.PurchLedger;

import java.util.List;

public interface ITradeReporterService {
    PurchIndex getPurchaseIndex(String wenyBankid);

    List<PurchIndex> pagePurchaseIndex(int limit, int offset);

    List<ExchangeLedger> pageExchangeLedger(String wenyBankid, int limit, int offset);

    List<ExchangeIndex> pageExchangeIndex(int limit, int offset);

    ExchangeIndex getExchangeIndex(String wenyBankid);

    List<PurchLedger> pagePurchaseLedger(String wenyBankid, int limit, int offset);

}
