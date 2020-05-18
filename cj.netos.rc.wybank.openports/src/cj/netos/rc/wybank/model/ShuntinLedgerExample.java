package cj.netos.rc.wybank.model;

import java.util.ArrayList;
import java.util.List;

public class ShuntinLedgerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public ShuntinLedgerExample() {
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

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNull() {
            addCriterion("participant is null");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNotNull() {
            addCriterion("participant is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantEqualTo(String value) {
            addCriterion("participant =", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotEqualTo(String value) {
            addCriterion("participant <>", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThan(String value) {
            addCriterion("participant >", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThanOrEqualTo(String value) {
            addCriterion("participant >=", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThan(String value) {
            addCriterion("participant <", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThanOrEqualTo(String value) {
            addCriterion("participant <=", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLike(String value) {
            addCriterion("participant like", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotLike(String value) {
            addCriterion("participant not like", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantIn(List<String> values) {
            addCriterion("participant in", values, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotIn(List<String> values) {
            addCriterion("participant not in", values, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantBetween(String value1, String value2) {
            addCriterion("participant between", value1, value2, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotBetween(String value1, String value2) {
            addCriterion("participant not between", value1, value2, "participant");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRefsnIsNull() {
            addCriterion("refsn is null");
            return (Criteria) this;
        }

        public Criteria andRefsnIsNotNull() {
            addCriterion("refsn is not null");
            return (Criteria) this;
        }

        public Criteria andRefsnEqualTo(String value) {
            addCriterion("refsn =", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnNotEqualTo(String value) {
            addCriterion("refsn <>", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnGreaterThan(String value) {
            addCriterion("refsn >", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnGreaterThanOrEqualTo(String value) {
            addCriterion("refsn >=", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnLessThan(String value) {
            addCriterion("refsn <", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnLessThanOrEqualTo(String value) {
            addCriterion("refsn <=", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnLike(String value) {
            addCriterion("refsn like", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnNotLike(String value) {
            addCriterion("refsn not like", value, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnIn(List<String> values) {
            addCriterion("refsn in", values, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnNotIn(List<String> values) {
            addCriterion("refsn not in", values, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnBetween(String value1, String value2) {
            addCriterion("refsn between", value1, value2, "refsn");
            return (Criteria) this;
        }

        public Criteria andRefsnNotBetween(String value1, String value2) {
            addCriterion("refsn not between", value1, value2, "refsn");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andShunterIsNull() {
            addCriterion("shunter is null");
            return (Criteria) this;
        }

        public Criteria andShunterIsNotNull() {
            addCriterion("shunter is not null");
            return (Criteria) this;
        }

        public Criteria andShunterEqualTo(String value) {
            addCriterion("shunter =", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterNotEqualTo(String value) {
            addCriterion("shunter <>", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterGreaterThan(String value) {
            addCriterion("shunter >", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterGreaterThanOrEqualTo(String value) {
            addCriterion("shunter >=", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterLessThan(String value) {
            addCriterion("shunter <", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterLessThanOrEqualTo(String value) {
            addCriterion("shunter <=", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterLike(String value) {
            addCriterion("shunter like", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterNotLike(String value) {
            addCriterion("shunter not like", value, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterIn(List<String> values) {
            addCriterion("shunter in", values, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterNotIn(List<String> values) {
            addCriterion("shunter not in", values, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterBetween(String value1, String value2) {
            addCriterion("shunter between", value1, value2, "shunter");
            return (Criteria) this;
        }

        public Criteria andShunterNotBetween(String value1, String value2) {
            addCriterion("shunter not between", value1, value2, "shunter");
            return (Criteria) this;
        }

        public Criteria andWorkdayIsNull() {
            addCriterion("workday is null");
            return (Criteria) this;
        }

        public Criteria andWorkdayIsNotNull() {
            addCriterion("workday is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdayEqualTo(String value) {
            addCriterion("workday =", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotEqualTo(String value) {
            addCriterion("workday <>", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayGreaterThan(String value) {
            addCriterion("workday >", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayGreaterThanOrEqualTo(String value) {
            addCriterion("workday >=", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLessThan(String value) {
            addCriterion("workday <", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLessThanOrEqualTo(String value) {
            addCriterion("workday <=", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayLike(String value) {
            addCriterion("workday like", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotLike(String value) {
            addCriterion("workday not like", value, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayIn(List<String> values) {
            addCriterion("workday in", values, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotIn(List<String> values) {
            addCriterion("workday not in", values, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayBetween(String value1, String value2) {
            addCriterion("workday between", value1, value2, "workday");
            return (Criteria) this;
        }

        public Criteria andWorkdayNotBetween(String value1, String value2) {
            addCriterion("workday not between", value1, value2, "workday");
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