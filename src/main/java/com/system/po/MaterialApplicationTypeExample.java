package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class MaterialApplicationTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialApplicationTypeExample() {
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

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2IsNull() {
            addCriterion("material_code2 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2IsNotNull() {
            addCriterion("material_code2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2EqualTo(String value) {
            addCriterion("material_code2 =", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2NotEqualTo(String value) {
            addCriterion("material_code2 <>", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2GreaterThan(String value) {
            addCriterion("material_code2 >", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2GreaterThanOrEqualTo(String value) {
            addCriterion("material_code2 >=", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2LessThan(String value) {
            addCriterion("material_code2 <", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2LessThanOrEqualTo(String value) {
            addCriterion("material_code2 <=", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2Like(String value) {
            addCriterion("material_code2 like", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2NotLike(String value) {
            addCriterion("material_code2 not like", value, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2In(List<String> values) {
            addCriterion("material_code2 in", values, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2NotIn(List<String> values) {
            addCriterion("material_code2 not in", values, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2Between(String value1, String value2) {
            addCriterion("material_code2 between", value1, value2, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode2NotBetween(String value1, String value2) {
            addCriterion("material_code2 not between", value1, value2, "materialCode2");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3IsNull() {
            addCriterion("material_code3 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3IsNotNull() {
            addCriterion("material_code3 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3EqualTo(String value) {
            addCriterion("material_code3 =", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3NotEqualTo(String value) {
            addCriterion("material_code3 <>", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3GreaterThan(String value) {
            addCriterion("material_code3 >", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3GreaterThanOrEqualTo(String value) {
            addCriterion("material_code3 >=", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3LessThan(String value) {
            addCriterion("material_code3 <", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3LessThanOrEqualTo(String value) {
            addCriterion("material_code3 <=", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3Like(String value) {
            addCriterion("material_code3 like", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3NotLike(String value) {
            addCriterion("material_code3 not like", value, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3In(List<String> values) {
            addCriterion("material_code3 in", values, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3NotIn(List<String> values) {
            addCriterion("material_code3 not in", values, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3Between(String value1, String value2) {
            addCriterion("material_code3 between", value1, value2, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialCode3NotBetween(String value1, String value2) {
            addCriterion("material_code3 not between", value1, value2, "materialCode3");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteIsNull() {
            addCriterion("material_note is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteIsNotNull() {
            addCriterion("material_note is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteEqualTo(String value) {
            addCriterion("material_note =", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotEqualTo(String value) {
            addCriterion("material_note <>", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteGreaterThan(String value) {
            addCriterion("material_note >", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteGreaterThanOrEqualTo(String value) {
            addCriterion("material_note >=", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteLessThan(String value) {
            addCriterion("material_note <", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteLessThanOrEqualTo(String value) {
            addCriterion("material_note <=", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteLike(String value) {
            addCriterion("material_note like", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotLike(String value) {
            addCriterion("material_note not like", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteIn(List<String> values) {
            addCriterion("material_note in", values, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotIn(List<String> values) {
            addCriterion("material_note not in", values, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteBetween(String value1, String value2) {
            addCriterion("material_note between", value1, value2, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotBetween(String value1, String value2) {
            addCriterion("material_note not between", value1, value2, "materialNote");
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