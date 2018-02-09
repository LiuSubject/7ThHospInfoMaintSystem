package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class SoftwareRequirementsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareRequirementsExample() {
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

        public Criteria andRequireNoIsNull() {
            addCriterion("require_no is null");
            return (Criteria) this;
        }

        public Criteria andRequireNoIsNotNull() {
            addCriterion("require_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequireNoEqualTo(String value) {
            addCriterion("require_no =", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotEqualTo(String value) {
            addCriterion("require_no <>", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoGreaterThan(String value) {
            addCriterion("require_no >", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoGreaterThanOrEqualTo(String value) {
            addCriterion("require_no >=", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoLessThan(String value) {
            addCriterion("require_no <", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoLessThanOrEqualTo(String value) {
            addCriterion("require_no <=", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoLike(String value) {
            addCriterion("require_no like", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotLike(String value) {
            addCriterion("require_no not like", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoIn(List<String> values) {
            addCriterion("require_no in", values, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotIn(List<String> values) {
            addCriterion("require_no not in", values, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoBetween(String value1, String value2) {
            addCriterion("require_no between", value1, value2, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotBetween(String value1, String value2) {
            addCriterion("require_no not between", value1, value2, "requireNo");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
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

        public Criteria andApplicantNameIsNull() {
            addCriterion("applicant_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNotNull() {
            addCriterion("applicant_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameEqualTo(String value) {
            addCriterion("applicant_name =", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotEqualTo(String value) {
            addCriterion("applicant_name <>", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThan(String value) {
            addCriterion("applicant_name >", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_name >=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThan(String value) {
            addCriterion("applicant_name <", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThanOrEqualTo(String value) {
            addCriterion("applicant_name <=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLike(String value) {
            addCriterion("applicant_name like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotLike(String value) {
            addCriterion("applicant_name not like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIn(List<String> values) {
            addCriterion("applicant_name in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotIn(List<String> values) {
            addCriterion("applicant_name not in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameBetween(String value1, String value2) {
            addCriterion("applicant_name between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotBetween(String value1, String value2) {
            addCriterion("applicant_name not between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNull() {
            addCriterion("applicant_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNotNull() {
            addCriterion("applicant_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdEqualTo(String value) {
            addCriterion("applicant_id =", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotEqualTo(String value) {
            addCriterion("applicant_id <>", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThan(String value) {
            addCriterion("applicant_id >", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_id >=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThan(String value) {
            addCriterion("applicant_id <", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThanOrEqualTo(String value) {
            addCriterion("applicant_id <=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLike(String value) {
            addCriterion("applicant_id like", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotLike(String value) {
            addCriterion("applicant_id not like", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIn(List<String> values) {
            addCriterion("applicant_id in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotIn(List<String> values) {
            addCriterion("applicant_id not in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdBetween(String value1, String value2) {
            addCriterion("applicant_id between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotBetween(String value1, String value2) {
            addCriterion("applicant_id not between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeIsNull() {
            addCriterion("applicant_time is null");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeIsNotNull() {
            addCriterion("applicant_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeEqualTo(String value) {
            addCriterion("applicant_time =", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeNotEqualTo(String value) {
            addCriterion("applicant_time <>", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeGreaterThan(String value) {
            addCriterion("applicant_time >", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_time >=", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeLessThan(String value) {
            addCriterion("applicant_time <", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeLessThanOrEqualTo(String value) {
            addCriterion("applicant_time <=", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeLike(String value) {
            addCriterion("applicant_time like", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeNotLike(String value) {
            addCriterion("applicant_time not like", value, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeIn(List<String> values) {
            addCriterion("applicant_time in", values, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeNotIn(List<String> values) {
            addCriterion("applicant_time not in", values, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeBetween(String value1, String value2) {
            addCriterion("applicant_time between", value1, value2, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantTimeNotBetween(String value1, String value2) {
            addCriterion("applicant_time not between", value1, value2, "applicantTime");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleIsNull() {
            addCriterion("applicant_module is null");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleIsNotNull() {
            addCriterion("applicant_module is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleEqualTo(String value) {
            addCriterion("applicant_module =", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleNotEqualTo(String value) {
            addCriterion("applicant_module <>", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleGreaterThan(String value) {
            addCriterion("applicant_module >", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_module >=", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleLessThan(String value) {
            addCriterion("applicant_module <", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleLessThanOrEqualTo(String value) {
            addCriterion("applicant_module <=", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleLike(String value) {
            addCriterion("applicant_module like", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleNotLike(String value) {
            addCriterion("applicant_module not like", value, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleIn(List<String> values) {
            addCriterion("applicant_module in", values, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleNotIn(List<String> values) {
            addCriterion("applicant_module not in", values, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleBetween(String value1, String value2) {
            addCriterion("applicant_module between", value1, value2, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andApplicantModuleNotBetween(String value1, String value2) {
            addCriterion("applicant_module not between", value1, value2, "applicantModule");
            return (Criteria) this;
        }

        public Criteria andRequireTypeIsNull() {
            addCriterion("require_type is null");
            return (Criteria) this;
        }

        public Criteria andRequireTypeIsNotNull() {
            addCriterion("require_type is not null");
            return (Criteria) this;
        }

        public Criteria andRequireTypeEqualTo(String value) {
            addCriterion("require_type =", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotEqualTo(String value) {
            addCriterion("require_type <>", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeGreaterThan(String value) {
            addCriterion("require_type >", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeGreaterThanOrEqualTo(String value) {
            addCriterion("require_type >=", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeLessThan(String value) {
            addCriterion("require_type <", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeLessThanOrEqualTo(String value) {
            addCriterion("require_type <=", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeLike(String value) {
            addCriterion("require_type like", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotLike(String value) {
            addCriterion("require_type not like", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeIn(List<String> values) {
            addCriterion("require_type in", values, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotIn(List<String> values) {
            addCriterion("require_type not in", values, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeBetween(String value1, String value2) {
            addCriterion("require_type between", value1, value2, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotBetween(String value1, String value2) {
            addCriterion("require_type not between", value1, value2, "requireType");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsIsNull() {
            addCriterion("dept_comments is null");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsIsNotNull() {
            addCriterion("dept_comments is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsEqualTo(String value) {
            addCriterion("dept_comments =", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsNotEqualTo(String value) {
            addCriterion("dept_comments <>", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsGreaterThan(String value) {
            addCriterion("dept_comments >", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("dept_comments >=", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsLessThan(String value) {
            addCriterion("dept_comments <", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsLessThanOrEqualTo(String value) {
            addCriterion("dept_comments <=", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsLike(String value) {
            addCriterion("dept_comments like", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsNotLike(String value) {
            addCriterion("dept_comments not like", value, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsIn(List<String> values) {
            addCriterion("dept_comments in", values, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsNotIn(List<String> values) {
            addCriterion("dept_comments not in", values, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsBetween(String value1, String value2) {
            addCriterion("dept_comments between", value1, value2, "deptComments");
            return (Criteria) this;
        }

        public Criteria andDeptCommentsNotBetween(String value1, String value2) {
            addCriterion("dept_comments not between", value1, value2, "deptComments");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredIsNull() {
            addCriterion("time_required is null");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredIsNotNull() {
            addCriterion("time_required is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredEqualTo(Integer value) {
            addCriterion("time_required =", value, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredNotEqualTo(Integer value) {
            addCriterion("time_required <>", value, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredGreaterThan(Integer value) {
            addCriterion("time_required >", value, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_required >=", value, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredLessThan(Integer value) {
            addCriterion("time_required <", value, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredLessThanOrEqualTo(Integer value) {
            addCriterion("time_required <=", value, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredIn(List<Integer> values) {
            addCriterion("time_required in", values, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredNotIn(List<Integer> values) {
            addCriterion("time_required not in", values, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredBetween(Integer value1, Integer value2) {
            addCriterion("time_required between", value1, value2, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andTimeRequiredNotBetween(Integer value1, Integer value2) {
            addCriterion("time_required not between", value1, value2, "timeRequired");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsIsNull() {
            addCriterion("handling_comments is null");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsIsNotNull() {
            addCriterion("handling_comments is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsEqualTo(String value) {
            addCriterion("handling_comments =", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsNotEqualTo(String value) {
            addCriterion("handling_comments <>", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsGreaterThan(String value) {
            addCriterion("handling_comments >", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("handling_comments >=", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsLessThan(String value) {
            addCriterion("handling_comments <", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsLessThanOrEqualTo(String value) {
            addCriterion("handling_comments <=", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsLike(String value) {
            addCriterion("handling_comments like", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsNotLike(String value) {
            addCriterion("handling_comments not like", value, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsIn(List<String> values) {
            addCriterion("handling_comments in", values, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsNotIn(List<String> values) {
            addCriterion("handling_comments not in", values, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsBetween(String value1, String value2) {
            addCriterion("handling_comments between", value1, value2, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andHandlingCommentsNotBetween(String value1, String value2) {
            addCriterion("handling_comments not between", value1, value2, "handlingComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsIsNull() {
            addCriterion("info_comments is null");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsIsNotNull() {
            addCriterion("info_comments is not null");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsEqualTo(String value) {
            addCriterion("info_comments =", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsNotEqualTo(String value) {
            addCriterion("info_comments <>", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsGreaterThan(String value) {
            addCriterion("info_comments >", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("info_comments >=", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsLessThan(String value) {
            addCriterion("info_comments <", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsLessThanOrEqualTo(String value) {
            addCriterion("info_comments <=", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsLike(String value) {
            addCriterion("info_comments like", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsNotLike(String value) {
            addCriterion("info_comments not like", value, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsIn(List<String> values) {
            addCriterion("info_comments in", values, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsNotIn(List<String> values) {
            addCriterion("info_comments not in", values, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsBetween(String value1, String value2) {
            addCriterion("info_comments between", value1, value2, "infoComments");
            return (Criteria) this;
        }

        public Criteria andInfoCommentsNotBetween(String value1, String value2) {
            addCriterion("info_comments not between", value1, value2, "infoComments");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeIsNull() {
            addCriterion("acceptance_type is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeIsNotNull() {
            addCriterion("acceptance_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeEqualTo(Integer value) {
            addCriterion("acceptance_type =", value, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeNotEqualTo(Integer value) {
            addCriterion("acceptance_type <>", value, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeGreaterThan(Integer value) {
            addCriterion("acceptance_type >", value, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("acceptance_type >=", value, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeLessThan(Integer value) {
            addCriterion("acceptance_type <", value, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("acceptance_type <=", value, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeIn(List<Integer> values) {
            addCriterion("acceptance_type in", values, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeNotIn(List<Integer> values) {
            addCriterion("acceptance_type not in", values, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeBetween(Integer value1, Integer value2) {
            addCriterion("acceptance_type between", value1, value2, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("acceptance_type not between", value1, value2, "acceptanceType");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionIsNull() {
            addCriterion("acceptance_description is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionIsNotNull() {
            addCriterion("acceptance_description is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionEqualTo(String value) {
            addCriterion("acceptance_description =", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionNotEqualTo(String value) {
            addCriterion("acceptance_description <>", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionGreaterThan(String value) {
            addCriterion("acceptance_description >", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("acceptance_description >=", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionLessThan(String value) {
            addCriterion("acceptance_description <", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionLessThanOrEqualTo(String value) {
            addCriterion("acceptance_description <=", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionLike(String value) {
            addCriterion("acceptance_description like", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionNotLike(String value) {
            addCriterion("acceptance_description not like", value, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionIn(List<String> values) {
            addCriterion("acceptance_description in", values, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionNotIn(List<String> values) {
            addCriterion("acceptance_description not in", values, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionBetween(String value1, String value2) {
            addCriterion("acceptance_description between", value1, value2, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDescriptionNotBetween(String value1, String value2) {
            addCriterion("acceptance_description not between", value1, value2, "acceptanceDescription");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other_1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other_1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other_1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other_1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other_1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other_1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other_1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other_1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other_1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other_1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other_1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other_1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other_1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other_2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other_2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other_2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other_2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other_2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other_2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other_2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other_2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other_2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other_2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other_2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other_2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other_2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other_2 not between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther3IsNull() {
            addCriterion("other_3 is null");
            return (Criteria) this;
        }

        public Criteria andOther3IsNotNull() {
            addCriterion("other_3 is not null");
            return (Criteria) this;
        }

        public Criteria andOther3EqualTo(String value) {
            addCriterion("other_3 =", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotEqualTo(String value) {
            addCriterion("other_3 <>", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3GreaterThan(String value) {
            addCriterion("other_3 >", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3GreaterThanOrEqualTo(String value) {
            addCriterion("other_3 >=", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3LessThan(String value) {
            addCriterion("other_3 <", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3LessThanOrEqualTo(String value) {
            addCriterion("other_3 <=", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3Like(String value) {
            addCriterion("other_3 like", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotLike(String value) {
            addCriterion("other_3 not like", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3In(List<String> values) {
            addCriterion("other_3 in", values, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotIn(List<String> values) {
            addCriterion("other_3 not in", values, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3Between(String value1, String value2) {
            addCriterion("other_3 between", value1, value2, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotBetween(String value1, String value2) {
            addCriterion("other_3 not between", value1, value2, "other3");
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

        public Criteria andGroupVisibleIsNull() {
            addCriterion("group_visible is null");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleIsNotNull() {
            addCriterion("group_visible is not null");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleEqualTo(Integer value) {
            addCriterion("group_visible =", value, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleNotEqualTo(Integer value) {
            addCriterion("group_visible <>", value, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleGreaterThan(Integer value) {
            addCriterion("group_visible >", value, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_visible >=", value, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleLessThan(Integer value) {
            addCriterion("group_visible <", value, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("group_visible <=", value, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleIn(List<Integer> values) {
            addCriterion("group_visible in", values, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleNotIn(List<Integer> values) {
            addCriterion("group_visible not in", values, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleBetween(Integer value1, Integer value2) {
            addCriterion("group_visible between", value1, value2, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andGroupVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("group_visible not between", value1, value2, "groupVisible");
            return (Criteria) this;
        }

        public Criteria andHighApprovedIsNull() {
            addCriterion("high_approved is null");
            return (Criteria) this;
        }

        public Criteria andHighApprovedIsNotNull() {
            addCriterion("high_approved is not null");
            return (Criteria) this;
        }

        public Criteria andHighApprovedEqualTo(Integer value) {
            addCriterion("high_approved =", value, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedNotEqualTo(Integer value) {
            addCriterion("high_approved <>", value, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedGreaterThan(Integer value) {
            addCriterion("high_approved >", value, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedGreaterThanOrEqualTo(Integer value) {
            addCriterion("high_approved >=", value, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedLessThan(Integer value) {
            addCriterion("high_approved <", value, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedLessThanOrEqualTo(Integer value) {
            addCriterion("high_approved <=", value, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedIn(List<Integer> values) {
            addCriterion("high_approved in", values, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedNotIn(List<Integer> values) {
            addCriterion("high_approved not in", values, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedBetween(Integer value1, Integer value2) {
            addCriterion("high_approved between", value1, value2, "highApproved");
            return (Criteria) this;
        }

        public Criteria andHighApprovedNotBetween(Integer value1, Integer value2) {
            addCriterion("high_approved not between", value1, value2, "highApproved");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagIsNull() {
            addCriterion("approved_flag is null");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagIsNotNull() {
            addCriterion("approved_flag is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagEqualTo(Integer value) {
            addCriterion("approved_flag =", value, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagNotEqualTo(Integer value) {
            addCriterion("approved_flag <>", value, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagGreaterThan(Integer value) {
            addCriterion("approved_flag >", value, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("approved_flag >=", value, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagLessThan(Integer value) {
            addCriterion("approved_flag <", value, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagLessThanOrEqualTo(Integer value) {
            addCriterion("approved_flag <=", value, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagIn(List<Integer> values) {
            addCriterion("approved_flag in", values, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagNotIn(List<Integer> values) {
            addCriterion("approved_flag not in", values, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagBetween(Integer value1, Integer value2) {
            addCriterion("approved_flag between", value1, value2, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andApprovedFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("approved_flag not between", value1, value2, "approvedFlag");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1IsNull() {
            addCriterion("high_leader_approved_1 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1IsNotNull() {
            addCriterion("high_leader_approved_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1EqualTo(Integer value) {
            addCriterion("high_leader_approved_1 =", value, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1NotEqualTo(Integer value) {
            addCriterion("high_leader_approved_1 <>", value, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1GreaterThan(Integer value) {
            addCriterion("high_leader_approved_1 >", value, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1GreaterThanOrEqualTo(Integer value) {
            addCriterion("high_leader_approved_1 >=", value, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1LessThan(Integer value) {
            addCriterion("high_leader_approved_1 <", value, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1LessThanOrEqualTo(Integer value) {
            addCriterion("high_leader_approved_1 <=", value, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1In(List<Integer> values) {
            addCriterion("high_leader_approved_1 in", values, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1NotIn(List<Integer> values) {
            addCriterion("high_leader_approved_1 not in", values, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1Between(Integer value1, Integer value2) {
            addCriterion("high_leader_approved_1 between", value1, value2, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved1NotBetween(Integer value1, Integer value2) {
            addCriterion("high_leader_approved_1 not between", value1, value2, "highLeaderApproved1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1IsNull() {
            addCriterion("high_leader_reback_1 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1IsNotNull() {
            addCriterion("high_leader_reback_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1EqualTo(String value) {
            addCriterion("high_leader_reback_1 =", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1NotEqualTo(String value) {
            addCriterion("high_leader_reback_1 <>", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1GreaterThan(String value) {
            addCriterion("high_leader_reback_1 >", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_reback_1 >=", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1LessThan(String value) {
            addCriterion("high_leader_reback_1 <", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1LessThanOrEqualTo(String value) {
            addCriterion("high_leader_reback_1 <=", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1Like(String value) {
            addCriterion("high_leader_reback_1 like", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1NotLike(String value) {
            addCriterion("high_leader_reback_1 not like", value, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1In(List<String> values) {
            addCriterion("high_leader_reback_1 in", values, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1NotIn(List<String> values) {
            addCriterion("high_leader_reback_1 not in", values, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1Between(String value1, String value2) {
            addCriterion("high_leader_reback_1 between", value1, value2, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback1NotBetween(String value1, String value2) {
            addCriterion("high_leader_reback_1 not between", value1, value2, "highLeaderReback1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1IsNull() {
            addCriterion("high_leader_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1IsNotNull() {
            addCriterion("high_leader_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1EqualTo(String value) {
            addCriterion("high_leader_id_1 =", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1NotEqualTo(String value) {
            addCriterion("high_leader_id_1 <>", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1GreaterThan(String value) {
            addCriterion("high_leader_id_1 >", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_id_1 >=", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1LessThan(String value) {
            addCriterion("high_leader_id_1 <", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1LessThanOrEqualTo(String value) {
            addCriterion("high_leader_id_1 <=", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1Like(String value) {
            addCriterion("high_leader_id_1 like", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1NotLike(String value) {
            addCriterion("high_leader_id_1 not like", value, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1In(List<String> values) {
            addCriterion("high_leader_id_1 in", values, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1NotIn(List<String> values) {
            addCriterion("high_leader_id_1 not in", values, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1Between(String value1, String value2) {
            addCriterion("high_leader_id_1 between", value1, value2, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId1NotBetween(String value1, String value2) {
            addCriterion("high_leader_id_1 not between", value1, value2, "highLeaderId1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1IsNull() {
            addCriterion("high_leader_name_1 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1IsNotNull() {
            addCriterion("high_leader_name_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1EqualTo(String value) {
            addCriterion("high_leader_name_1 =", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1NotEqualTo(String value) {
            addCriterion("high_leader_name_1 <>", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1GreaterThan(String value) {
            addCriterion("high_leader_name_1 >", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_name_1 >=", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1LessThan(String value) {
            addCriterion("high_leader_name_1 <", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1LessThanOrEqualTo(String value) {
            addCriterion("high_leader_name_1 <=", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1Like(String value) {
            addCriterion("high_leader_name_1 like", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1NotLike(String value) {
            addCriterion("high_leader_name_1 not like", value, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1In(List<String> values) {
            addCriterion("high_leader_name_1 in", values, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1NotIn(List<String> values) {
            addCriterion("high_leader_name_1 not in", values, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1Between(String value1, String value2) {
            addCriterion("high_leader_name_1 between", value1, value2, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName1NotBetween(String value1, String value2) {
            addCriterion("high_leader_name_1 not between", value1, value2, "highLeaderName1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1IsNull() {
            addCriterion("high_leader_flag_1 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1IsNotNull() {
            addCriterion("high_leader_flag_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1EqualTo(Integer value) {
            addCriterion("high_leader_flag_1 =", value, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1NotEqualTo(Integer value) {
            addCriterion("high_leader_flag_1 <>", value, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1GreaterThan(Integer value) {
            addCriterion("high_leader_flag_1 >", value, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1GreaterThanOrEqualTo(Integer value) {
            addCriterion("high_leader_flag_1 >=", value, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1LessThan(Integer value) {
            addCriterion("high_leader_flag_1 <", value, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1LessThanOrEqualTo(Integer value) {
            addCriterion("high_leader_flag_1 <=", value, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1In(List<Integer> values) {
            addCriterion("high_leader_flag_1 in", values, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1NotIn(List<Integer> values) {
            addCriterion("high_leader_flag_1 not in", values, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1Between(Integer value1, Integer value2) {
            addCriterion("high_leader_flag_1 between", value1, value2, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag1NotBetween(Integer value1, Integer value2) {
            addCriterion("high_leader_flag_1 not between", value1, value2, "highLeaderFlag1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1IsNull() {
            addCriterion("feedback_time_1 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1IsNotNull() {
            addCriterion("feedback_time_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1EqualTo(String value) {
            addCriterion("feedback_time_1 =", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1NotEqualTo(String value) {
            addCriterion("feedback_time_1 <>", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1GreaterThan(String value) {
            addCriterion("feedback_time_1 >", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_time_1 >=", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1LessThan(String value) {
            addCriterion("feedback_time_1 <", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1LessThanOrEqualTo(String value) {
            addCriterion("feedback_time_1 <=", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1Like(String value) {
            addCriterion("feedback_time_1 like", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1NotLike(String value) {
            addCriterion("feedback_time_1 not like", value, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1In(List<String> values) {
            addCriterion("feedback_time_1 in", values, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1NotIn(List<String> values) {
            addCriterion("feedback_time_1 not in", values, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1Between(String value1, String value2) {
            addCriterion("feedback_time_1 between", value1, value2, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime1NotBetween(String value1, String value2) {
            addCriterion("feedback_time_1 not between", value1, value2, "feedbackTime1");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2IsNull() {
            addCriterion("feedback_time_2 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2IsNotNull() {
            addCriterion("feedback_time_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2EqualTo(String value) {
            addCriterion("feedback_time_2 =", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2NotEqualTo(String value) {
            addCriterion("feedback_time_2 <>", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2GreaterThan(String value) {
            addCriterion("feedback_time_2 >", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_time_2 >=", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2LessThan(String value) {
            addCriterion("feedback_time_2 <", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2LessThanOrEqualTo(String value) {
            addCriterion("feedback_time_2 <=", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2Like(String value) {
            addCriterion("feedback_time_2 like", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2NotLike(String value) {
            addCriterion("feedback_time_2 not like", value, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2In(List<String> values) {
            addCriterion("feedback_time_2 in", values, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2NotIn(List<String> values) {
            addCriterion("feedback_time_2 not in", values, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2Between(String value1, String value2) {
            addCriterion("feedback_time_2 between", value1, value2, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime2NotBetween(String value1, String value2) {
            addCriterion("feedback_time_2 not between", value1, value2, "feedbackTime2");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3IsNull() {
            addCriterion("feedback_time_3 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3IsNotNull() {
            addCriterion("feedback_time_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3EqualTo(String value) {
            addCriterion("feedback_time_3 =", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3NotEqualTo(String value) {
            addCriterion("feedback_time_3 <>", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3GreaterThan(String value) {
            addCriterion("feedback_time_3 >", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_time_3 >=", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3LessThan(String value) {
            addCriterion("feedback_time_3 <", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3LessThanOrEqualTo(String value) {
            addCriterion("feedback_time_3 <=", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3Like(String value) {
            addCriterion("feedback_time_3 like", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3NotLike(String value) {
            addCriterion("feedback_time_3 not like", value, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3In(List<String> values) {
            addCriterion("feedback_time_3 in", values, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3NotIn(List<String> values) {
            addCriterion("feedback_time_3 not in", values, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3Between(String value1, String value2) {
            addCriterion("feedback_time_3 between", value1, value2, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime3NotBetween(String value1, String value2) {
            addCriterion("feedback_time_3 not between", value1, value2, "feedbackTime3");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4IsNull() {
            addCriterion("feedback_time_4 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4IsNotNull() {
            addCriterion("feedback_time_4 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4EqualTo(String value) {
            addCriterion("feedback_time_4 =", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4NotEqualTo(String value) {
            addCriterion("feedback_time_4 <>", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4GreaterThan(String value) {
            addCriterion("feedback_time_4 >", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_time_4 >=", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4LessThan(String value) {
            addCriterion("feedback_time_4 <", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4LessThanOrEqualTo(String value) {
            addCriterion("feedback_time_4 <=", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4Like(String value) {
            addCriterion("feedback_time_4 like", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4NotLike(String value) {
            addCriterion("feedback_time_4 not like", value, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4In(List<String> values) {
            addCriterion("feedback_time_4 in", values, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4NotIn(List<String> values) {
            addCriterion("feedback_time_4 not in", values, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4Between(String value1, String value2) {
            addCriterion("feedback_time_4 between", value1, value2, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime4NotBetween(String value1, String value2) {
            addCriterion("feedback_time_4 not between", value1, value2, "feedbackTime4");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5IsNull() {
            addCriterion("feedback_time_5 is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5IsNotNull() {
            addCriterion("feedback_time_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5EqualTo(String value) {
            addCriterion("feedback_time_5 =", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5NotEqualTo(String value) {
            addCriterion("feedback_time_5 <>", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5GreaterThan(String value) {
            addCriterion("feedback_time_5 >", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5GreaterThanOrEqualTo(String value) {
            addCriterion("feedback_time_5 >=", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5LessThan(String value) {
            addCriterion("feedback_time_5 <", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5LessThanOrEqualTo(String value) {
            addCriterion("feedback_time_5 <=", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5Like(String value) {
            addCriterion("feedback_time_5 like", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5NotLike(String value) {
            addCriterion("feedback_time_5 not like", value, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5In(List<String> values) {
            addCriterion("feedback_time_5 in", values, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5NotIn(List<String> values) {
            addCriterion("feedback_time_5 not in", values, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5Between(String value1, String value2) {
            addCriterion("feedback_time_5 between", value1, value2, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andFeedbackTime5NotBetween(String value1, String value2) {
            addCriterion("feedback_time_5 not between", value1, value2, "feedbackTime5");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIsNull() {
            addCriterion("done_time is null");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIsNotNull() {
            addCriterion("done_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoneTimeEqualTo(String value) {
            addCriterion("done_time =", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotEqualTo(String value) {
            addCriterion("done_time <>", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeGreaterThan(String value) {
            addCriterion("done_time >", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeGreaterThanOrEqualTo(String value) {
            addCriterion("done_time >=", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLessThan(String value) {
            addCriterion("done_time <", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLessThanOrEqualTo(String value) {
            addCriterion("done_time <=", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLike(String value) {
            addCriterion("done_time like", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotLike(String value) {
            addCriterion("done_time not like", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIn(List<String> values) {
            addCriterion("done_time in", values, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotIn(List<String> values) {
            addCriterion("done_time not in", values, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeBetween(String value1, String value2) {
            addCriterion("done_time between", value1, value2, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotBetween(String value1, String value2) {
            addCriterion("done_time not between", value1, value2, "doneTime");
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