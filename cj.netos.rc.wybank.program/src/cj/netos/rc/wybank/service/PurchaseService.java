package cj.netos.rc.wybank.service;

import cj.netos.rc.wybank.IPurchaseService;
import cj.netos.rc.wybank.mapper.PurchIndexMapper;
import cj.netos.rc.wybank.mapper.PurchLedgerMapper;
import cj.netos.rc.wybank.model.*;
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
@CjService(name = "purchaseService")
public class PurchaseService implements IPurchaseService {
    @CjServiceRef(refByName = "mybatis.cj.netos.rc.wybank.mapper.PurchLedgerMapper")
    PurchLedgerMapper purchLedgerMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.rc.wybank.mapper.PurchIndexMapper")
    PurchIndexMapper purchIndexMapper;

    @CjTransaction
    @Override
    public void doReport(PurchaseRecord record) {
        PurchIndex purchIndex = getAndInitPurchIndex(record.getBankid());
        addLedger(record, purchIndex);

    }

    @CjTransaction
    @Override
    public PurchIndex getAndInitPurchIndex(String bankid) {
        PurchIndexExample example = new PurchIndexExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<PurchIndex> list = purchIndexMapper.selectByExample(example);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        PurchIndex purchIndex = new PurchIndex();
        purchIndex.setId(IdWorker.nextId());
        purchIndex.setBankid(bankid);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        purchIndex.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        purchIndex.setMonth(calendar.get(Calendar.MONTH));
        purchIndex.setYeer(calendar.get(Calendar.YEAR));
        purchIndex.setWeekday(calendar.get(Calendar.WEEK_OF_YEAR));
        purchIndex.setSeason(purchIndex.getMonth() % 4);

        purchIndex.setPurchFund(0L);
        purchIndex.setPurchCount(0L);
        purchIndex.setIssueStock(new BigDecimal(0.0));
        purchIndex.setPrincipal(0L);
        purchIndex.setReserve(0L);
        purchIndex.setFreeAmount(0L);
        purchIndex.setFeeAmount(0L);
        purchIndex.setMinRecordAmount(0L);
        purchIndex.setMaxRecordAmount(0L);

        purchIndexMapper.insert(purchIndex);
        return purchIndex;
    }

    private void addLedger(PurchaseRecord record, PurchIndex purchIndex) {
        PurchLedger ledger = new PurchLedger();
        ledger.setSn(IdWorker.nextId());
        ledger.setAmount(record.getAmount());
        ledger.setBankid(record.getBankid());
        ledger.setRefsn(record.getSn());
        ledger.setIssueStock(record.getStock());
        ledger.setNote(record.getNote());
        ledger.setParticipant(record.getPurchaser());
        ledger.setPrincipal(record.getPrincipalAmount());
        ledger.setFreeAmount(record.getFreeAmount());
        ledger.setFeeAmount(record.getServiceFee());
        ledger.setPurchFund(purchIndex.getPurchFund() + record.getAmount());
        ledger.setPurchCount(purchIndex.getPurchCount() + 1);
        ledger.setCtime(BankUtils.dateTimeToSecond(System.currentTimeMillis()));
        ledger.setReserve(record.getReserveAmount());
        ledger.setTitle(record.getPersonName());
        ledger.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        purchLedgerMapper.insert(ledger);

        updateIndex(record, purchIndex);
    }

    private void updateIndex(PurchaseRecord record, PurchIndex purchIndex) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        purchIndex.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        purchIndex.setMonth(calendar.get(Calendar.MONTH));
        purchIndex.setYeer(calendar.get(Calendar.YEAR));
        purchIndex.setWeekday(calendar.get(Calendar.WEEK_OF_YEAR));
        purchIndex.setSeason(purchIndex.getMonth() % 4);

        purchIndex.setPurchFund(purchIndex.getPurchFund() + record.getAmount());
        purchIndex.setPurchCount(purchIndex.getPurchCount() + 1);
        purchIndex.setIssueStock(purchIndex.getIssueStock().add(record.getStock()));
        purchIndex.setPrincipal(purchIndex.getPrincipal() + record.getPrincipalAmount());
        purchIndex.setReserve(purchIndex.getReserve() + record.getReserveAmount());
        purchIndex.setFeeAmount(purchIndex.getFeeAmount() + record.getServiceFee());
        purchIndex.setFreeAmount(purchIndex.getFreeAmount() + record.getFreeAmount());
        if (record.getAmount() < purchIndex.getMinRecordAmount() || StringUtil.isEmpty(purchIndex.getMinRecordSn())) {
            purchIndex.setMinRecordAmount(record.getAmount());
            purchIndex.setMinRecordSn(record.getSn());
        }
        if (record.getAmount() > purchIndex.getMaxRecordAmount()) {
            purchIndex.setMaxRecordAmount(record.getAmount());
            purchIndex.setMaxRecordSn(record.getSn());
        }

        purchIndexMapper.updateByPrimaryKeySelective(purchIndex);
    }

    @CjTransaction
    @Override
    public List<PurchLedger> pageLedger(String wenyBankid, int limit, int offset) {
        return purchLedgerMapper.pageLedger(wenyBankid, limit, offset);
    }

    @CjTransaction
    @Override
    public List<PurchIndex> pageIndex(int limit, int offset) {
        return purchIndexMapper.pageIndex(limit, offset);
    }
}
