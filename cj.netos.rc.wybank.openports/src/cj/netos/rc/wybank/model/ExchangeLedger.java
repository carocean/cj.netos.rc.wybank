package cj.netos.rc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: exchange_ledger
 */
public class ExchangeLedger {
    /**
     * Column: sn
     */
    private String sn;

    /**
     * Column: title
     * Remark: 显示名，一般是人名
     */
    private String title;

    /**
     * Column: participant
     * Remark: 参与者：申购人或承兑人或分账目标
     */
    private String participant;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: amount
     * Remark: 承兑的发生额
     */
    private Long amount;

    /**
     * Column: refsn
     * Remark: 关联承兑单号
     */
    private String refsn;

    /**
     * Column: ctime
     */
    private String ctime;

    /**
     * Column: note
     */
    private String note;

    /**
     * Column: workday
     * Remark: 会计日期
     */
    private String workday;

    /**
     * Column: exchange_fund
     * Remark: 发放总金额
     */
    private Long exchangeFund;

    /**
     * Column: reclaim_stock
     * Remark: 回收总银量
     */
    private BigDecimal reclaimStock;

    /**
     * Column: exchange_count
     * Remark: 承兑总笔数
     */
    private Long exchangeCount;

    /**
     * Column: day
     * Remark: 天，1-31
     */
    private Integer day;

    /**
     * Column: weekday
     * Remark: 在一周内第几天，1-7
     */
    private Integer weekday;

    /**
     * Column: month
     * Remark: 月，1-12
     */
    private Integer month;

    /**
     * Column: season
     * Remark: 季，0-3
     */
    private Integer season;

    /**
     * Column: yeer
     * Remark: 年
     */
    private Integer yeer;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant == null ? null : participant.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getRefsn() {
        return refsn;
    }

    public void setRefsn(String refsn) {
        this.refsn = refsn == null ? null : refsn.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday == null ? null : workday.trim();
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

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getYeer() {
        return yeer;
    }

    public void setYeer(Integer yeer) {
        this.yeer = yeer;
    }
}