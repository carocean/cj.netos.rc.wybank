package cj.netos.rc.wybank;

import cj.netos.rc.wybank.bo.model.WithdrawRecord;

public interface IWithdrawService {
    void doReport(WithdrawRecord record);

}
