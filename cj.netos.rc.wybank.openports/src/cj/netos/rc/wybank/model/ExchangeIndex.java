package cj.netos.rc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: exchange_index
 */
public class ExchangeIndex {
    /**
     * Column: id
     * Remark: 标识
     */
    private String id;

    /**
     * Column: exchange_fund
     * Remark: 发放总金额
     */
    private Long exchangeFund;

    /**
     * Column: reclaim_stock
     * Remark: 回收纹银总量
     */
    private BigDecimal reclaimStock;

    /**
     * Column: exchange_count
     * Remark: 承兑笔数
     */
    private Long exchangeCount;

    /**
     * Column: bankid
     */
    private String bankid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getExchangeFund() {
        return exchangeFund;
    }

    public void setExchangeFund(Long exchangeFund) {
        this.exchangeFund = exchangeFund;
    }

    public BigDecimal getReclaimStock() {
        return reclaimStock;
    }

    public void setReclaimStock(BigDecimal reclaimStock) {
        this.reclaimStock = reclaimStock;
    }

    public Long getExchangeCount() {
        return exchangeCount;
    }

    public void setExchangeCount(Long exchangeCount) {
        this.exchangeCount = exchangeCount;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}