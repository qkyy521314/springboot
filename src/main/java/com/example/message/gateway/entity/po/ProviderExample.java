package com.example.message.gateway.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

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

        public Criteria andProviderIDIsNull() {
            addCriterion("providerID is null");
            return (Criteria) this;
        }

        public Criteria andProviderIDIsNotNull() {
            addCriterion("providerID is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIDEqualTo(Integer value) {
            addCriterion("providerID =", value, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDNotEqualTo(Integer value) {
            addCriterion("providerID <>", value, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDGreaterThan(Integer value) {
            addCriterion("providerID >", value, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("providerID >=", value, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDLessThan(Integer value) {
            addCriterion("providerID <", value, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDLessThanOrEqualTo(Integer value) {
            addCriterion("providerID <=", value, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDIn(List<Integer> values) {
            addCriterion("providerID in", values, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDNotIn(List<Integer> values) {
            addCriterion("providerID not in", values, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDBetween(Integer value1, Integer value2) {
            addCriterion("providerID between", value1, value2, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderIDNotBetween(Integer value1, Integer value2) {
            addCriterion("providerID not between", value1, value2, "providerID");
            return (Criteria) this;
        }

        public Criteria andProviderSignIsNull() {
            addCriterion("providerSign is null");
            return (Criteria) this;
        }

        public Criteria andProviderSignIsNotNull() {
            addCriterion("providerSign is not null");
            return (Criteria) this;
        }

        public Criteria andProviderSignEqualTo(String value) {
            addCriterion("providerSign =", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignNotEqualTo(String value) {
            addCriterion("providerSign <>", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignGreaterThan(String value) {
            addCriterion("providerSign >", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignGreaterThanOrEqualTo(String value) {
            addCriterion("providerSign >=", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignLessThan(String value) {
            addCriterion("providerSign <", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignLessThanOrEqualTo(String value) {
            addCriterion("providerSign <=", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignLike(String value) {
            addCriterion("providerSign like", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignNotLike(String value) {
            addCriterion("providerSign not like", value, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignIn(List<String> values) {
            addCriterion("providerSign in", values, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignNotIn(List<String> values) {
            addCriterion("providerSign not in", values, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignBetween(String value1, String value2) {
            addCriterion("providerSign between", value1, value2, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderSignNotBetween(String value1, String value2) {
            addCriterion("providerSign not between", value1, value2, "providerSign");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNull() {
            addCriterion("providerName is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("providerName is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("providerName =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("providerName <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("providerName >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("providerName >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("providerName <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("providerName <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("providerName like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("providerName not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("providerName in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("providerName not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("providerName between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("providerName not between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andImplIsNull() {
            addCriterion("impl is null");
            return (Criteria) this;
        }

        public Criteria andImplIsNotNull() {
            addCriterion("impl is not null");
            return (Criteria) this;
        }

        public Criteria andImplEqualTo(String value) {
            addCriterion("impl =", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplNotEqualTo(String value) {
            addCriterion("impl <>", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplGreaterThan(String value) {
            addCriterion("impl >", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplGreaterThanOrEqualTo(String value) {
            addCriterion("impl >=", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplLessThan(String value) {
            addCriterion("impl <", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplLessThanOrEqualTo(String value) {
            addCriterion("impl <=", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplLike(String value) {
            addCriterion("impl like", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplNotLike(String value) {
            addCriterion("impl not like", value, "impl");
            return (Criteria) this;
        }

        public Criteria andImplIn(List<String> values) {
            addCriterion("impl in", values, "impl");
            return (Criteria) this;
        }

        public Criteria andImplNotIn(List<String> values) {
            addCriterion("impl not in", values, "impl");
            return (Criteria) this;
        }

        public Criteria andImplBetween(String value1, String value2) {
            addCriterion("impl between", value1, value2, "impl");
            return (Criteria) this;
        }

        public Criteria andImplNotBetween(String value1, String value2) {
            addCriterion("impl not between", value1, value2, "impl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIsNull() {
            addCriterion("alarmValue is null");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIsNotNull() {
            addCriterion("alarmValue is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmValueEqualTo(Double value) {
            addCriterion("alarmValue =", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotEqualTo(Double value) {
            addCriterion("alarmValue <>", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueGreaterThan(Double value) {
            addCriterion("alarmValue >", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueGreaterThanOrEqualTo(Double value) {
            addCriterion("alarmValue >=", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLessThan(Double value) {
            addCriterion("alarmValue <", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLessThanOrEqualTo(Double value) {
            addCriterion("alarmValue <=", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIn(List<Double> values) {
            addCriterion("alarmValue in", values, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotIn(List<Double> values) {
            addCriterion("alarmValue not in", values, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueBetween(Double value1, Double value2) {
            addCriterion("alarmValue between", value1, value2, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotBetween(Double value1, Double value2) {
            addCriterion("alarmValue not between", value1, value2, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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