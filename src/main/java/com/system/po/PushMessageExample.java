package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class PushMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushMessageExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIsNull() {
            addCriterion("create_code is null");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIsNotNull() {
            addCriterion("create_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCodeEqualTo(String value) {
            addCriterion("create_code =", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotEqualTo(String value) {
            addCriterion("create_code <>", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeGreaterThan(String value) {
            addCriterion("create_code >", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("create_code >=", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLessThan(String value) {
            addCriterion("create_code <", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLessThanOrEqualTo(String value) {
            addCriterion("create_code <=", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLike(String value) {
            addCriterion("create_code like", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotLike(String value) {
            addCriterion("create_code not like", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIn(List<String> values) {
            addCriterion("create_code in", values, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotIn(List<String> values) {
            addCriterion("create_code not in", values, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeBetween(String value1, String value2) {
            addCriterion("create_code between", value1, value2, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotBetween(String value1, String value2) {
            addCriterion("create_code not between", value1, value2, "createCode");
            return (Criteria) this;
        }

        public Criteria andFounderIsNull() {
            addCriterion("founder is null");
            return (Criteria) this;
        }

        public Criteria andFounderIsNotNull() {
            addCriterion("founder is not null");
            return (Criteria) this;
        }

        public Criteria andFounderEqualTo(String value) {
            addCriterion("founder =", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotEqualTo(String value) {
            addCriterion("founder <>", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderGreaterThan(String value) {
            addCriterion("founder >", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderGreaterThanOrEqualTo(String value) {
            addCriterion("founder >=", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderLessThan(String value) {
            addCriterion("founder <", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderLessThanOrEqualTo(String value) {
            addCriterion("founder <=", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderLike(String value) {
            addCriterion("founder like", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotLike(String value) {
            addCriterion("founder not like", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderIn(List<String> values) {
            addCriterion("founder in", values, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotIn(List<String> values) {
            addCriterion("founder not in", values, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderBetween(String value1, String value2) {
            addCriterion("founder between", value1, value2, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotBetween(String value1, String value2) {
            addCriterion("founder not between", value1, value2, "founder");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPushStatusIsNull() {
            addCriterion("push_status is null");
            return (Criteria) this;
        }

        public Criteria andPushStatusIsNotNull() {
            addCriterion("push_status is not null");
            return (Criteria) this;
        }

        public Criteria andPushStatusEqualTo(String value) {
            addCriterion("push_status =", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotEqualTo(String value) {
            addCriterion("push_status <>", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusGreaterThan(String value) {
            addCriterion("push_status >", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusGreaterThanOrEqualTo(String value) {
            addCriterion("push_status >=", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusLessThan(String value) {
            addCriterion("push_status <", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusLessThanOrEqualTo(String value) {
            addCriterion("push_status <=", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusLike(String value) {
            addCriterion("push_status like", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotLike(String value) {
            addCriterion("push_status not like", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusIn(List<String> values) {
            addCriterion("push_status in", values, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotIn(List<String> values) {
            addCriterion("push_status not in", values, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusBetween(String value1, String value2) {
            addCriterion("push_status between", value1, value2, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotBetween(String value1, String value2) {
            addCriterion("push_status not between", value1, value2, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushWayIsNull() {
            addCriterion("push_way is null");
            return (Criteria) this;
        }

        public Criteria andPushWayIsNotNull() {
            addCriterion("push_way is not null");
            return (Criteria) this;
        }

        public Criteria andPushWayEqualTo(String value) {
            addCriterion("push_way =", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayNotEqualTo(String value) {
            addCriterion("push_way <>", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayGreaterThan(String value) {
            addCriterion("push_way >", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayGreaterThanOrEqualTo(String value) {
            addCriterion("push_way >=", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayLessThan(String value) {
            addCriterion("push_way <", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayLessThanOrEqualTo(String value) {
            addCriterion("push_way <=", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayLike(String value) {
            addCriterion("push_way like", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayNotLike(String value) {
            addCriterion("push_way not like", value, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayIn(List<String> values) {
            addCriterion("push_way in", values, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayNotIn(List<String> values) {
            addCriterion("push_way not in", values, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayBetween(String value1, String value2) {
            addCriterion("push_way between", value1, value2, "pushWay");
            return (Criteria) this;
        }

        public Criteria andPushWayNotBetween(String value1, String value2) {
            addCriterion("push_way not between", value1, value2, "pushWay");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("msg_type like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("msg_type not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTargetIsNull() {
            addCriterion("msg_target is null");
            return (Criteria) this;
        }

        public Criteria andMsgTargetIsNotNull() {
            addCriterion("msg_target is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTargetEqualTo(String value) {
            addCriterion("msg_target =", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetNotEqualTo(String value) {
            addCriterion("msg_target <>", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetGreaterThan(String value) {
            addCriterion("msg_target >", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetGreaterThanOrEqualTo(String value) {
            addCriterion("msg_target >=", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetLessThan(String value) {
            addCriterion("msg_target <", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetLessThanOrEqualTo(String value) {
            addCriterion("msg_target <=", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetLike(String value) {
            addCriterion("msg_target like", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetNotLike(String value) {
            addCriterion("msg_target not like", value, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetIn(List<String> values) {
            addCriterion("msg_target in", values, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetNotIn(List<String> values) {
            addCriterion("msg_target not in", values, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetBetween(String value1, String value2) {
            addCriterion("msg_target between", value1, value2, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgTargetNotBetween(String value1, String value2) {
            addCriterion("msg_target not between", value1, value2, "msgTarget");
            return (Criteria) this;
        }

        public Criteria andMsgContent1IsNull() {
            addCriterion("msg_content_1 is null");
            return (Criteria) this;
        }

        public Criteria andMsgContent1IsNotNull() {
            addCriterion("msg_content_1 is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContent1EqualTo(String value) {
            addCriterion("msg_content_1 =", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1NotEqualTo(String value) {
            addCriterion("msg_content_1 <>", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1GreaterThan(String value) {
            addCriterion("msg_content_1 >", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1GreaterThanOrEqualTo(String value) {
            addCriterion("msg_content_1 >=", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1LessThan(String value) {
            addCriterion("msg_content_1 <", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1LessThanOrEqualTo(String value) {
            addCriterion("msg_content_1 <=", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1Like(String value) {
            addCriterion("msg_content_1 like", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1NotLike(String value) {
            addCriterion("msg_content_1 not like", value, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1In(List<String> values) {
            addCriterion("msg_content_1 in", values, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1NotIn(List<String> values) {
            addCriterion("msg_content_1 not in", values, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1Between(String value1, String value2) {
            addCriterion("msg_content_1 between", value1, value2, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent1NotBetween(String value1, String value2) {
            addCriterion("msg_content_1 not between", value1, value2, "msgContent1");
            return (Criteria) this;
        }

        public Criteria andMsgContent2IsNull() {
            addCriterion("msg_content_2 is null");
            return (Criteria) this;
        }

        public Criteria andMsgContent2IsNotNull() {
            addCriterion("msg_content_2 is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContent2EqualTo(String value) {
            addCriterion("msg_content_2 =", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2NotEqualTo(String value) {
            addCriterion("msg_content_2 <>", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2GreaterThan(String value) {
            addCriterion("msg_content_2 >", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2GreaterThanOrEqualTo(String value) {
            addCriterion("msg_content_2 >=", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2LessThan(String value) {
            addCriterion("msg_content_2 <", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2LessThanOrEqualTo(String value) {
            addCriterion("msg_content_2 <=", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2Like(String value) {
            addCriterion("msg_content_2 like", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2NotLike(String value) {
            addCriterion("msg_content_2 not like", value, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2In(List<String> values) {
            addCriterion("msg_content_2 in", values, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2NotIn(List<String> values) {
            addCriterion("msg_content_2 not in", values, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2Between(String value1, String value2) {
            addCriterion("msg_content_2 between", value1, value2, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent2NotBetween(String value1, String value2) {
            addCriterion("msg_content_2 not between", value1, value2, "msgContent2");
            return (Criteria) this;
        }

        public Criteria andMsgContent3IsNull() {
            addCriterion("msg_content_3 is null");
            return (Criteria) this;
        }

        public Criteria andMsgContent3IsNotNull() {
            addCriterion("msg_content_3 is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContent3EqualTo(String value) {
            addCriterion("msg_content_3 =", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3NotEqualTo(String value) {
            addCriterion("msg_content_3 <>", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3GreaterThan(String value) {
            addCriterion("msg_content_3 >", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3GreaterThanOrEqualTo(String value) {
            addCriterion("msg_content_3 >=", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3LessThan(String value) {
            addCriterion("msg_content_3 <", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3LessThanOrEqualTo(String value) {
            addCriterion("msg_content_3 <=", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3Like(String value) {
            addCriterion("msg_content_3 like", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3NotLike(String value) {
            addCriterion("msg_content_3 not like", value, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3In(List<String> values) {
            addCriterion("msg_content_3 in", values, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3NotIn(List<String> values) {
            addCriterion("msg_content_3 not in", values, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3Between(String value1, String value2) {
            addCriterion("msg_content_3 between", value1, value2, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andMsgContent3NotBetween(String value1, String value2) {
            addCriterion("msg_content_3 not between", value1, value2, "msgContent3");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(String value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(String value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(String value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(String value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(String value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(String value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLike(String value) {
            addCriterion("push_time like", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotLike(String value) {
            addCriterion("push_time not like", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<String> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<String> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(String value1, String value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(String value1, String value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
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