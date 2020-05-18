package cj.netos.rc.wybank;

import cj.netos.rc.wybank.bo.model.PurchaseRecord;
import cj.netos.rc.wybank.model.*;

import java.util.List;

public interface IPurchaseService {
    void doReport(PurchaseRecord record);

    PurchIndex getAndInitPurchIndex(String bankid);

    List<PurchLedger> pageLedger(String wenyBankid, int limit, int offset);

    List<PurchIndex> pageIndex(int limit, int offset);

}
