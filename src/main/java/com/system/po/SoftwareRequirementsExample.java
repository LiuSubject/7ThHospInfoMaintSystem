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

        public Criteria andRequireNoIsNull() {
            addCriterion("require_no is null");
            return (Criteria) this;
        }

        public Criteria andRequireNoIsNotNull() {
            addCriterion("require_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequireNoEqualTo(Integer value) {
            addCriterion("require_no =", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotEqualTo(Integer value) {
            addCriterion("require_no <>", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoGreaterThan(Integer value) {
            addCriterion("require_no >", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("require_no >=", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoLessThan(Integer value) {
            addCriterion("require_no <", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoLessThanOrEqualTo(Integer value) {
            addCriterion("require_no <=", value, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoIn(List<Integer> values) {
            addCriterion("require_no in", values, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotIn(List<Integer> values) {
            addCriterion("require_no not in", values, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoBetween(Integer value1, Integer value2) {
            addCriterion("require_no between", value1, value2, "requireNo");
            return (Criteria) this;
        }

        public Criteria andRequireNoNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRequireTypeEqualTo(Integer value) {
            addCriterion("require_type =", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotEqualTo(Integer value) {
            addCriterion("require_type <>", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeGreaterThan(Integer value) {
            addCriterion("require_type >", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("require_type >=", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeLessThan(Integer value) {
            addCriterion("require_type <", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeLessThanOrEqualTo(Integer value) {
            addCriterion("require_type <=", value, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeIn(List<Integer> values) {
            addCriterion("require_type in", values, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotIn(List<Integer> values) {
            addCriterion("require_type not in", values, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeBetween(Integer value1, Integer value2) {
            addCriterion("require_type between", value1, value2, "requireType");
            return (Criteria) this;
        }

        public Criteria andRequireTypeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
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

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
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

        public Criteria andManagementLeaderIsNull() {
            addCriterion("management_leader is null");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderIsNotNull() {
            addCriterion("management_leader is not null");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderEqualTo(String value) {
            addCriterion("management_leader =", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotEqualTo(String value) {
            addCriterion("management_leader <>", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderGreaterThan(String value) {
            addCriterion("management_leader >", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("management_leader >=", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderLessThan(String value) {
            addCriterion("management_leader <", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderLessThanOrEqualTo(String value) {
            addCriterion("management_leader <=", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderLike(String value) {
            addCriterion("management_leader like", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotLike(String value) {
            addCriterion("management_leader not like", value, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderIn(List<String> values) {
            addCriterion("management_leader in", values, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotIn(List<String> values) {
            addCriterion("management_leader not in", values, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderBetween(String value1, String value2) {
            addCriterion("management_leader between", value1, value2, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andManagementLeaderNotBetween(String value1, String value2) {
            addCriterion("management_leader not between", value1, value2, "managementLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderIsNull() {
            addCriterion("hospital_leader is null");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderIsNotNull() {
            addCriterion("hospital_leader is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderEqualTo(String value) {
            addCriterion("hospital_leader =", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderNotEqualTo(String value) {
            addCriterion("hospital_leader <>", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderGreaterThan(String value) {
            addCriterion("hospital_leader >", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_leader >=", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderLessThan(String value) {
            addCriterion("hospital_leader <", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderLessThanOrEqualTo(String value) {
            addCriterion("hospital_leader <=", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderLike(String value) {
            addCriterion("hospital_leader like", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderNotLike(String value) {
            addCriterion("hospital_leader not like", value, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderIn(List<String> values) {
            addCriterion("hospital_leader in", values, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderNotIn(List<String> values) {
            addCriterion("hospital_leader not in", values, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderBetween(String value1, String value2) {
            addCriterion("hospital_leader between", value1, value2, "hospitalLeader");
            return (Criteria) this;
        }

        public Criteria andHospitalLeaderNotBetween(String value1, String value2) {
            addCriterion("hospital_leader not between", value1, value2, "hospitalLeader");
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