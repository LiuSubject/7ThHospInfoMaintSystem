package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class ComputerProblemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComputerProblemsExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDepartcodeIsNull() {
            addCriterion("departCode is null");
            return (Criteria) this;
        }

        public Criteria andDepartcodeIsNotNull() {
            addCriterion("departCode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartcodeEqualTo(String value) {
            addCriterion("departCode =", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeNotEqualTo(String value) {
            addCriterion("departCode <>", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeGreaterThan(String value) {
            addCriterion("departCode >", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departCode >=", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeLessThan(String value) {
            addCriterion("departCode <", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeLessThanOrEqualTo(String value) {
            addCriterion("departCode <=", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeLike(String value) {
            addCriterion("departCode like", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeNotLike(String value) {
            addCriterion("departCode not like", value, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeIn(List<String> values) {
            addCriterion("departCode in", values, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeNotIn(List<String> values) {
            addCriterion("departCode not in", values, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeBetween(String value1, String value2) {
            addCriterion("departCode between", value1, value2, "departcode");
            return (Criteria) this;
        }

        public Criteria andDepartcodeNotBetween(String value1, String value2) {
            addCriterion("departCode not between", value1, value2, "departcode");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryIsNull() {
            addCriterion("type_secondary is null");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryIsNotNull() {
            addCriterion("type_secondary is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryEqualTo(Integer value) {
            addCriterion("type_secondary =", value, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryNotEqualTo(Integer value) {
            addCriterion("type_secondary <>", value, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryGreaterThan(Integer value) {
            addCriterion("type_secondary >", value, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_secondary >=", value, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryLessThan(Integer value) {
            addCriterion("type_secondary <", value, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryLessThanOrEqualTo(Integer value) {
            addCriterion("type_secondary <=", value, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryIn(List<Integer> values) {
            addCriterion("type_secondary in", values, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryNotIn(List<Integer> values) {
            addCriterion("type_secondary not in", values, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryBetween(Integer value1, Integer value2) {
            addCriterion("type_secondary between", value1, value2, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andTypeSecondaryNotBetween(Integer value1, Integer value2) {
            addCriterion("type_secondary not between", value1, value2, "typeSecondary");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andRebackIsNull() {
            addCriterion("reback is null");
            return (Criteria) this;
        }

        public Criteria andRebackIsNotNull() {
            addCriterion("reback is not null");
            return (Criteria) this;
        }

        public Criteria andRebackEqualTo(String value) {
            addCriterion("reback =", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackNotEqualTo(String value) {
            addCriterion("reback <>", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackGreaterThan(String value) {
            addCriterion("reback >", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackGreaterThanOrEqualTo(String value) {
            addCriterion("reback >=", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackLessThan(String value) {
            addCriterion("reback <", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackLessThanOrEqualTo(String value) {
            addCriterion("reback <=", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackLike(String value) {
            addCriterion("reback like", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackNotLike(String value) {
            addCriterion("reback not like", value, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackIn(List<String> values) {
            addCriterion("reback in", values, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackNotIn(List<String> values) {
            addCriterion("reback not in", values, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackBetween(String value1, String value2) {
            addCriterion("reback between", value1, value2, "reback");
            return (Criteria) this;
        }

        public Criteria andRebackNotBetween(String value1, String value2) {
            addCriterion("reback not between", value1, value2, "reback");
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

        public Criteria andFeedbackContent1IsNull() {
            addCriterion("feedback_content_1 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1IsNotNull() {
            addCriterion("feedback_content_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1EqualTo(String value) {
            addCriterion("feedback_content_1 =", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1NotEqualTo(String value) {
            addCriterion("feedback_content_1 <>", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1GreaterThan(String value) {
            addCriterion("feedback_content_1 >", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content_1 >=", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1LessThan(String value) {
            addCriterion("feedback_content_1 <", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1LessThanOrEqualTo(String value) {
            addCriterion("feedback_content_1 <=", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1Like(String value) {
            addCriterion("feedback_content_1 like", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1NotLike(String value) {
            addCriterion("feedback_content_1 not like", value, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1In(List<String> values) {
            addCriterion("feedback_content_1 in", values, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1NotIn(List<String> values) {
            addCriterion("feedback_content_1 not in", values, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1Between(String value1, String value2) {
            addCriterion("feedback_content_1 between", value1, value2, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent1NotBetween(String value1, String value2) {
            addCriterion("feedback_content_1 not between", value1, value2, "feedbackContent1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1IsNull() {
            addCriterion("feedback_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1IsNotNull() {
            addCriterion("feedback_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1EqualTo(String value) {
            addCriterion("feedback_id_1 =", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1NotEqualTo(String value) {
            addCriterion("feedback_id_1 <>", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1GreaterThan(String value) {
            addCriterion("feedback_id_1 >", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_id_1 >=", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1LessThan(String value) {
            addCriterion("feedback_id_1 <", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1LessThanOrEqualTo(String value) {
            addCriterion("feedback_id_1 <=", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1Like(String value) {
            addCriterion("feedback_id_1 like", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1NotLike(String value) {
            addCriterion("feedback_id_1 not like", value, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1In(List<String> values) {
            addCriterion("feedback_id_1 in", values, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1NotIn(List<String> values) {
            addCriterion("feedback_id_1 not in", values, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1Between(String value1, String value2) {
            addCriterion("feedback_id_1 between", value1, value2, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackId1NotBetween(String value1, String value2) {
            addCriterion("feedback_id_1 not between", value1, value2, "feedbackId1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1IsNull() {
            addCriterion("feedback_name_1 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1IsNotNull() {
            addCriterion("feedback_name_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1EqualTo(String value) {
            addCriterion("feedback_name_1 =", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1NotEqualTo(String value) {
            addCriterion("feedback_name_1 <>", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1GreaterThan(String value) {
            addCriterion("feedback_name_1 >", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_name_1 >=", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1LessThan(String value) {
            addCriterion("feedback_name_1 <", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1LessThanOrEqualTo(String value) {
            addCriterion("feedback_name_1 <=", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1Like(String value) {
            addCriterion("feedback_name_1 like", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1NotLike(String value) {
            addCriterion("feedback_name_1 not like", value, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1In(List<String> values) {
            addCriterion("feedback_name_1 in", values, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1NotIn(List<String> values) {
            addCriterion("feedback_name_1 not in", values, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1Between(String value1, String value2) {
            addCriterion("feedback_name_1 between", value1, value2, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackName1NotBetween(String value1, String value2) {
            addCriterion("feedback_name_1 not between", value1, value2, "feedbackName1");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2IsNull() {
            addCriterion("feedback_content_2 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2IsNotNull() {
            addCriterion("feedback_content_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2EqualTo(String value) {
            addCriterion("feedback_content_2 =", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2NotEqualTo(String value) {
            addCriterion("feedback_content_2 <>", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2GreaterThan(String value) {
            addCriterion("feedback_content_2 >", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content_2 >=", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2LessThan(String value) {
            addCriterion("feedback_content_2 <", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2LessThanOrEqualTo(String value) {
            addCriterion("feedback_content_2 <=", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2Like(String value) {
            addCriterion("feedback_content_2 like", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2NotLike(String value) {
            addCriterion("feedback_content_2 not like", value, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2In(List<String> values) {
            addCriterion("feedback_content_2 in", values, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2NotIn(List<String> values) {
            addCriterion("feedback_content_2 not in", values, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2Between(String value1, String value2) {
            addCriterion("feedback_content_2 between", value1, value2, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent2NotBetween(String value1, String value2) {
            addCriterion("feedback_content_2 not between", value1, value2, "feedbackContent2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2IsNull() {
            addCriterion("feedback_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2IsNotNull() {
            addCriterion("feedback_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2EqualTo(String value) {
            addCriterion("feedback_id_2 =", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2NotEqualTo(String value) {
            addCriterion("feedback_id_2 <>", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2GreaterThan(String value) {
            addCriterion("feedback_id_2 >", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_id_2 >=", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2LessThan(String value) {
            addCriterion("feedback_id_2 <", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2LessThanOrEqualTo(String value) {
            addCriterion("feedback_id_2 <=", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2Like(String value) {
            addCriterion("feedback_id_2 like", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2NotLike(String value) {
            addCriterion("feedback_id_2 not like", value, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2In(List<String> values) {
            addCriterion("feedback_id_2 in", values, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2NotIn(List<String> values) {
            addCriterion("feedback_id_2 not in", values, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2Between(String value1, String value2) {
            addCriterion("feedback_id_2 between", value1, value2, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackId2NotBetween(String value1, String value2) {
            addCriterion("feedback_id_2 not between", value1, value2, "feedbackId2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2IsNull() {
            addCriterion("feedback_name_2 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2IsNotNull() {
            addCriterion("feedback_name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2EqualTo(String value) {
            addCriterion("feedback_name_2 =", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2NotEqualTo(String value) {
            addCriterion("feedback_name_2 <>", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2GreaterThan(String value) {
            addCriterion("feedback_name_2 >", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_name_2 >=", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2LessThan(String value) {
            addCriterion("feedback_name_2 <", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2LessThanOrEqualTo(String value) {
            addCriterion("feedback_name_2 <=", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2Like(String value) {
            addCriterion("feedback_name_2 like", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2NotLike(String value) {
            addCriterion("feedback_name_2 not like", value, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2In(List<String> values) {
            addCriterion("feedback_name_2 in", values, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2NotIn(List<String> values) {
            addCriterion("feedback_name_2 not in", values, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2Between(String value1, String value2) {
            addCriterion("feedback_name_2 between", value1, value2, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackName2NotBetween(String value1, String value2) {
            addCriterion("feedback_name_2 not between", value1, value2, "feedbackName2");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3IsNull() {
            addCriterion("feedback_content_3 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3IsNotNull() {
            addCriterion("feedback_content_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3EqualTo(String value) {
            addCriterion("feedback_content_3 =", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3NotEqualTo(String value) {
            addCriterion("feedback_content_3 <>", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3GreaterThan(String value) {
            addCriterion("feedback_content_3 >", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content_3 >=", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3LessThan(String value) {
            addCriterion("feedback_content_3 <", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3LessThanOrEqualTo(String value) {
            addCriterion("feedback_content_3 <=", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3Like(String value) {
            addCriterion("feedback_content_3 like", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3NotLike(String value) {
            addCriterion("feedback_content_3 not like", value, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3In(List<String> values) {
            addCriterion("feedback_content_3 in", values, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3NotIn(List<String> values) {
            addCriterion("feedback_content_3 not in", values, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3Between(String value1, String value2) {
            addCriterion("feedback_content_3 between", value1, value2, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent3NotBetween(String value1, String value2) {
            addCriterion("feedback_content_3 not between", value1, value2, "feedbackContent3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3IsNull() {
            addCriterion("feedback_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3IsNotNull() {
            addCriterion("feedback_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3EqualTo(String value) {
            addCriterion("feedback_id_3 =", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3NotEqualTo(String value) {
            addCriterion("feedback_id_3 <>", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3GreaterThan(String value) {
            addCriterion("feedback_id_3 >", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_id_3 >=", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3LessThan(String value) {
            addCriterion("feedback_id_3 <", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3LessThanOrEqualTo(String value) {
            addCriterion("feedback_id_3 <=", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3Like(String value) {
            addCriterion("feedback_id_3 like", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3NotLike(String value) {
            addCriterion("feedback_id_3 not like", value, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3In(List<String> values) {
            addCriterion("feedback_id_3 in", values, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3NotIn(List<String> values) {
            addCriterion("feedback_id_3 not in", values, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3Between(String value1, String value2) {
            addCriterion("feedback_id_3 between", value1, value2, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackId3NotBetween(String value1, String value2) {
            addCriterion("feedback_id_3 not between", value1, value2, "feedbackId3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3IsNull() {
            addCriterion("feedback_name_3 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3IsNotNull() {
            addCriterion("feedback_name_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3EqualTo(String value) {
            addCriterion("feedback_name_3 =", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3NotEqualTo(String value) {
            addCriterion("feedback_name_3 <>", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3GreaterThan(String value) {
            addCriterion("feedback_name_3 >", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_name_3 >=", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3LessThan(String value) {
            addCriterion("feedback_name_3 <", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3LessThanOrEqualTo(String value) {
            addCriterion("feedback_name_3 <=", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3Like(String value) {
            addCriterion("feedback_name_3 like", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3NotLike(String value) {
            addCriterion("feedback_name_3 not like", value, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3In(List<String> values) {
            addCriterion("feedback_name_3 in", values, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3NotIn(List<String> values) {
            addCriterion("feedback_name_3 not in", values, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3Between(String value1, String value2) {
            addCriterion("feedback_name_3 between", value1, value2, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackName3NotBetween(String value1, String value2) {
            addCriterion("feedback_name_3 not between", value1, value2, "feedbackName3");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4IsNull() {
            addCriterion("feedback_content_4 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4IsNotNull() {
            addCriterion("feedback_content_4 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4EqualTo(String value) {
            addCriterion("feedback_content_4 =", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4NotEqualTo(String value) {
            addCriterion("feedback_content_4 <>", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4GreaterThan(String value) {
            addCriterion("feedback_content_4 >", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content_4 >=", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4LessThan(String value) {
            addCriterion("feedback_content_4 <", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4LessThanOrEqualTo(String value) {
            addCriterion("feedback_content_4 <=", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4Like(String value) {
            addCriterion("feedback_content_4 like", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4NotLike(String value) {
            addCriterion("feedback_content_4 not like", value, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4In(List<String> values) {
            addCriterion("feedback_content_4 in", values, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4NotIn(List<String> values) {
            addCriterion("feedback_content_4 not in", values, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4Between(String value1, String value2) {
            addCriterion("feedback_content_4 between", value1, value2, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent4NotBetween(String value1, String value2) {
            addCriterion("feedback_content_4 not between", value1, value2, "feedbackContent4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4IsNull() {
            addCriterion("feedback_id_4 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4IsNotNull() {
            addCriterion("feedback_id_4 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4EqualTo(String value) {
            addCriterion("feedback_id_4 =", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4NotEqualTo(String value) {
            addCriterion("feedback_id_4 <>", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4GreaterThan(String value) {
            addCriterion("feedback_id_4 >", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_id_4 >=", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4LessThan(String value) {
            addCriterion("feedback_id_4 <", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4LessThanOrEqualTo(String value) {
            addCriterion("feedback_id_4 <=", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4Like(String value) {
            addCriterion("feedback_id_4 like", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4NotLike(String value) {
            addCriterion("feedback_id_4 not like", value, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4In(List<String> values) {
            addCriterion("feedback_id_4 in", values, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4NotIn(List<String> values) {
            addCriterion("feedback_id_4 not in", values, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4Between(String value1, String value2) {
            addCriterion("feedback_id_4 between", value1, value2, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackId4NotBetween(String value1, String value2) {
            addCriterion("feedback_id_4 not between", value1, value2, "feedbackId4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4IsNull() {
            addCriterion("feedback_name_4 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4IsNotNull() {
            addCriterion("feedback_name_4 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4EqualTo(String value) {
            addCriterion("feedback_name_4 =", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4NotEqualTo(String value) {
            addCriterion("feedback_name_4 <>", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4GreaterThan(String value) {
            addCriterion("feedback_name_4 >", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_name_4 >=", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4LessThan(String value) {
            addCriterion("feedback_name_4 <", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4LessThanOrEqualTo(String value) {
            addCriterion("feedback_name_4 <=", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4Like(String value) {
            addCriterion("feedback_name_4 like", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4NotLike(String value) {
            addCriterion("feedback_name_4 not like", value, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4In(List<String> values) {
            addCriterion("feedback_name_4 in", values, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4NotIn(List<String> values) {
            addCriterion("feedback_name_4 not in", values, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4Between(String value1, String value2) {
            addCriterion("feedback_name_4 between", value1, value2, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackName4NotBetween(String value1, String value2) {
            addCriterion("feedback_name_4 not between", value1, value2, "feedbackName4");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5IsNull() {
            addCriterion("feedback_content_5 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5IsNotNull() {
            addCriterion("feedback_content_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5EqualTo(String value) {
            addCriterion("feedback_content_5 =", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5NotEqualTo(String value) {
            addCriterion("feedback_content_5 <>", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5GreaterThan(String value) {
            addCriterion("feedback_content_5 >", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_content_5 >=", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5LessThan(String value) {
            addCriterion("feedback_content_5 <", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5LessThanOrEqualTo(String value) {
            addCriterion("feedback_content_5 <=", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5Like(String value) {
            addCriterion("feedback_content_5 like", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5NotLike(String value) {
            addCriterion("feedback_content_5 not like", value, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5In(List<String> values) {
            addCriterion("feedback_content_5 in", values, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5NotIn(List<String> values) {
            addCriterion("feedback_content_5 not in", values, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5Between(String value1, String value2) {
            addCriterion("feedback_content_5 between", value1, value2, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackContent5NotBetween(String value1, String value2) {
            addCriterion("feedback_content_5 not between", value1, value2, "feedbackContent5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5IsNull() {
            addCriterion("feedback_id_5 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5IsNotNull() {
            addCriterion("feedback_id_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5EqualTo(String value) {
            addCriterion("feedback_id_5 =", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5NotEqualTo(String value) {
            addCriterion("feedback_id_5 <>", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5GreaterThan(String value) {
            addCriterion("feedback_id_5 >", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_id_5 >=", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5LessThan(String value) {
            addCriterion("feedback_id_5 <", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5LessThanOrEqualTo(String value) {
            addCriterion("feedback_id_5 <=", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5Like(String value) {
            addCriterion("feedback_id_5 like", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5NotLike(String value) {
            addCriterion("feedback_id_5 not like", value, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5In(List<String> values) {
            addCriterion("feedback_id_5 in", values, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5NotIn(List<String> values) {
            addCriterion("feedback_id_5 not in", values, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5Between(String value1, String value2) {
            addCriterion("feedback_id_5 between", value1, value2, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackId5NotBetween(String value1, String value2) {
            addCriterion("feedback_id_5 not between", value1, value2, "feedbackId5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5IsNull() {
            addCriterion("feedback_name_5 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5IsNotNull() {
            addCriterion("feedback_name_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5EqualTo(String value) {
            addCriterion("feedback_name_5 =", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5NotEqualTo(String value) {
            addCriterion("feedback_name_5 <>", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5GreaterThan(String value) {
            addCriterion("feedback_name_5 >", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_name_5 >=", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5LessThan(String value) {
            addCriterion("feedback_name_5 <", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5LessThanOrEqualTo(String value) {
            addCriterion("feedback_name_5 <=", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5Like(String value) {
            addCriterion("feedback_name_5 like", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5NotLike(String value) {
            addCriterion("feedback_name_5 not like", value, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5In(List<String> values) {
            addCriterion("feedback_name_5 in", values, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5NotIn(List<String> values) {
            addCriterion("feedback_name_5 not in", values, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5Between(String value1, String value2) {
            addCriterion("feedback_name_5 between", value1, value2, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFeedbackName5NotBetween(String value1, String value2) {
            addCriterion("feedback_name_5 not between", value1, value2, "feedbackName5");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentIsNull() {
            addCriterion("fault_urgent is null");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentIsNotNull() {
            addCriterion("fault_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentEqualTo(Integer value) {
            addCriterion("fault_urgent =", value, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentNotEqualTo(Integer value) {
            addCriterion("fault_urgent <>", value, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentGreaterThan(Integer value) {
            addCriterion("fault_urgent >", value, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_urgent >=", value, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentLessThan(Integer value) {
            addCriterion("fault_urgent <", value, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentLessThanOrEqualTo(Integer value) {
            addCriterion("fault_urgent <=", value, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentIn(List<Integer> values) {
            addCriterion("fault_urgent in", values, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentNotIn(List<Integer> values) {
            addCriterion("fault_urgent not in", values, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentBetween(Integer value1, Integer value2) {
            addCriterion("fault_urgent between", value1, value2, "faultUrgent");
            return (Criteria) this;
        }

        public Criteria andFaultUrgentNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_urgent not between", value1, value2, "faultUrgent");
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