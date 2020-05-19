package cj.netos.rc.wybank.service;

import cj.netos.rc.wybank.IPurchaseService;
import cj.netos.rc.wybank.IShuntinService;
import cj.netos.rc.wybank.bo.model.PurchaseRecord;
import cj.netos.rc.wybank.bo.model.ShuntRecord;
import cj.netos.rc.wybank.bo.model.Shunter;
import cj.netos.rc.wybank.mapper.PurchIndexMapper;
import cj.netos.rc.wybank.mapper.PurchLedgerMapper;
import cj.netos.rc.wybank.mapper.ShuntinIndexMapper;
import cj.netos.rc.wybank.mapper.ShuntinLedgerMapper;
import cj.netos.rc.wybank.model.*;
import cj.netos.rc.wybank.util.BankUtils;
import cj.netos.rc.wybank.util.IdWorker;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;
import cj.ultimate.gson2.com.google.gson.Gson;
import cj.ultimate.gson2.com.google.gson.reflect.TypeToken;
import cj.ultimate.util.StringUtil;

import java.math.BigDecimal;
import java.util.*;

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
        String json = record.getShunters();
        List<Shunter> shunters = new Gson().fromJson(json, new TypeToken<ArrayList<Shunter>>() {
        }.getType());
        Map<String, ShuntinIndex> indexMap = getAndInitIndex(record.getBankid(), shunters);
        for (Shunter shunter : shunters) {
            ShuntinIndex index = indexMap.get(shunter.getCode());
            addLedger(record, index);
        }

    }

    private Map<String, ShuntinIndex> getAndInitIndex(String bankid, List<Shunter> shunters) {
        ShuntinIndexExample example = new ShuntinIndexExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<ShuntinIndex> list = shuntinIndexMapper.selectByExample(example);
        Map<String, ShuntinIndex> indexMap = new HashMap<>();
        for (ShuntinIndex index : list) {
            indexMap.put(index.getShunter(), index);
        }
        for (Shunter shunter : shunters) {
            if (indexMap.containsKey(shunter.getCode())) {
                continue;
            }
            ShuntinIndex index = new ShuntinIndex();

            index.setAmount(0L);
            index.setBankid(bankid);
            index.setId(IdWorker.nextId());
            index.setShunter(shunter.getCode());

            shuntinIndexMapper.insert(index);
            indexMap.put(shunter.getCode(), index);

        }

        return indexMap;
    }

    private void addLedger(ShuntRecord record, ShuntinIndex index) {

    }


}
