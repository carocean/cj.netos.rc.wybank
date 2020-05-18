package cj.netos.rc.wybank.service;

import cj.netos.rc.wybank.IPurchaseService;
import cj.netos.rc.wybank.IShuntinService;
import cj.netos.rc.wybank.bo.model.PurchaseRecord;
import cj.netos.rc.wybank.bo.model.ShuntRecord;
import cj.netos.rc.wybank.mapper.PurchIndexMapper;
import cj.netos.rc.wybank.mapper.PurchLedgerMapper;
import cj.netos.rc.wybank.mapper.ShuntinIndexMapper;
import cj.netos.rc.wybank.mapper.ShuntinLedgerMapper;
import cj.netos.rc.wybank.model.PurchIndex;
import cj.netos.rc.wybank.model.PurchIndexExample;
import cj.netos.rc.wybank.model.PurchLedger;
import cj.netos.rc.wybank.util.BankUtils;
import cj.netos.rc.wybank.util.IdWorker;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.util.StringUtil;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "shuntinService")
public class ShuntinService implements IShuntinService {
    @CjServiceRef(refByName = "mybatis.cj.netos.rc.wybank.mapper.ShuntinLedgerMapper")
    ShuntinLedgerMapper shuntinLedgerMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.rc.wybank.mapper.ShuntinIndexMapper")
    ShuntinIndexMapper shuntinIndexMapper;

    @CjTransaction
    @Override
    public void doReport(ShuntRecord record) {
        String json=record.getShunters();
    }


}
