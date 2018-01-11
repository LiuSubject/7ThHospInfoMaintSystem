package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class EngineRoomInspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngineRoomInspectionExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andEmrIsNull() {
            addCriterion("emr is null");
            return (Criteria) this;
        }

        public Criteria andEmrIsNotNull() {
            addCriterion("emr is not null");
            return (Criteria) this;
        }

        public Criteria andEmrEqualTo(Integer value) {
            addCriterion("emr =", value, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrNotEqualTo(Integer value) {
            addCriterion("emr <>", value, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrGreaterThan(Integer value) {
            addCriterion("emr >", value, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrGreaterThanOrEqualTo(Integer value) {
            addCriterion("emr >=", value, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrLessThan(Integer value) {
            addCriterion("emr <", value, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrLessThanOrEqualTo(Integer value) {
            addCriterion("emr <=", value, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrIn(List<Integer> values) {
            addCriterion("emr in", values, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrNotIn(List<Integer> values) {
            addCriterion("emr not in", values, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrBetween(Integer value1, Integer value2) {
            addCriterion("emr between", value1, value2, "emr");
            return (Criteria) this;
        }

        public Criteria andEmrNotBetween(Integer value1, Integer value2) {
            addCriterion("emr not between", value1, value2, "emr");
            return (Criteria) this;
        }

        public Criteria andHisIsNull() {
            addCriterion("his is null");
            return (Criteria) this;
        }

        public Criteria andHisIsNotNull() {
            addCriterion("his is not null");
            return (Criteria) this;
        }

        public Criteria andHisEqualTo(Integer value) {
            addCriterion("his =", value, "his");
            return (Criteria) this;
        }

        public Criteria andHisNotEqualTo(Integer value) {
            addCriterion("his <>", value, "his");
            return (Criteria) this;
        }

        public Criteria andHisGreaterThan(Integer value) {
            addCriterion("his >", value, "his");
            return (Criteria) this;
        }

        public Criteria andHisGreaterThanOrEqualTo(Integer value) {
            addCriterion("his >=", value, "his");
            return (Criteria) this;
        }

        public Criteria andHisLessThan(Integer value) {
            addCriterion("his <", value, "his");
            return (Criteria) this;
        }

        public Criteria andHisLessThanOrEqualTo(Integer value) {
            addCriterion("his <=", value, "his");
            return (Criteria) this;
        }

        public Criteria andHisIn(List<Integer> values) {
            addCriterion("his in", values, "his");
            return (Criteria) this;
        }

        public Criteria andHisNotIn(List<Integer> values) {
            addCriterion("his not in", values, "his");
            return (Criteria) this;
        }

        public Criteria andHisBetween(Integer value1, Integer value2) {
            addCriterion("his between", value1, value2, "his");
            return (Criteria) this;
        }

        public Criteria andHisNotBetween(Integer value1, Integer value2) {
            addCriterion("his not between", value1, value2, "his");
            return (Criteria) this;
        }

        public Criteria andLisIsNull() {
            addCriterion("lis is null");
            return (Criteria) this;
        }

        public Criteria andLisIsNotNull() {
            addCriterion("lis is not null");
            return (Criteria) this;
        }

        public Criteria andLisEqualTo(Integer value) {
            addCriterion("lis =", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisNotEqualTo(Integer value) {
            addCriterion("lis <>", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisGreaterThan(Integer value) {
            addCriterion("lis >", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisGreaterThanOrEqualTo(Integer value) {
            addCriterion("lis >=", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisLessThan(Integer value) {
            addCriterion("lis <", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisLessThanOrEqualTo(Integer value) {
            addCriterion("lis <=", value, "lis");
            return (Criteria) this;
        }

        public Criteria andLisIn(List<Integer> values) {
            addCriterion("lis in", values, "lis");
            return (Criteria) this;
        }

        public Criteria andLisNotIn(List<Integer> values) {
            addCriterion("lis not in", values, "lis");
            return (Criteria) this;
        }

        public Criteria andLisBetween(Integer value1, Integer value2) {
            addCriterion("lis between", value1, value2, "lis");
            return (Criteria) this;
        }

        public Criteria andLisNotBetween(Integer value1, Integer value2) {
            addCriterion("lis not between", value1, value2, "lis");
            return (Criteria) this;
        }

        public Criteria andPacsIsNull() {
            addCriterion("pacs is null");
            return (Criteria) this;
        }

        public Criteria andPacsIsNotNull() {
            addCriterion("pacs is not null");
            return (Criteria) this;
        }

        public Criteria andPacsEqualTo(Integer value) {
            addCriterion("pacs =", value, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsNotEqualTo(Integer value) {
            addCriterion("pacs <>", value, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsGreaterThan(Integer value) {
            addCriterion("pacs >", value, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pacs >=", value, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsLessThan(Integer value) {
            addCriterion("pacs <", value, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsLessThanOrEqualTo(Integer value) {
            addCriterion("pacs <=", value, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsIn(List<Integer> values) {
            addCriterion("pacs in", values, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsNotIn(List<Integer> values) {
            addCriterion("pacs not in", values, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsBetween(Integer value1, Integer value2) {
            addCriterion("pacs between", value1, value2, "pacs");
            return (Criteria) this;
        }

        public Criteria andPacsNotBetween(Integer value1, Integer value2) {
            addCriterion("pacs not between", value1, value2, "pacs");
            return (Criteria) this;
        }

        public Criteria andXnyIsNull() {
            addCriterion("xny is null");
            return (Criteria) this;
        }

        public Criteria andXnyIsNotNull() {
            addCriterion("xny is not null");
            return (Criteria) this;
        }

        public Criteria andXnyEqualTo(Integer value) {
            addCriterion("xny =", value, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyNotEqualTo(Integer value) {
            addCriterion("xny <>", value, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyGreaterThan(Integer value) {
            addCriterion("xny >", value, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("xny >=", value, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyLessThan(Integer value) {
            addCriterion("xny <", value, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyLessThanOrEqualTo(Integer value) {
            addCriterion("xny <=", value, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyIn(List<Integer> values) {
            addCriterion("xny in", values, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyNotIn(List<Integer> values) {
            addCriterion("xny not in", values, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyBetween(Integer value1, Integer value2) {
            addCriterion("xny between", value1, value2, "xny");
            return (Criteria) this;
        }

        public Criteria andXnyNotBetween(Integer value1, Integer value2) {
            addCriterion("xny not between", value1, value2, "xny");
            return (Criteria) this;
        }

        public Criteria andOaIsNull() {
            addCriterion("oa is null");
            return (Criteria) this;
        }

        public Criteria andOaIsNotNull() {
            addCriterion("oa is not null");
            return (Criteria) this;
        }

        public Criteria andOaEqualTo(Integer value) {
            addCriterion("oa =", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotEqualTo(Integer value) {
            addCriterion("oa <>", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaGreaterThan(Integer value) {
            addCriterion("oa >", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaGreaterThanOrEqualTo(Integer value) {
            addCriterion("oa >=", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaLessThan(Integer value) {
            addCriterion("oa <", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaLessThanOrEqualTo(Integer value) {
            addCriterion("oa <=", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaIn(List<Integer> values) {
            addCriterion("oa in", values, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotIn(List<Integer> values) {
            addCriterion("oa not in", values, "oa");
            return (Criteria) this;
        }

        public Criteria andOaBetween(Integer value1, Integer value2) {
            addCriterion("oa between", value1, value2, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotBetween(Integer value1, Integer value2) {
            addCriterion("oa not between", value1, value2, "oa");
            return (Criteria) this;
        }

        public Criteria andYbIsNull() {
            addCriterion("yb is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("yb is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(Integer value) {
            addCriterion("yb =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(Integer value) {
            addCriterion("yb <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(Integer value) {
            addCriterion("yb >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(Integer value) {
            addCriterion("yb >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(Integer value) {
            addCriterion("yb <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(Integer value) {
            addCriterion("yb <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<Integer> values) {
            addCriterion("yb in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<Integer> values) {
            addCriterion("yb not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(Integer value1, Integer value2) {
            addCriterion("yb between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(Integer value1, Integer value2) {
            addCriterion("yb not between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andQywIsNull() {
            addCriterion("qyw is null");
            return (Criteria) this;
        }

        public Criteria andQywIsNotNull() {
            addCriterion("qyw is not null");
            return (Criteria) this;
        }

        public Criteria andQywEqualTo(Integer value) {
            addCriterion("qyw =", value, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywNotEqualTo(Integer value) {
            addCriterion("qyw <>", value, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywGreaterThan(Integer value) {
            addCriterion("qyw >", value, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywGreaterThanOrEqualTo(Integer value) {
            addCriterion("qyw >=", value, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywLessThan(Integer value) {
            addCriterion("qyw <", value, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywLessThanOrEqualTo(Integer value) {
            addCriterion("qyw <=", value, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywIn(List<Integer> values) {
            addCriterion("qyw in", values, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywNotIn(List<Integer> values) {
            addCriterion("qyw not in", values, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywBetween(Integer value1, Integer value2) {
            addCriterion("qyw between", value1, value2, "qyw");
            return (Criteria) this;
        }

        public Criteria andQywNotBetween(Integer value1, Integer value2) {
            addCriterion("qyw not between", value1, value2, "qyw");
            return (Criteria) this;
        }

        public Criteria andYyIsNull() {
            addCriterion("yy is null");
            return (Criteria) this;
        }

        public Criteria andYyIsNotNull() {
            addCriterion("yy is not null");
            return (Criteria) this;
        }

        public Criteria andYyEqualTo(Integer value) {
            addCriterion("yy =", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotEqualTo(Integer value) {
            addCriterion("yy <>", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThan(Integer value) {
            addCriterion("yy >", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThanOrEqualTo(Integer value) {
            addCriterion("yy >=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThan(Integer value) {
            addCriterion("yy <", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThanOrEqualTo(Integer value) {
            addCriterion("yy <=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyIn(List<Integer> values) {
            addCriterion("yy in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotIn(List<Integer> values) {
            addCriterion("yy not in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyBetween(Integer value1, Integer value2) {
            addCriterion("yy between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotBetween(Integer value1, Integer value2) {
            addCriterion("yy not between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andHisccIsNull() {
            addCriterion("hiscc is null");
            return (Criteria) this;
        }

        public Criteria andHisccIsNotNull() {
            addCriterion("hiscc is not null");
            return (Criteria) this;
        }

        public Criteria andHisccEqualTo(Integer value) {
            addCriterion("hiscc =", value, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccNotEqualTo(Integer value) {
            addCriterion("hiscc <>", value, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccGreaterThan(Integer value) {
            addCriterion("hiscc >", value, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccGreaterThanOrEqualTo(Integer value) {
            addCriterion("hiscc >=", value, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccLessThan(Integer value) {
            addCriterion("hiscc <", value, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccLessThanOrEqualTo(Integer value) {
            addCriterion("hiscc <=", value, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccIn(List<Integer> values) {
            addCriterion("hiscc in", values, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccNotIn(List<Integer> values) {
            addCriterion("hiscc not in", values, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccBetween(Integer value1, Integer value2) {
            addCriterion("hiscc between", value1, value2, "hiscc");
            return (Criteria) this;
        }

        public Criteria andHisccNotBetween(Integer value1, Integer value2) {
            addCriterion("hiscc not between", value1, value2, "hiscc");
            return (Criteria) this;
        }

        public Criteria andJkIsNull() {
            addCriterion("jk is null");
            return (Criteria) this;
        }

        public Criteria andJkIsNotNull() {
            addCriterion("jk is not null");
            return (Criteria) this;
        }

        public Criteria andJkEqualTo(Integer value) {
            addCriterion("jk =", value, "jk");
            return (Criteria) this;
        }

        public Criteria andJkNotEqualTo(Integer value) {
            addCriterion("jk <>", value, "jk");
            return (Criteria) this;
        }

        public Criteria andJkGreaterThan(Integer value) {
            addCriterion("jk >", value, "jk");
            return (Criteria) this;
        }

        public Criteria andJkGreaterThanOrEqualTo(Integer value) {
            addCriterion("jk >=", value, "jk");
            return (Criteria) this;
        }

        public Criteria andJkLessThan(Integer value) {
            addCriterion("jk <", value, "jk");
            return (Criteria) this;
        }

        public Criteria andJkLessThanOrEqualTo(Integer value) {
            addCriterion("jk <=", value, "jk");
            return (Criteria) this;
        }

        public Criteria andJkIn(List<Integer> values) {
            addCriterion("jk in", values, "jk");
            return (Criteria) this;
        }

        public Criteria andJkNotIn(List<Integer> values) {
            addCriterion("jk not in", values, "jk");
            return (Criteria) this;
        }

        public Criteria andJkBetween(Integer value1, Integer value2) {
            addCriterion("jk between", value1, value2, "jk");
            return (Criteria) this;
        }

        public Criteria andJkNotBetween(Integer value1, Integer value2) {
            addCriterion("jk not between", value1, value2, "jk");
            return (Criteria) this;
        }

        public Criteria andHxIsNull() {
            addCriterion("hx is null");
            return (Criteria) this;
        }

        public Criteria andHxIsNotNull() {
            addCriterion("hx is not null");
            return (Criteria) this;
        }

        public Criteria andHxEqualTo(Integer value) {
            addCriterion("hx =", value, "hx");
            return (Criteria) this;
        }

        public Criteria andHxNotEqualTo(Integer value) {
            addCriterion("hx <>", value, "hx");
            return (Criteria) this;
        }

        public Criteria andHxGreaterThan(Integer value) {
            addCriterion("hx >", value, "hx");
            return (Criteria) this;
        }

        public Criteria andHxGreaterThanOrEqualTo(Integer value) {
            addCriterion("hx >=", value, "hx");
            return (Criteria) this;
        }

        public Criteria andHxLessThan(Integer value) {
            addCriterion("hx <", value, "hx");
            return (Criteria) this;
        }

        public Criteria andHxLessThanOrEqualTo(Integer value) {
            addCriterion("hx <=", value, "hx");
            return (Criteria) this;
        }

        public Criteria andHxIn(List<Integer> values) {
            addCriterion("hx in", values, "hx");
            return (Criteria) this;
        }

        public Criteria andHxNotIn(List<Integer> values) {
            addCriterion("hx not in", values, "hx");
            return (Criteria) this;
        }

        public Criteria andHxBetween(Integer value1, Integer value2) {
            addCriterion("hx between", value1, value2, "hx");
            return (Criteria) this;
        }

        public Criteria andHxNotBetween(Integer value1, Integer value2) {
            addCriterion("hx not between", value1, value2, "hx");
            return (Criteria) this;
        }

        public Criteria andHjIsNull() {
            addCriterion("hj is null");
            return (Criteria) this;
        }

        public Criteria andHjIsNotNull() {
            addCriterion("hj is not null");
            return (Criteria) this;
        }

        public Criteria andHjEqualTo(Integer value) {
            addCriterion("hj =", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotEqualTo(Integer value) {
            addCriterion("hj <>", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThan(Integer value) {
            addCriterion("hj >", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjGreaterThanOrEqualTo(Integer value) {
            addCriterion("hj >=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThan(Integer value) {
            addCriterion("hj <", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjLessThanOrEqualTo(Integer value) {
            addCriterion("hj <=", value, "hj");
            return (Criteria) this;
        }

        public Criteria andHjIn(List<Integer> values) {
            addCriterion("hj in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotIn(List<Integer> values) {
            addCriterion("hj not in", values, "hj");
            return (Criteria) this;
        }

        public Criteria andHjBetween(Integer value1, Integer value2) {
            addCriterion("hj between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andHjNotBetween(Integer value1, Integer value2) {
            addCriterion("hj not between", value1, value2, "hj");
            return (Criteria) this;
        }

        public Criteria andAqsbIsNull() {
            addCriterion("aqsb is null");
            return (Criteria) this;
        }

        public Criteria andAqsbIsNotNull() {
            addCriterion("aqsb is not null");
            return (Criteria) this;
        }

        public Criteria andAqsbEqualTo(Integer value) {
            addCriterion("aqsb =", value, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbNotEqualTo(Integer value) {
            addCriterion("aqsb <>", value, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbGreaterThan(Integer value) {
            addCriterion("aqsb >", value, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbGreaterThanOrEqualTo(Integer value) {
            addCriterion("aqsb >=", value, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbLessThan(Integer value) {
            addCriterion("aqsb <", value, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbLessThanOrEqualTo(Integer value) {
            addCriterion("aqsb <=", value, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbIn(List<Integer> values) {
            addCriterion("aqsb in", values, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbNotIn(List<Integer> values) {
            addCriterion("aqsb not in", values, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbBetween(Integer value1, Integer value2) {
            addCriterion("aqsb between", value1, value2, "aqsb");
            return (Criteria) this;
        }

        public Criteria andAqsbNotBetween(Integer value1, Integer value2) {
            addCriterion("aqsb not between", value1, value2, "aqsb");
            return (Criteria) this;
        }

        public Criteria andUpsIsNull() {
            addCriterion("ups is null");
            return (Criteria) this;
        }

        public Criteria andUpsIsNotNull() {
            addCriterion("ups is not null");
            return (Criteria) this;
        }

        public Criteria andUpsEqualTo(Integer value) {
            addCriterion("ups =", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotEqualTo(Integer value) {
            addCriterion("ups <>", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsGreaterThan(Integer value) {
            addCriterion("ups >", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ups >=", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsLessThan(Integer value) {
            addCriterion("ups <", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsLessThanOrEqualTo(Integer value) {
            addCriterion("ups <=", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsIn(List<Integer> values) {
            addCriterion("ups in", values, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotIn(List<Integer> values) {
            addCriterion("ups not in", values, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsBetween(Integer value1, Integer value2) {
            addCriterion("ups between", value1, value2, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotBetween(Integer value1, Integer value2) {
            addCriterion("ups not between", value1, value2, "ups");
            return (Criteria) this;
        }

        public Criteria andQtmhIsNull() {
            addCriterion("qtmh is null");
            return (Criteria) this;
        }

        public Criteria andQtmhIsNotNull() {
            addCriterion("qtmh is not null");
            return (Criteria) this;
        }

        public Criteria andQtmhEqualTo(Integer value) {
            addCriterion("qtmh =", value, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhNotEqualTo(Integer value) {
            addCriterion("qtmh <>", value, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhGreaterThan(Integer value) {
            addCriterion("qtmh >", value, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhGreaterThanOrEqualTo(Integer value) {
            addCriterion("qtmh >=", value, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhLessThan(Integer value) {
            addCriterion("qtmh <", value, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhLessThanOrEqualTo(Integer value) {
            addCriterion("qtmh <=", value, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhIn(List<Integer> values) {
            addCriterion("qtmh in", values, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhNotIn(List<Integer> values) {
            addCriterion("qtmh not in", values, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhBetween(Integer value1, Integer value2) {
            addCriterion("qtmh between", value1, value2, "qtmh");
            return (Criteria) this;
        }

        public Criteria andQtmhNotBetween(Integer value1, Integer value2) {
            addCriterion("qtmh not between", value1, value2, "qtmh");
            return (Criteria) this;
        }

        public Criteria andKtIsNull() {
            addCriterion("kt is null");
            return (Criteria) this;
        }

        public Criteria andKtIsNotNull() {
            addCriterion("kt is not null");
            return (Criteria) this;
        }

        public Criteria andKtEqualTo(Integer value) {
            addCriterion("kt =", value, "kt");
            return (Criteria) this;
        }

        public Criteria andKtNotEqualTo(Integer value) {
            addCriterion("kt <>", value, "kt");
            return (Criteria) this;
        }

        public Criteria andKtGreaterThan(Integer value) {
            addCriterion("kt >", value, "kt");
            return (Criteria) this;
        }

        public Criteria andKtGreaterThanOrEqualTo(Integer value) {
            addCriterion("kt >=", value, "kt");
            return (Criteria) this;
        }

        public Criteria andKtLessThan(Integer value) {
            addCriterion("kt <", value, "kt");
            return (Criteria) this;
        }

        public Criteria andKtLessThanOrEqualTo(Integer value) {
            addCriterion("kt <=", value, "kt");
            return (Criteria) this;
        }

        public Criteria andKtIn(List<Integer> values) {
            addCriterion("kt in", values, "kt");
            return (Criteria) this;
        }

        public Criteria andKtNotIn(List<Integer> values) {
            addCriterion("kt not in", values, "kt");
            return (Criteria) this;
        }

        public Criteria andKtBetween(Integer value1, Integer value2) {
            addCriterion("kt between", value1, value2, "kt");
            return (Criteria) this;
        }

        public Criteria andKtNotBetween(Integer value1, Integer value2) {
            addCriterion("kt not between", value1, value2, "kt");
            return (Criteria) this;
        }

        public Criteria andYcyyIsNull() {
            addCriterion("ycyy is null");
            return (Criteria) this;
        }

        public Criteria andYcyyIsNotNull() {
            addCriterion("ycyy is not null");
            return (Criteria) this;
        }

        public Criteria andYcyyEqualTo(String value) {
            addCriterion("ycyy =", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyNotEqualTo(String value) {
            addCriterion("ycyy <>", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyGreaterThan(String value) {
            addCriterion("ycyy >", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyGreaterThanOrEqualTo(String value) {
            addCriterion("ycyy >=", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyLessThan(String value) {
            addCriterion("ycyy <", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyLessThanOrEqualTo(String value) {
            addCriterion("ycyy <=", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyLike(String value) {
            addCriterion("ycyy like", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyNotLike(String value) {
            addCriterion("ycyy not like", value, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyIn(List<String> values) {
            addCriterion("ycyy in", values, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyNotIn(List<String> values) {
            addCriterion("ycyy not in", values, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyBetween(String value1, String value2) {
            addCriterion("ycyy between", value1, value2, "ycyy");
            return (Criteria) this;
        }

        public Criteria andYcyyNotBetween(String value1, String value2) {
            addCriterion("ycyy not between", value1, value2, "ycyy");
            return (Criteria) this;
        }

        public Criteria andExaminerIsNull() {
            addCriterion("examiner is null");
            return (Criteria) this;
        }

        public Criteria andExaminerIsNotNull() {
            addCriterion("examiner is not null");
            return (Criteria) this;
        }

        public Criteria andExaminerEqualTo(String value) {
            addCriterion("examiner =", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerNotEqualTo(String value) {
            addCriterion("examiner <>", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerGreaterThan(String value) {
            addCriterion("examiner >", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerGreaterThanOrEqualTo(String value) {
            addCriterion("examiner >=", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerLessThan(String value) {
            addCriterion("examiner <", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerLessThanOrEqualTo(String value) {
            addCriterion("examiner <=", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerLike(String value) {
            addCriterion("examiner like", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerNotLike(String value) {
            addCriterion("examiner not like", value, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerIn(List<String> values) {
            addCriterion("examiner in", values, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerNotIn(List<String> values) {
            addCriterion("examiner not in", values, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerBetween(String value1, String value2) {
            addCriterion("examiner between", value1, value2, "examiner");
            return (Criteria) this;
        }

        public Criteria andExaminerNotBetween(String value1, String value2) {
            addCriterion("examiner not between", value1, value2, "examiner");
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