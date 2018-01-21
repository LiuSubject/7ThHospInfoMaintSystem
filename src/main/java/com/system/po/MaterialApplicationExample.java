package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class MaterialApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialApplicationExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNull() {
            addCriterion("judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(Integer value) {
            addCriterion("judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(Integer value) {
            addCriterion("judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(Integer value) {
            addCriterion("judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(Integer value) {
            addCriterion("judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(Integer value) {
            addCriterion("judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<Integer> values) {
            addCriterion("judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<Integer> values) {
            addCriterion("judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(Integer value1, Integer value2) {
            addCriterion("judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("judge not between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("use_date is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("use_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(String value) {
            addCriterion("use_date =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(String value) {
            addCriterion("use_date <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(String value) {
            addCriterion("use_date >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(String value) {
            addCriterion("use_date >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(String value) {
            addCriterion("use_date <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(String value) {
            addCriterion("use_date <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLike(String value) {
            addCriterion("use_date like", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotLike(String value) {
            addCriterion("use_date not like", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<String> values) {
            addCriterion("use_date in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<String> values) {
            addCriterion("use_date not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(String value1, String value2) {
            addCriterion("use_date between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(String value1, String value2) {
            addCriterion("use_date not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andBmyjIsNull() {
            addCriterion("bmYj is null");
            return (Criteria) this;
        }

        public Criteria andBmyjIsNotNull() {
            addCriterion("bmYj is not null");
            return (Criteria) this;
        }

        public Criteria andBmyjEqualTo(String value) {
            addCriterion("bmYj =", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjNotEqualTo(String value) {
            addCriterion("bmYj <>", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjGreaterThan(String value) {
            addCriterion("bmYj >", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjGreaterThanOrEqualTo(String value) {
            addCriterion("bmYj >=", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjLessThan(String value) {
            addCriterion("bmYj <", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjLessThanOrEqualTo(String value) {
            addCriterion("bmYj <=", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjLike(String value) {
            addCriterion("bmYj like", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjNotLike(String value) {
            addCriterion("bmYj not like", value, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjIn(List<String> values) {
            addCriterion("bmYj in", values, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjNotIn(List<String> values) {
            addCriterion("bmYj not in", values, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjBetween(String value1, String value2) {
            addCriterion("bmYj between", value1, value2, "bmyj");
            return (Criteria) this;
        }

        public Criteria andBmyjNotBetween(String value1, String value2) {
            addCriterion("bmYj not between", value1, value2, "bmyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjIsNull() {
            addCriterion("xxkYj is null");
            return (Criteria) this;
        }

        public Criteria andXxkyjIsNotNull() {
            addCriterion("xxkYj is not null");
            return (Criteria) this;
        }

        public Criteria andXxkyjEqualTo(String value) {
            addCriterion("xxkYj =", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjNotEqualTo(String value) {
            addCriterion("xxkYj <>", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjGreaterThan(String value) {
            addCriterion("xxkYj >", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjGreaterThanOrEqualTo(String value) {
            addCriterion("xxkYj >=", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjLessThan(String value) {
            addCriterion("xxkYj <", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjLessThanOrEqualTo(String value) {
            addCriterion("xxkYj <=", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjLike(String value) {
            addCriterion("xxkYj like", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjNotLike(String value) {
            addCriterion("xxkYj not like", value, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjIn(List<String> values) {
            addCriterion("xxkYj in", values, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjNotIn(List<String> values) {
            addCriterion("xxkYj not in", values, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjBetween(String value1, String value2) {
            addCriterion("xxkYj between", value1, value2, "xxkyj");
            return (Criteria) this;
        }

        public Criteria andXxkyjNotBetween(String value1, String value2) {
            addCriterion("xxkYj not between", value1, value2, "xxkyj");
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

        public Criteria andLeaderNameIsNull() {
            addCriterion("leader_name is null");
            return (Criteria) this;
        }

        public Criteria andLeaderNameIsNotNull() {
            addCriterion("leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderNameEqualTo(String value) {
            addCriterion("leader_name =", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotEqualTo(String value) {
            addCriterion("leader_name <>", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameGreaterThan(String value) {
            addCriterion("leader_name >", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("leader_name >=", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameLessThan(String value) {
            addCriterion("leader_name <", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("leader_name <=", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameLike(String value) {
            addCriterion("leader_name like", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotLike(String value) {
            addCriterion("leader_name not like", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameIn(List<String> values) {
            addCriterion("leader_name in", values, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotIn(List<String> values) {
            addCriterion("leader_name not in", values, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameBetween(String value1, String value2) {
            addCriterion("leader_name between", value1, value2, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotBetween(String value1, String value2) {
            addCriterion("leader_name not between", value1, value2, "leaderName");
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

        public Criteria andHighLeaderApproved2IsNull() {
            addCriterion("high_leader_approved_2 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2IsNotNull() {
            addCriterion("high_leader_approved_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2EqualTo(Integer value) {
            addCriterion("high_leader_approved_2 =", value, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2NotEqualTo(Integer value) {
            addCriterion("high_leader_approved_2 <>", value, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2GreaterThan(Integer value) {
            addCriterion("high_leader_approved_2 >", value, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2GreaterThanOrEqualTo(Integer value) {
            addCriterion("high_leader_approved_2 >=", value, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2LessThan(Integer value) {
            addCriterion("high_leader_approved_2 <", value, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2LessThanOrEqualTo(Integer value) {
            addCriterion("high_leader_approved_2 <=", value, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2In(List<Integer> values) {
            addCriterion("high_leader_approved_2 in", values, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2NotIn(List<Integer> values) {
            addCriterion("high_leader_approved_2 not in", values, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2Between(Integer value1, Integer value2) {
            addCriterion("high_leader_approved_2 between", value1, value2, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved2NotBetween(Integer value1, Integer value2) {
            addCriterion("high_leader_approved_2 not between", value1, value2, "highLeaderApproved2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2IsNull() {
            addCriterion("high_leader_reback_2 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2IsNotNull() {
            addCriterion("high_leader_reback_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2EqualTo(String value) {
            addCriterion("high_leader_reback_2 =", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2NotEqualTo(String value) {
            addCriterion("high_leader_reback_2 <>", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2GreaterThan(String value) {
            addCriterion("high_leader_reback_2 >", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_reback_2 >=", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2LessThan(String value) {
            addCriterion("high_leader_reback_2 <", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2LessThanOrEqualTo(String value) {
            addCriterion("high_leader_reback_2 <=", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2Like(String value) {
            addCriterion("high_leader_reback_2 like", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2NotLike(String value) {
            addCriterion("high_leader_reback_2 not like", value, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2In(List<String> values) {
            addCriterion("high_leader_reback_2 in", values, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2NotIn(List<String> values) {
            addCriterion("high_leader_reback_2 not in", values, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2Between(String value1, String value2) {
            addCriterion("high_leader_reback_2 between", value1, value2, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback2NotBetween(String value1, String value2) {
            addCriterion("high_leader_reback_2 not between", value1, value2, "highLeaderReback2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2IsNull() {
            addCriterion("high_leader_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2IsNotNull() {
            addCriterion("high_leader_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2EqualTo(String value) {
            addCriterion("high_leader_id_2 =", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2NotEqualTo(String value) {
            addCriterion("high_leader_id_2 <>", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2GreaterThan(String value) {
            addCriterion("high_leader_id_2 >", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_id_2 >=", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2LessThan(String value) {
            addCriterion("high_leader_id_2 <", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2LessThanOrEqualTo(String value) {
            addCriterion("high_leader_id_2 <=", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2Like(String value) {
            addCriterion("high_leader_id_2 like", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2NotLike(String value) {
            addCriterion("high_leader_id_2 not like", value, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2In(List<String> values) {
            addCriterion("high_leader_id_2 in", values, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2NotIn(List<String> values) {
            addCriterion("high_leader_id_2 not in", values, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2Between(String value1, String value2) {
            addCriterion("high_leader_id_2 between", value1, value2, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId2NotBetween(String value1, String value2) {
            addCriterion("high_leader_id_2 not between", value1, value2, "highLeaderId2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2IsNull() {
            addCriterion("high_leader_name_2 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2IsNotNull() {
            addCriterion("high_leader_name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2EqualTo(String value) {
            addCriterion("high_leader_name_2 =", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2NotEqualTo(String value) {
            addCriterion("high_leader_name_2 <>", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2GreaterThan(String value) {
            addCriterion("high_leader_name_2 >", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_name_2 >=", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2LessThan(String value) {
            addCriterion("high_leader_name_2 <", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2LessThanOrEqualTo(String value) {
            addCriterion("high_leader_name_2 <=", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2Like(String value) {
            addCriterion("high_leader_name_2 like", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2NotLike(String value) {
            addCriterion("high_leader_name_2 not like", value, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2In(List<String> values) {
            addCriterion("high_leader_name_2 in", values, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2NotIn(List<String> values) {
            addCriterion("high_leader_name_2 not in", values, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2Between(String value1, String value2) {
            addCriterion("high_leader_name_2 between", value1, value2, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName2NotBetween(String value1, String value2) {
            addCriterion("high_leader_name_2 not between", value1, value2, "highLeaderName2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2IsNull() {
            addCriterion("high_leader_flag_2 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2IsNotNull() {
            addCriterion("high_leader_flag_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2EqualTo(Integer value) {
            addCriterion("high_leader_flag_2 =", value, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2NotEqualTo(Integer value) {
            addCriterion("high_leader_flag_2 <>", value, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2GreaterThan(Integer value) {
            addCriterion("high_leader_flag_2 >", value, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2GreaterThanOrEqualTo(Integer value) {
            addCriterion("high_leader_flag_2 >=", value, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2LessThan(Integer value) {
            addCriterion("high_leader_flag_2 <", value, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2LessThanOrEqualTo(Integer value) {
            addCriterion("high_leader_flag_2 <=", value, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2In(List<Integer> values) {
            addCriterion("high_leader_flag_2 in", values, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2NotIn(List<Integer> values) {
            addCriterion("high_leader_flag_2 not in", values, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2Between(Integer value1, Integer value2) {
            addCriterion("high_leader_flag_2 between", value1, value2, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag2NotBetween(Integer value1, Integer value2) {
            addCriterion("high_leader_flag_2 not between", value1, value2, "highLeaderFlag2");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3IsNull() {
            addCriterion("high_leader_approved_3 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3IsNotNull() {
            addCriterion("high_leader_approved_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3EqualTo(Integer value) {
            addCriterion("high_leader_approved_3 =", value, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3NotEqualTo(Integer value) {
            addCriterion("high_leader_approved_3 <>", value, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3GreaterThan(Integer value) {
            addCriterion("high_leader_approved_3 >", value, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3GreaterThanOrEqualTo(Integer value) {
            addCriterion("high_leader_approved_3 >=", value, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3LessThan(Integer value) {
            addCriterion("high_leader_approved_3 <", value, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3LessThanOrEqualTo(Integer value) {
            addCriterion("high_leader_approved_3 <=", value, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3In(List<Integer> values) {
            addCriterion("high_leader_approved_3 in", values, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3NotIn(List<Integer> values) {
            addCriterion("high_leader_approved_3 not in", values, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3Between(Integer value1, Integer value2) {
            addCriterion("high_leader_approved_3 between", value1, value2, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderApproved3NotBetween(Integer value1, Integer value2) {
            addCriterion("high_leader_approved_3 not between", value1, value2, "highLeaderApproved3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3IsNull() {
            addCriterion("high_leader_reback_3 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3IsNotNull() {
            addCriterion("high_leader_reback_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3EqualTo(String value) {
            addCriterion("high_leader_reback_3 =", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3NotEqualTo(String value) {
            addCriterion("high_leader_reback_3 <>", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3GreaterThan(String value) {
            addCriterion("high_leader_reback_3 >", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_reback_3 >=", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3LessThan(String value) {
            addCriterion("high_leader_reback_3 <", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3LessThanOrEqualTo(String value) {
            addCriterion("high_leader_reback_3 <=", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3Like(String value) {
            addCriterion("high_leader_reback_3 like", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3NotLike(String value) {
            addCriterion("high_leader_reback_3 not like", value, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3In(List<String> values) {
            addCriterion("high_leader_reback_3 in", values, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3NotIn(List<String> values) {
            addCriterion("high_leader_reback_3 not in", values, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3Between(String value1, String value2) {
            addCriterion("high_leader_reback_3 between", value1, value2, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderReback3NotBetween(String value1, String value2) {
            addCriterion("high_leader_reback_3 not between", value1, value2, "highLeaderReback3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3IsNull() {
            addCriterion("high_leader_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3IsNotNull() {
            addCriterion("high_leader_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3EqualTo(String value) {
            addCriterion("high_leader_id_3 =", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3NotEqualTo(String value) {
            addCriterion("high_leader_id_3 <>", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3GreaterThan(String value) {
            addCriterion("high_leader_id_3 >", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_id_3 >=", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3LessThan(String value) {
            addCriterion("high_leader_id_3 <", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3LessThanOrEqualTo(String value) {
            addCriterion("high_leader_id_3 <=", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3Like(String value) {
            addCriterion("high_leader_id_3 like", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3NotLike(String value) {
            addCriterion("high_leader_id_3 not like", value, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3In(List<String> values) {
            addCriterion("high_leader_id_3 in", values, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3NotIn(List<String> values) {
            addCriterion("high_leader_id_3 not in", values, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3Between(String value1, String value2) {
            addCriterion("high_leader_id_3 between", value1, value2, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderId3NotBetween(String value1, String value2) {
            addCriterion("high_leader_id_3 not between", value1, value2, "highLeaderId3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3IsNull() {
            addCriterion("high_leader_name_3 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3IsNotNull() {
            addCriterion("high_leader_name_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3EqualTo(String value) {
            addCriterion("high_leader_name_3 =", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3NotEqualTo(String value) {
            addCriterion("high_leader_name_3 <>", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3GreaterThan(String value) {
            addCriterion("high_leader_name_3 >", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3GreaterThanOrEqualTo(String value) {
            addCriterion("high_leader_name_3 >=", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3LessThan(String value) {
            addCriterion("high_leader_name_3 <", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3LessThanOrEqualTo(String value) {
            addCriterion("high_leader_name_3 <=", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3Like(String value) {
            addCriterion("high_leader_name_3 like", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3NotLike(String value) {
            addCriterion("high_leader_name_3 not like", value, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3In(List<String> values) {
            addCriterion("high_leader_name_3 in", values, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3NotIn(List<String> values) {
            addCriterion("high_leader_name_3 not in", values, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3Between(String value1, String value2) {
            addCriterion("high_leader_name_3 between", value1, value2, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderName3NotBetween(String value1, String value2) {
            addCriterion("high_leader_name_3 not between", value1, value2, "highLeaderName3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3IsNull() {
            addCriterion("high_leader_flag_3 is null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3IsNotNull() {
            addCriterion("high_leader_flag_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3EqualTo(Integer value) {
            addCriterion("high_leader_flag_3 =", value, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3NotEqualTo(Integer value) {
            addCriterion("high_leader_flag_3 <>", value, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3GreaterThan(Integer value) {
            addCriterion("high_leader_flag_3 >", value, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3GreaterThanOrEqualTo(Integer value) {
            addCriterion("high_leader_flag_3 >=", value, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3LessThan(Integer value) {
            addCriterion("high_leader_flag_3 <", value, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3LessThanOrEqualTo(Integer value) {
            addCriterion("high_leader_flag_3 <=", value, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3In(List<Integer> values) {
            addCriterion("high_leader_flag_3 in", values, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3NotIn(List<Integer> values) {
            addCriterion("high_leader_flag_3 not in", values, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3Between(Integer value1, Integer value2) {
            addCriterion("high_leader_flag_3 between", value1, value2, "highLeaderFlag3");
            return (Criteria) this;
        }

        public Criteria andHighLeaderFlag3NotBetween(Integer value1, Integer value2) {
            addCriterion("high_leader_flag_3 not between", value1, value2, "highLeaderFlag3");
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