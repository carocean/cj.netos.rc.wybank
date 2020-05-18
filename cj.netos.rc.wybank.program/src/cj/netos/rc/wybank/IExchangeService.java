package cj.netos.rc.wybank;

import cj.netos.rc.wybank.model.ExchangeIndex;
import cj.netos.rc.wybank.model.ExchangeLedger;
import cj.netos.rc.wybank.bo.model.ExchangeRecord;

import java.util.List;

public interface IExchangeService {
    void doReport(ExchangeRecord record);

    ExchangeIndex getAndInitIndex(String bankid);

    List<ExchangeLedger> pageLedger(String wenyBankid, int limit, int offset);

    List<ExchangeIndex> pageIndex(int limit, int offset);

}
