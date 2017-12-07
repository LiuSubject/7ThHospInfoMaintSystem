package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class ViewEmployeeMiPsdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewEmployeeMiPsdExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andPyCodeIsNull() {
            addCriterion("py_code is null");
            return (Criteria) this;
        }

        public Criteria andPyCodeIsNotNull() {
            addCriterion("py_code is not null");
            return (Criteria) this;
        }

        public Criteria andPyCodeEqualTo(String value) {
            addCriterion("py_code =", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotEqualTo(String value) {
            addCriterion("py_code <>", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeGreaterThan(String value) {
            addCriterion("py_code >", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("py_code >=", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeLessThan(String value) {
            addCriterion("py_code <", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeLessThanOrEqualTo(String value) {
            addCriterion("py_code <=", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeLike(String value) {
            addCriterion("py_code like", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotLike(String value) {
            addCriterion("py_code not like", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeIn(List<String> values) {
            addCriterion("py_code in", values, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotIn(List<String> values) {
            addCriterion("py_code not in", values, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeBetween(String value1, String value2) {
            addCriterion("py_code between", value1, value2, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotBetween(String value1, String value2) {
            addCriterion("py_code not between", value1, value2, "pyCode");
            return (Criteria) this;
        }

        public Criteria andDCodeIsNull() {
            addCriterion("d_code is null");
            return (Criteria) this;
        }

        public Criteria andDCodeIsNotNull() {
            addCriterion("d_code is not null");
            return (Criteria) this;
        }

        public Criteria andDCodeEqualTo(String value) {
            addCriterion("d_code =", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeNotEqualTo(String value) {
            addCriterion("d_code <>", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeGreaterThan(String value) {
            addCriterion("d_code >", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeGreaterThanOrEqualTo(String value) {
            addCriterion("d_code >=", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeLessThan(String value) {
            addCriterion("d_code <", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeLessThanOrEqualTo(String value) {
            addCriterion("d_code <=", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeLike(String value) {
            addCriterion("d_code like", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeNotLike(String value) {
            addCriterion("d_code not like", value, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeIn(List<String> values) {
            addCriterion("d_code in", values, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeNotIn(List<String> values) {
            addCriterion("d_code not in", values, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeBetween(String value1, String value2) {
            addCriterion("d_code between", value1, value2, "dCode");
            return (Criteria) this;
        }

        public Criteria andDCodeNotBetween(String value1, String value2) {
            addCriterion("d_code not between", value1, value2, "dCode");
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

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andPsdIsNull() {
            addCriterion("psd is null");
            return (Criteria) this;
        }

        public Criteria andPsdIsNotNull() {
            addCriterion("psd is not null");
            return (Criteria) this;
        }

        public Criteria andPsdEqualTo(String value) {
            addCriterion("psd =", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotEqualTo(String value) {
            addCriterion("psd <>", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdGreaterThan(String value) {
            addCriterion("psd >", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdGreaterThanOrEqualTo(String value) {
            addCriterion("psd >=", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdLessThan(String value) {
            addCriterion("psd <", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdLessThanOrEqualTo(String value) {
            addCriterion("psd <=", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdLike(String value) {
            addCriterion("psd like", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotLike(String value) {
            addCriterion("psd not like", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdIn(List<String> values) {
            addCriterion("psd in", values, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotIn(List<String> values) {
            addCriterion("psd not in", values, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdBetween(String value1, String value2) {
            addCriterion("psd between", value1, value2, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotBetween(String value1, String value2) {
            addCriterion("psd not between", value1, value2, "psd");
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