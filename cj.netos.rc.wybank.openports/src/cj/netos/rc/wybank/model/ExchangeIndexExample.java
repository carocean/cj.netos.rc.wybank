package cj.netos.rc.wybank.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public ExchangeIndexExample() {
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

        public Criteria andExchangeFundIsNull() {
            addCriterion("exchange_fund is null");
            return (Criteria) this;
        }

        public Criteria andExchangeFundIsNotNull() {
            addCriterion("exchange_fund is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeFundEqualTo(Long value) {
            addCriterion("exchange_fund =", value, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundNotEqualTo(Long value) {
            addCriterion("exchange_fund <>", value, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundGreaterThan(Long value) {
            addCriterion("exchange_fund >", value, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundGreaterThanOrEqualTo(Long value) {
            addCriterion("exchange_fund >=", value, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundLessThan(Long value) {
            addCriterion("exchange_fund <", value, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundLessThanOrEqualTo(Long value) {
            addCriterion("exchange_fund <=", value, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundIn(List<Long> values) {
            addCriterion("exchange_fund in", values, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundNotIn(List<Long> values) {
            addCriterion("exchange_fund not in", values, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundBetween(Long value1, Long value2) {
            addCriterion("exchange_fund between", value1, value2, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andExchangeFundNotBetween(Long value1, Long value2) {
            addCriterion("exchange_fund not between", value1, value2, "exchangeFund");
            return (Criteria) this;
        }

        public Criteria andReclaimStockIsNull() {
            addCriterion("reclaim_stock is null");
            return (Criteria) this;
        }

        public Criteria andReclaimStockIsNotNull() {
            addCriterion("reclaim_stock is not null");
            return (Criteria) this;
        }

        public Criteria andReclaimStockEqualTo(BigDecimal value) {
            addCriterion("reclaim_stock =", value, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockNotEqualTo(BigDecimal value) {
            addCriterion("reclaim_stock <>", value, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockGreaterThan(BigDecimal value) {
            addCriterion("reclaim_stock >", value, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reclaim_stock >=", value, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockLessThan(BigDecimal value) {
            addCriterion("reclaim_stock <", value, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reclaim_stock <=", value, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockIn(List<BigDecimal> values) {
            addCriterion("reclaim_stock in", values, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockNotIn(List<BigDecimal> values) {
            addCriterion("reclaim_stock not in", values, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reclaim_stock between", value1, value2, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andReclaimStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reclaim_stock not between", value1, value2, "reclaimStock");
            return (Criteria) this;
        }

        public Criteria andExchangeCountIsNull() {
            addCriterion("exchange_count is null");
            return (Criteria) this;
        }

        public Criteria andExchangeCountIsNotNull() {
            addCriterion("exchange_count is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeCountEqualTo(Long value) {
            addCriterion("exchange_count =", value, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountNotEqualTo(Long value) {
            addCriterion("exchange_count <>", value, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountGreaterThan(Long value) {
            addCriterion("exchange_count >", value, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exchange_count >=", value, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountLessThan(Long value) {
            addCriterion("exchange_count <", value, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountLessThanOrEqualTo(Long value) {
            addCriterion("exchange_count <=", value, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountIn(List<Long> values) {
            addCriterion("exchange_count in", values, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountNotIn(List<Long> values) {
            addCriterion("exchange_count not in", values, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountBetween(Long value1, Long value2) {
            addCriterion("exchange_count between", value1, value2, "exchangeCount");
            return (Criteria) this;
        }

        public Criteria andExchangeCountNotBetween(Long value1, Long value2) {
            addCriterion("exchange_count not between", value1, value2, "exchangeCount");
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