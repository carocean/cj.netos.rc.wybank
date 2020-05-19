package cj.netos.rc.wybank.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public PurchIndexExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPurchFundIsNull() {
            addCriterion("purch_fund is null");
            return (Criteria) this;
        }

        public Criteria andPurchFundIsNotNull() {
            addCriterion("purch_fund is not null");
            return (Criteria) this;
        }

        public Criteria andPurchFundEqualTo(Long value) {
            addCriterion("purch_fund =", value, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundNotEqualTo(Long value) {
            addCriterion("purch_fund <>", value, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundGreaterThan(Long value) {
            addCriterion("purch_fund >", value, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_fund >=", value, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundLessThan(Long value) {
            addCriterion("purch_fund <", value, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundLessThanOrEqualTo(Long value) {
            addCriterion("purch_fund <=", value, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundIn(List<Long> values) {
            addCriterion("purch_fund in", values, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundNotIn(List<Long> values) {
            addCriterion("purch_fund not in", values, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundBetween(Long value1, Long value2) {
            addCriterion("purch_fund between", value1, value2, "purchFund");
            return (Criteria) this;
        }

        public Criteria andPurchFundNotBetween(Long value1, Long value2) {
            addCriterion("purch_fund not between", value1, value2, "purchFund");
            return (Criteria) this;
        }

        public Criteria andIssueStockIsNull() {
            addCriterion("issue_stock is null");
            return (Criteria) this;
        }

        public Criteria andIssueStockIsNotNull() {
            addCriterion("issue_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIssueStockEqualTo(BigDecimal value) {
            addCriterion("issue_stock =", value, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockNotEqualTo(BigDecimal value) {
            addCriterion("issue_stock <>", value, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockGreaterThan(BigDecimal value) {
            addCriterion("issue_stock >", value, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_stock >=", value, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockLessThan(BigDecimal value) {
            addCriterion("issue_stock <", value, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_stock <=", value, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockIn(List<BigDecimal> values) {
            addCriterion("issue_stock in", values, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockNotIn(List<BigDecimal> values) {
            addCriterion("issue_stock not in", values, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_stock between", value1, value2, "issueStock");
            return (Criteria) this;
        }

        public Criteria andIssueStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_stock not between", value1, value2, "issueStock");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(Long value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(Long value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(Long value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(Long value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<Long> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<Long> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(Long value1, Long value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andReserveIsNull() {
            addCriterion("reserve is null");
            return (Criteria) this;
        }

        public Criteria andReserveIsNotNull() {
            addCriterion("reserve is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEqualTo(Long value) {
            addCriterion("reserve =", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotEqualTo(Long value) {
            addCriterion("reserve <>", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThan(Long value) {
            addCriterion("reserve >", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThanOrEqualTo(Long value) {
            addCriterion("reserve >=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThan(Long value) {
            addCriterion("reserve <", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThanOrEqualTo(Long value) {
            addCriterion("reserve <=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveIn(List<Long> values) {
            addCriterion("reserve in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotIn(List<Long> values) {
            addCriterion("reserve not in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveBetween(Long value1, Long value2) {
            addCriterion("reserve between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotBetween(Long value1, Long value2) {
            addCriterion("reserve not between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNull() {
            addCriterion("free_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNotNull() {
            addCriterion("free_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountEqualTo(Long value) {
            addCriterion("free_amount =", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotEqualTo(Long value) {
            addCriterion("free_amount <>", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThan(Long value) {
            addCriterion("free_amount >", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("free_amount >=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThan(Long value) {
            addCriterion("free_amount <", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThanOrEqualTo(Long value) {
            addCriterion("free_amount <=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIn(List<Long> values) {
            addCriterion("free_amount in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotIn(List<Long> values) {
            addCriterion("free_amount not in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountBetween(Long value1, Long value2) {
            addCriterion("free_amount between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotBetween(Long value1, Long value2) {
            addCriterion("free_amount not between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(Long value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(Long value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(Long value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(Long value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(Long value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<Long> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<Long> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(Long value1, Long value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(Long value1, Long value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andPurchCountIsNull() {
            addCriterion("purch_count is null");
            return (Criteria) this;
        }

        public Criteria andPurchCountIsNotNull() {
            addCriterion("purch_count is not null");
            return (Criteria) this;
        }

        public Criteria andPurchCountEqualTo(Long value) {
            addCriterion("purch_count =", value, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountNotEqualTo(Long value) {
            addCriterion("purch_count <>", value, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountGreaterThan(Long value) {
            addCriterion("purch_count >", value, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_count >=", value, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountLessThan(Long value) {
            addCriterion("purch_count <", value, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountLessThanOrEqualTo(Long value) {
            addCriterion("purch_count <=", value, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountIn(List<Long> values) {
            addCriterion("purch_count in", values, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountNotIn(List<Long> values) {
            addCriterion("purch_count not in", values, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountBetween(Long value1, Long value2) {
            addCriterion("purch_count between", value1, value2, "purchCount");
            return (Criteria) this;
        }

        public Criteria andPurchCountNotBetween(Long value1, Long value2) {
            addCriterion("purch_count not between", value1, value2, "purchCount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountIsNull() {
            addCriterion("min_record_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountIsNotNull() {
            addCriterion("min_record_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountEqualTo(Long value) {
            addCriterion("min_record_amount =", value, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountNotEqualTo(Long value) {
            addCriterion("min_record_amount <>", value, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountGreaterThan(Long value) {
            addCriterion("min_record_amount >", value, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("min_record_amount >=", value, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountLessThan(Long value) {
            addCriterion("min_record_amount <", value, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountLessThanOrEqualTo(Long value) {
            addCriterion("min_record_amount <=", value, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountIn(List<Long> values) {
            addCriterion("min_record_amount in", values, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountNotIn(List<Long> values) {
            addCriterion("min_record_amount not in", values, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountBetween(Long value1, Long value2) {
            addCriterion("min_record_amount between", value1, value2, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordAmountNotBetween(Long value1, Long value2) {
            addCriterion("min_record_amount not between", value1, value2, "minRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnIsNull() {
            addCriterion("min_record_sn is null");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnIsNotNull() {
            addCriterion("min_record_sn is not null");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnEqualTo(String value) {
            addCriterion("min_record_sn =", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnNotEqualTo(String value) {
            addCriterion("min_record_sn <>", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnGreaterThan(String value) {
            addCriterion("min_record_sn >", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnGreaterThanOrEqualTo(String value) {
            addCriterion("min_record_sn >=", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnLessThan(String value) {
            addCriterion("min_record_sn <", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnLessThanOrEqualTo(String value) {
            addCriterion("min_record_sn <=", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnLike(String value) {
            addCriterion("min_record_sn like", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnNotLike(String value) {
            addCriterion("min_record_sn not like", value, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnIn(List<String> values) {
            addCriterion("min_record_sn in", values, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnNotIn(List<String> values) {
            addCriterion("min_record_sn not in", values, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnBetween(String value1, String value2) {
            addCriterion("min_record_sn between", value1, value2, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMinRecordSnNotBetween(String value1, String value2) {
            addCriterion("min_record_sn not between", value1, value2, "minRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountIsNull() {
            addCriterion("max_record_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountIsNotNull() {
            addCriterion("max_record_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountEqualTo(Long value) {
            addCriterion("max_record_amount =", value, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountNotEqualTo(Long value) {
            addCriterion("max_record_amount <>", value, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountGreaterThan(Long value) {
            addCriterion("max_record_amount >", value, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("max_record_amount >=", value, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountLessThan(Long value) {
            addCriterion("max_record_amount <", value, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountLessThanOrEqualTo(Long value) {
            addCriterion("max_record_amount <=", value, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountIn(List<Long> values) {
            addCriterion("max_record_amount in", values, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountNotIn(List<Long> values) {
            addCriterion("max_record_amount not in", values, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountBetween(Long value1, Long value2) {
            addCriterion("max_record_amount between", value1, value2, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordAmountNotBetween(Long value1, Long value2) {
            addCriterion("max_record_amount not between", value1, value2, "maxRecordAmount");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnIsNull() {
            addCriterion("max_record_sn is null");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnIsNotNull() {
            addCriterion("max_record_sn is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnEqualTo(String value) {
            addCriterion("max_record_sn =", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnNotEqualTo(String value) {
            addCriterion("max_record_sn <>", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnGreaterThan(String value) {
            addCriterion("max_record_sn >", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnGreaterThanOrEqualTo(String value) {
            addCriterion("max_record_sn >=", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnLessThan(String value) {
            addCriterion("max_record_sn <", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnLessThanOrEqualTo(String value) {
            addCriterion("max_record_sn <=", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnLike(String value) {
            addCriterion("max_record_sn like", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnNotLike(String value) {
            addCriterion("max_record_sn not like", value, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnIn(List<String> values) {
            addCriterion("max_record_sn in", values, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnNotIn(List<String> values) {
            addCriterion("max_record_sn not in", values, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnBetween(String value1, String value2) {
            addCriterion("max_record_sn between", value1, value2, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andMaxRecordSnNotBetween(String value1, String value2) {
            addCriterion("max_record_sn not between", value1, value2, "maxRecordSn");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankid is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankid is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("bankid =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("bankid <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("bankid >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("bankid >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("bankid <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("bankid <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("bankid like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("bankid not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("bankid in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("bankid not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("bankid between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("bankid not between", value1, value2, "bankid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}