package cj.netos.rc.wybank.model;

import java.math.BigDecimal;

/**
 * Table: purch_index
 */
public class PurchIndex {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: day
     * Remark: 纹银存量
     */
    private Integer day;

    /**
     * Column: weekday
     * Remark: 本日是星期几
     */
    private Integer weekday;

    /**
     * Column: month
     */
    private Integer month;

    /**
     * Column: season
     */
    private Integer season;

    /**
     * Column: yeer
     */
    private Integer yeer;

    /**
     * Column: purch_fund
     * Remark: 申购金总额
     */
    private Long purchFund;

    /**
     * Column: issue_stock
     * Remark: 发银总量
     */
    private BigDecimal issueStock;

    /**
     * Column: principal
     * Remark: 本金总量
     */
    private Long principal;

    /**
     * Column: reserve
     * Remark: 准备金总量
     */
    private Long reserve;

    /**
     * Column: free_amount
     * Remark: 自由金
     */
    private Long freeAmount;

    /**
     * Column: fee_amount
     * Remark: 手续费
     */
    private Long feeAmount;

    /**
     * Column: purch_count
     * Remark: 申购笔数
     */
    private Long purchCount;

    /**
     * Column: min_record_amount
     * Remark: 最小申购单金额
     */
    private Long minRecordAmount;

    /**
     * Column: min_record_sn
     * Remark: 关联最小申购单号
     */
    private String minRecordSn;

    /**
     * Column: max_record_amount
     * Remark: 最大申购单金额
     */
    private Long maxRecordAmount;

    /**
     * Column: max_record_sn
     * Remark: 最大申购单号
     */
    private String maxRecordSn;

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

    public Long getPurchFund() {
        return purchFund;
    }

    public void setPurchFund(Long purchFund) {
        this.purchFund = purchFund;
    }

    public BigDecimal getIssueStock() {
        return issueStock;
    }

    public void setIssueStock(BigDecimal issueStock) {
        this.issueStock = issueStock;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public Long getReserve() {
        return reserve;
    }

    public void setReserve(Long reserve) {
        this.reserve = reserve;
    }

    public Long getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(Long freeAmount) {
        this.freeAmount = freeAmount;
    }

    public Long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Long getPurchCount() {
        return purchCount;
    }

    public void setPurchCount(Long purchCount) {
        this.purchCount = purchCount;
    }

    public Long getMinRecordAmount() {
        return minRecordAmount;
    }

    public void setMinRecordAmount(Long minRecordAmount) {
        this.minRecordAmount = minRecordAmount;
    }

    public String getMinRecordSn() {
        return minRecordSn;
    }

    public void setMinRecordSn(String minRecordSn) {
        this.minRecordSn = minRecordSn == null ? null : minRecordSn.trim();
    }

    public Long getMaxRecordAmount() {
        return maxRecordAmount;
    }

    public void setMaxRecordAmount(Long maxRecordAmount) {
        this.maxRecordAmount = maxRecordAmount;
    }

    public String getMaxRecordSn() {
        return maxRecordSn;
    }

    public void setMaxRecordSn(String maxRecordSn) {
        this.maxRecordSn = maxRecordSn == null ? null : maxRecordSn.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}