package com.example.message.gateway.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationExample() {
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

        public Criteria andAppIDIsNull() {
            addCriterion("appID is null");
            return (Criteria) this;
        }

        public Criteria andAppIDIsNotNull() {
            addCriterion("appID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIDEqualTo(Integer value) {
            addCriterion("appID =", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotEqualTo(Integer value) {
            addCriterion("appID <>", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDGreaterThan(Integer value) {
            addCriterion("appID >", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("appID >=", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDLessThan(Integer value) {
            addCriterion("appID <", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDLessThanOrEqualTo(Integer value) {
            addCriterion("appID <=", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDIn(List<Integer> values) {
            addCriterion("appID in", values, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotIn(List<Integer> values) {
            addCriterion("appID not in", values, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDBetween(Integer value1, Integer value2) {
            addCriterion("appID between", value1, value2, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotBetween(Integer value1, Integer value2) {
            addCriterion("appID not between", value1, value2, "appID");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("appKey is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("appKey is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("appKey =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("appKey <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("appKey >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("appKey >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("appKey <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("appKey <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("appKey like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("appKey not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("appKey in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("appKey not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("appKey between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("appKey not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("appName is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("appName is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("appName =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("appName <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("appName >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("appName >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("appName <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("appName <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("appName like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("appName not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("appName in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("appName not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("appName between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("appName not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNull() {
            addCriterion("appStatus is null");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNotNull() {
            addCriterion("appStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAppStatusEqualTo(Short value) {
            addCriterion("appStatus =", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotEqualTo(Short value) {
            addCriterion("appStatus <>", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThan(Short value) {
            addCriterion("appStatus >", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("appStatus >=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThan(Short value) {
            addCriterion("appStatus <", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThanOrEqualTo(Short value) {
            addCriterion("appStatus <=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusIn(List<Short> values) {
            addCriterion("appStatus in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotIn(List<Short> values) {
            addCriterion("appStatus not in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusBetween(Short value1, Short value2) {
            addCriterion("appStatus between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotBetween(Short value1, Short value2) {
            addCriterion("appStatus not between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("sendType is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("sendType is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Short value) {
            addCriterion("sendType =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Short value) {
            addCriterion("sendType <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Short value) {
            addCriterion("sendType >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("sendType >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Short value) {
            addCriterion("sendType <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Short value) {
            addCriterion("sendType <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Short> values) {
            addCriterion("sendType in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Short> values) {
            addCriterion("sendType not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Short value1, Short value2) {
            addCriterion("sendType between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Short value1, Short value2) {
            addCriterion("sendType not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andTemplateSignIsNull() {
            addCriterion("templateSign is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSignIsNotNull() {
            addCriterion("templateSign is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSignEqualTo(String value) {
            addCriterion("templateSign =", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotEqualTo(String value) {
            addCriterion("templateSign <>", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignGreaterThan(String value) {
            addCriterion("templateSign >", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignGreaterThanOrEqualTo(String value) {
            addCriterion("templateSign >=", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignLessThan(String value) {
            addCriterion("templateSign <", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignLessThanOrEqualTo(String value) {
            addCriterion("templateSign <=", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignLike(String value) {
            addCriterion("templateSign like", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotLike(String value) {
            addCriterion("templateSign not like", value, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignIn(List<String> values) {
            addCriterion("templateSign in", values, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotIn(List<String> values) {
            addCriterion("templateSign not in", values, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignBetween(String value1, String value2) {
            addCriterion("templateSign between", value1, value2, "templateSign");
            return (Criteria) this;
        }

        public Criteria andTemplateSignNotBetween(String value1, String value2) {
            addCriterion("templateSign not between", value1, value2, "templateSign");
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

        public Criteria andSendTimeStatusIsNull() {
            addCriterion("sendTimeStatus is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusIsNotNull() {
            addCriterion("sendTimeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusEqualTo(Short value) {
            addCriterion("sendTimeStatus =", value, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusNotEqualTo(Short value) {
            addCriterion("sendTimeStatus <>", value, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusGreaterThan(Short value) {
            addCriterion("sendTimeStatus >", value, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sendTimeStatus >=", value, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusLessThan(Short value) {
            addCriterion("sendTimeStatus <", value, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusLessThanOrEqualTo(Short value) {
            addCriterion("sendTimeStatus <=", value, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusIn(List<Short> values) {
            addCriterion("sendTimeStatus in", values, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusNotIn(List<Short> values) {
            addCriterion("sendTimeStatus not in", values, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusBetween(Short value1, Short value2) {
            addCriterion("sendTimeStatus between", value1, value2, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeStatusNotBetween(Short value1, Short value2) {
            addCriterion("sendTimeStatus not between", value1, value2, "sendTimeStatus");
            return (Criteria) this;
        }

        public Criteria andSendStimeIsNull() {
            addCriterion("sendStime is null");
            return (Criteria) this;
        }

        public Criteria andSendStimeIsNotNull() {
            addCriterion("sendStime is not null");
            return (Criteria) this;
        }

        public Criteria andSendStimeEqualTo(String value) {
            addCriterion("sendStime =", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeNotEqualTo(String value) {
            addCriterion("sendStime <>", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeGreaterThan(String value) {
            addCriterion("sendStime >", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeGreaterThanOrEqualTo(String value) {
            addCriterion("sendStime >=", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeLessThan(String value) {
            addCriterion("sendStime <", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeLessThanOrEqualTo(String value) {
            addCriterion("sendStime <=", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeLike(String value) {
            addCriterion("sendStime like", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeNotLike(String value) {
            addCriterion("sendStime not like", value, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeIn(List<String> values) {
            addCriterion("sendStime in", values, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeNotIn(List<String> values) {
            addCriterion("sendStime not in", values, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeBetween(String value1, String value2) {
            addCriterion("sendStime between", value1, value2, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendStimeNotBetween(String value1, String value2) {
            addCriterion("sendStime not between", value1, value2, "sendStime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeIsNull() {
            addCriterion("sendEtime is null");
            return (Criteria) this;
        }

        public Criteria andSendEtimeIsNotNull() {
            addCriterion("sendEtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendEtimeEqualTo(String value) {
            addCriterion("sendEtime =", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeNotEqualTo(String value) {
            addCriterion("sendEtime <>", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeGreaterThan(String value) {
            addCriterion("sendEtime >", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeGreaterThanOrEqualTo(String value) {
            addCriterion("sendEtime >=", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeLessThan(String value) {
            addCriterion("sendEtime <", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeLessThanOrEqualTo(String value) {
            addCriterion("sendEtime <=", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeLike(String value) {
            addCriterion("sendEtime like", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeNotLike(String value) {
            addCriterion("sendEtime not like", value, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeIn(List<String> values) {
            addCriterion("sendEtime in", values, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeNotIn(List<String> values) {
            addCriterion("sendEtime not in", values, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeBetween(String value1, String value2) {
            addCriterion("sendEtime between", value1, value2, "sendEtime");
            return (Criteria) this;
        }

        public Criteria andSendEtimeNotBetween(String value1, String value2) {
            addCriterion("sendEtime not between", value1, value2, "sendEtime");
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

        public Criteria andBlacklistStatusIsNull() {
            addCriterion("blacklistStatus is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusIsNotNull() {
            addCriterion("blacklistStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusEqualTo(Short value) {
            addCriterion("blacklistStatus =", value, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusNotEqualTo(Short value) {
            addCriterion("blacklistStatus <>", value, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusGreaterThan(Short value) {
            addCriterion("blacklistStatus >", value, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("blacklistStatus >=", value, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusLessThan(Short value) {
            addCriterion("blacklistStatus <", value, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusLessThanOrEqualTo(Short value) {
            addCriterion("blacklistStatus <=", value, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusIn(List<Short> values) {
            addCriterion("blacklistStatus in", values, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusNotIn(List<Short> values) {
            addCriterion("blacklistStatus not in", values, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusBetween(Short value1, Short value2) {
            addCriterion("blacklistStatus between", value1, value2, "blacklistStatus");
            return (Criteria) this;
        }

        public Criteria andBlacklistStatusNotBetween(Short value1, Short value2) {
            addCriterion("blacklistStatus not between", value1, value2, "blacklistStatus");
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