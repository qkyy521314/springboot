package com.example.message.gateway.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMsgIDIsNull() {
            addCriterion("msgID is null");
            return (Criteria) this;
        }

        public Criteria andMsgIDIsNotNull() {
            addCriterion("msgID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIDEqualTo(String value) {
            addCriterion("msgID =", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDNotEqualTo(String value) {
            addCriterion("msgID <>", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDGreaterThan(String value) {
            addCriterion("msgID >", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDGreaterThanOrEqualTo(String value) {
            addCriterion("msgID >=", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDLessThan(String value) {
            addCriterion("msgID <", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDLessThanOrEqualTo(String value) {
            addCriterion("msgID <=", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDLike(String value) {
            addCriterion("msgID like", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDNotLike(String value) {
            addCriterion("msgID not like", value, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDIn(List<String> values) {
            addCriterion("msgID in", values, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDNotIn(List<String> values) {
            addCriterion("msgID not in", values, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDBetween(String value1, String value2) {
            addCriterion("msgID between", value1, value2, "msgID");
            return (Criteria) this;
        }

        public Criteria andMsgIDNotBetween(String value1, String value2) {
            addCriterion("msgID not between", value1, value2, "msgID");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
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

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("sendStatus is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("sendStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(Short value) {
            addCriterion("sendStatus =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(Short value) {
            addCriterion("sendStatus <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(Short value) {
            addCriterion("sendStatus >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sendStatus >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(Short value) {
            addCriterion("sendStatus <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(Short value) {
            addCriterion("sendStatus <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<Short> values) {
            addCriterion("sendStatus in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<Short> values) {
            addCriterion("sendStatus not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(Short value1, Short value2) {
            addCriterion("sendStatus between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(Short value1, Short value2) {
            addCriterion("sendStatus not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusIsNull() {
            addCriterion("providerStatus is null");
            return (Criteria) this;
        }

        public Criteria andProviderStatusIsNotNull() {
            addCriterion("providerStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProviderStatusEqualTo(Short value) {
            addCriterion("providerStatus =", value, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusNotEqualTo(Short value) {
            addCriterion("providerStatus <>", value, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusGreaterThan(Short value) {
            addCriterion("providerStatus >", value, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("providerStatus >=", value, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusLessThan(Short value) {
            addCriterion("providerStatus <", value, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusLessThanOrEqualTo(Short value) {
            addCriterion("providerStatus <=", value, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusIn(List<Short> values) {
            addCriterion("providerStatus in", values, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusNotIn(List<Short> values) {
            addCriterion("providerStatus not in", values, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusBetween(Short value1, Short value2) {
            addCriterion("providerStatus between", value1, value2, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andProviderStatusNotBetween(Short value1, Short value2) {
            addCriterion("providerStatus not between", value1, value2, "providerStatus");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNull() {
            addCriterion("sendCount is null");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNotNull() {
            addCriterion("sendCount is not null");
            return (Criteria) this;
        }

        public Criteria andSendCountEqualTo(Integer value) {
            addCriterion("sendCount =", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotEqualTo(Integer value) {
            addCriterion("sendCount <>", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThan(Integer value) {
            addCriterion("sendCount >", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendCount >=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThan(Integer value) {
            addCriterion("sendCount <", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThanOrEqualTo(Integer value) {
            addCriterion("sendCount <=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountIn(List<Integer> values) {
            addCriterion("sendCount in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotIn(List<Integer> values) {
            addCriterion("sendCount not in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountBetween(Integer value1, Integer value2) {
            addCriterion("sendCount between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sendCount not between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSuccessRateIsNull() {
            addCriterion("successRate is null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateIsNotNull() {
            addCriterion("successRate is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateEqualTo(Double value) {
            addCriterion("successRate =", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateNotEqualTo(Double value) {
            addCriterion("successRate <>", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateGreaterThan(Double value) {
            addCriterion("successRate >", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateGreaterThanOrEqualTo(Double value) {
            addCriterion("successRate >=", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateLessThan(Double value) {
            addCriterion("successRate <", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateLessThanOrEqualTo(Double value) {
            addCriterion("successRate <=", value, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateIn(List<Double> values) {
            addCriterion("successRate in", values, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateNotIn(List<Double> values) {
            addCriterion("successRate not in", values, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateBetween(Double value1, Double value2) {
            addCriterion("successRate between", value1, value2, "successRate");
            return (Criteria) this;
        }

        public Criteria andSuccessRateNotBetween(Double value1, Double value2) {
            addCriterion("successRate not between", value1, value2, "successRate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReturnContentIsNull() {
            addCriterion("returnContent is null");
            return (Criteria) this;
        }

        public Criteria andReturnContentIsNotNull() {
            addCriterion("returnContent is not null");
            return (Criteria) this;
        }

        public Criteria andReturnContentEqualTo(String value) {
            addCriterion("returnContent =", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotEqualTo(String value) {
            addCriterion("returnContent <>", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentGreaterThan(String value) {
            addCriterion("returnContent >", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentGreaterThanOrEqualTo(String value) {
            addCriterion("returnContent >=", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLessThan(String value) {
            addCriterion("returnContent <", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLessThanOrEqualTo(String value) {
            addCriterion("returnContent <=", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLike(String value) {
            addCriterion("returnContent like", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotLike(String value) {
            addCriterion("returnContent not like", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentIn(List<String> values) {
            addCriterion("returnContent in", values, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotIn(List<String> values) {
            addCriterion("returnContent not in", values, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentBetween(String value1, String value2) {
            addCriterion("returnContent between", value1, value2, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotBetween(String value1, String value2) {
            addCriterion("returnContent not between", value1, value2, "returnContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentIsNull() {
            addCriterion("callbackContent is null");
            return (Criteria) this;
        }

        public Criteria andCallbackContentIsNotNull() {
            addCriterion("callbackContent is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackContentEqualTo(String value) {
            addCriterion("callbackContent =", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentNotEqualTo(String value) {
            addCriterion("callbackContent <>", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentGreaterThan(String value) {
            addCriterion("callbackContent >", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentGreaterThanOrEqualTo(String value) {
            addCriterion("callbackContent >=", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentLessThan(String value) {
            addCriterion("callbackContent <", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentLessThanOrEqualTo(String value) {
            addCriterion("callbackContent <=", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentLike(String value) {
            addCriterion("callbackContent like", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentNotLike(String value) {
            addCriterion("callbackContent not like", value, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentIn(List<String> values) {
            addCriterion("callbackContent in", values, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentNotIn(List<String> values) {
            addCriterion("callbackContent not in", values, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentBetween(String value1, String value2) {
            addCriterion("callbackContent between", value1, value2, "callbackContent");
            return (Criteria) this;
        }

        public Criteria andCallbackContentNotBetween(String value1, String value2) {
            addCriterion("callbackContent not between", value1, value2, "callbackContent");
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