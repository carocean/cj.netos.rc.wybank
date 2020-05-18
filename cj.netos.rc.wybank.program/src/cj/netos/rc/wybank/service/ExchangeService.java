package cj.netos.rc.wybank.service;

import cj.netos.rc.wybank.IExchangeService;
import cj.netos.rc.wybank.bo.model.ExchangeRecord;
import cj.netos.rc.wybank.mapper.ExchangeIndexMapper;
import cj.netos.rc.wybank.mapper.ExchangeLedgerMapper;
import cj.netos.rc.wybank.model.*;
import cj.netos.rc.wybank.util.BankUtils;
import cj.netos.rc.wybank.util.IdWorker;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "exchangeService")
public class ExchangeService implements IExchangeService {
    @CjServiceRef(refByName = "mybatis.cj.netos.rc.wybank.mapper.ExchangeLedgerMapper")
    ExchangeLedgerMapper exchangeLedgerMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.rc.wybank.mapper.ExchangeIndexMapper")
    ExchangeIndexMapper exchangeIndexMapper;

    @CjTransaction
    @Override
    public void doReport(ExchangeRecord record) {
        ExchangeIndex exchangeIndex = getAndInitIndex(record.getBankid());
        addLedger(record, exchangeIndex);

    }


    @CjTransaction
    @Override
    public ExchangeIndex getAndInitIndex(String bankid) {
        ExchangeIndexExample example = new ExchangeIndexExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<ExchangeIndex> list = exchangeIndexMapper.selectByExample(example);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ExchangeIndex exchangeIndex = new ExchangeIndex();
        exchangeIndex.setId(IdWorker.nextId());
        exchangeIndex.setBankid(bankid);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        exchangeIndex.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        exchangeIndex.setMonth(calendar.get(Calendar.MONTH));
        exchangeIndex.setYeer(calendar.get(Calendar.YEAR));
        exchangeIndex.setWeekday(calendar.get(Calendar.WEEK_OF_YEAR));
        exchangeIndex.setSeason(exchangeIndex.getMonth() % 4);

        exchangeIndex.setExchangeFund(0L);
        exchangeIndex.setExchangeCount(0L);
        exchangeIndex.setReclaimStock(new BigDecimal(0.0));

        exchangeIndexMapper.insert(exchangeIndex);
        return exchangeIndex;
    }

    private void addLedger(ExchangeRecord record, ExchangeIndex exchangeIndex) {
        ExchangeLedger ledger = new ExchangeLedger();
        ledger.setSn(IdWorker.nextId());
        ledger.setAmount(record.getAmount());
        ledger.setBankid(record.getBankid());
        ledger.setRefsn(record.getSn());
        ledger.setNote(record.getNote());
        ledger.setReclaimStock(record.getStock());
        ledger.setParticipant(record.getExchanger());
        ledger.setExchangeFund(exchangeIndex.getExchangeFund() + record.getAmount());
        ledger.setExchangeCount(exchangeIndex.getExchangeCount() + 1);
        ledger.setCtime(BankUtils.dateTimeToSecond(System.currentTimeMillis()));
        ledger.setTitle(record.getPersonName());
        ledger.setWorkday(BankUtils.dateTimeToDay(System.currentTimeMillis()));

        exchangeLedgerMapper.insert(ledger);

        updateIndex(record, exchangeIndex);
    }

    private void updateIndex(ExchangeRecord record, ExchangeIndex exchangeIndex) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        exchangeIndex.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        exchangeIndex.setMonth(calendar.get(Calendar.MONTH));
        exchangeIndex.setYeer(calendar.get(Calendar.YEAR));
        exchangeIndex.setWeekday(calendar.get(Calendar.WEEK_OF_YEAR));
        exchangeIndex.setSeason(exchangeIndex.getMonth() % 4);

        exchangeIndex.setExchangeFund(exchangeIndex.getExchangeFund() + record.getAmount());
        exchangeIndex.setExchangeCount(exchangeIndex.getExchangeCount() + 1);
        exchangeIndex.setReclaimStock(exchangeIndex.getReclaimStock().add(record.getStock()));

        exchangeIndexMapper.updateByPrimaryKeySelective(exchangeIndex);
    }

    @CjTransaction
    @Override
    public List<ExchangeLedger> pageLedger(String wenyBankid, int limit, int offset) {
        return exchangeLedgerMapper.pageledger(wenyBankid, limit, offset);
    }

    @CjTransaction
    @Override
    public List<ExchangeIndex> pageIndex(int limit, int offset) {
        return exchangeIndexMapper.pageIndex(limit, offset);
    }
}
