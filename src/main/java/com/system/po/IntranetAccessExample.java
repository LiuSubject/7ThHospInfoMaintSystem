package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class IntranetAccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntranetAccessExample() {
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

        public Criteria andCpLinkIdIsNull() {
            addCriterion("cp_link_id is null");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdIsNotNull() {
            addCriterion("cp_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdEqualTo(Integer value) {
            addCriterion("cp_link_id =", value, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdNotEqualTo(Integer value) {
            addCriterion("cp_link_id <>", value, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdGreaterThan(Integer value) {
            addCriterion("cp_link_id >", value, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_link_id >=", value, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdLessThan(Integer value) {
            addCriterion("cp_link_id <", value, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("cp_link_id <=", value, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdIn(List<Integer> values) {
            addCriterion("cp_link_id in", values, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdNotIn(List<Integer> values) {
            addCriterion("cp_link_id not in", values, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdBetween(Integer value1, Integer value2) {
            addCriterion("cp_link_id between", value1, value2, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andCpLinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_link_id not between", value1, value2, "cpLinkId");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("access_type is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(Integer value) {
            addCriterion("access_type =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(Integer value) {
            addCriterion("access_type <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(Integer value) {
            addCriterion("access_type >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_type >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(Integer value) {
            addCriterion("access_type <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("access_type <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<Integer> values) {
            addCriterion("access_type in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<Integer> values) {
            addCriterion("access_type not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(Integer value1, Integer value2) {
            addCriterion("access_type between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("access_type not between", value1, value2, "accessType");
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

        public Criteria andAccessAddressIsNull() {
            addCriterion("access_address is null");
            return (Criteria) this;
        }

        public Criteria andAccessAddressIsNotNull() {
            addCriterion("access_address is not null");
            return (Criteria) this;
        }

        public Criteria andAccessAddressEqualTo(String value) {
            addCriterion("access_address =", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressNotEqualTo(String value) {
            addCriterion("access_address <>", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressGreaterThan(String value) {
            addCriterion("access_address >", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("access_address >=", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressLessThan(String value) {
            addCriterion("access_address <", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressLessThanOrEqualTo(String value) {
            addCriterion("access_address <=", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressLike(String value) {
            addCriterion("access_address like", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressNotLike(String value) {
            addCriterion("access_address not like", value, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressIn(List<String> values) {
            addCriterion("access_address in", values, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressNotIn(List<String> values) {
            addCriterion("access_address not in", values, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressBetween(String value1, String value2) {
            addCriterion("access_address between", value1, value2, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andAccessAddressNotBetween(String value1, String value2) {
            addCriterion("access_address not between", value1, value2, "accessAddress");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andCableTypeIsNull() {
            addCriterion("cable_type is null");
            return (Criteria) this;
        }

        public Criteria andCableTypeIsNotNull() {
            addCriterion("cable_type is not null");
            return (Criteria) this;
        }

        public Criteria andCableTypeEqualTo(Integer value) {
            addCriterion("cable_type =", value, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeNotEqualTo(Integer value) {
            addCriterion("cable_type <>", value, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeGreaterThan(Integer value) {
            addCriterion("cable_type >", value, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cable_type >=", value, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeLessThan(Integer value) {
            addCriterion("cable_type <", value, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cable_type <=", value, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeIn(List<Integer> values) {
            addCriterion("cable_type in", values, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeNotIn(List<Integer> values) {
            addCriterion("cable_type not in", values, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeBetween(Integer value1, Integer value2) {
            addCriterion("cable_type between", value1, value2, "cableType");
            return (Criteria) this;
        }

        public Criteria andCableTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cable_type not between", value1, value2, "cableType");
            return (Criteria) this;
        }

        public Criteria andWayTypeIsNull() {
            addCriterion("way_type is null");
            return (Criteria) this;
        }

        public Criteria andWayTypeIsNotNull() {
            addCriterion("way_type is not null");
            return (Criteria) this;
        }

        public Criteria andWayTypeEqualTo(Integer value) {
            addCriterion("way_type =", value, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeNotEqualTo(Integer value) {
            addCriterion("way_type <>", value, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeGreaterThan(Integer value) {
            addCriterion("way_type >", value, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_type >=", value, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeLessThan(Integer value) {
            addCriterion("way_type <", value, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("way_type <=", value, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeIn(List<Integer> values) {
            addCriterion("way_type in", values, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeNotIn(List<Integer> values) {
            addCriterion("way_type not in", values, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeBetween(Integer value1, Integer value2) {
            addCriterion("way_type between", value1, value2, "wayType");
            return (Criteria) this;
        }

        public Criteria andWayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("way_type not between", value1, value2, "wayType");
            return (Criteria) this;
        }

        public Criteria andLanPointsIsNull() {
            addCriterion("lan_points is null");
            return (Criteria) this;
        }

        public Criteria andLanPointsIsNotNull() {
            addCriterion("lan_points is not null");
            return (Criteria) this;
        }

        public Criteria andLanPointsEqualTo(Integer value) {
            addCriterion("lan_points =", value, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsNotEqualTo(Integer value) {
            addCriterion("lan_points <>", value, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsGreaterThan(Integer value) {
            addCriterion("lan_points >", value, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("lan_points >=", value, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsLessThan(Integer value) {
            addCriterion("lan_points <", value, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsLessThanOrEqualTo(Integer value) {
            addCriterion("lan_points <=", value, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsIn(List<Integer> values) {
            addCriterion("lan_points in", values, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsNotIn(List<Integer> values) {
            addCriterion("lan_points not in", values, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsBetween(Integer value1, Integer value2) {
            addCriterion("lan_points between", value1, value2, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("lan_points not between", value1, value2, "lanPoints");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentIsNull() {
            addCriterion("lan_equipment is null");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentIsNotNull() {
            addCriterion("lan_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentEqualTo(String value) {
            addCriterion("lan_equipment =", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentNotEqualTo(String value) {
            addCriterion("lan_equipment <>", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentGreaterThan(String value) {
            addCriterion("lan_equipment >", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("lan_equipment >=", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentLessThan(String value) {
            addCriterion("lan_equipment <", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentLessThanOrEqualTo(String value) {
            addCriterion("lan_equipment <=", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentLike(String value) {
            addCriterion("lan_equipment like", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentNotLike(String value) {
            addCriterion("lan_equipment not like", value, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentIn(List<String> values) {
            addCriterion("lan_equipment in", values, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentNotIn(List<String> values) {
            addCriterion("lan_equipment not in", values, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentBetween(String value1, String value2) {
            addCriterion("lan_equipment between", value1, value2, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andLanEquipmentNotBetween(String value1, String value2) {
            addCriterion("lan_equipment not between", value1, value2, "lanEquipment");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomIsNull() {
            addCriterion("dedicated_room is null");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomIsNotNull() {
            addCriterion("dedicated_room is not null");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomEqualTo(Integer value) {
            addCriterion("dedicated_room =", value, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomNotEqualTo(Integer value) {
            addCriterion("dedicated_room <>", value, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomGreaterThan(Integer value) {
            addCriterion("dedicated_room >", value, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("dedicated_room >=", value, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomLessThan(Integer value) {
            addCriterion("dedicated_room <", value, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomLessThanOrEqualTo(Integer value) {
            addCriterion("dedicated_room <=", value, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomIn(List<Integer> values) {
            addCriterion("dedicated_room in", values, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomNotIn(List<Integer> values) {
            addCriterion("dedicated_room not in", values, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomBetween(Integer value1, Integer value2) {
            addCriterion("dedicated_room between", value1, value2, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andDedicatedRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("dedicated_room not between", value1, value2, "dedicatedRoom");
            return (Criteria) this;
        }

        public Criteria andAirConditioningIsNull() {
            addCriterion("air_conditioning is null");
            return (Criteria) this;
        }

        public Criteria andAirConditioningIsNotNull() {
            addCriterion("air_conditioning is not null");
            return (Criteria) this;
        }

        public Criteria andAirConditioningEqualTo(Integer value) {
            addCriterion("air_conditioning =", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningNotEqualTo(Integer value) {
            addCriterion("air_conditioning <>", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningGreaterThan(Integer value) {
            addCriterion("air_conditioning >", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_conditioning >=", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningLessThan(Integer value) {
            addCriterion("air_conditioning <", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningLessThanOrEqualTo(Integer value) {
            addCriterion("air_conditioning <=", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningIn(List<Integer> values) {
            addCriterion("air_conditioning in", values, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningNotIn(List<Integer> values) {
            addCriterion("air_conditioning not in", values, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningBetween(Integer value1, Integer value2) {
            addCriterion("air_conditioning between", value1, value2, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningNotBetween(Integer value1, Integer value2) {
            addCriterion("air_conditioning not between", value1, value2, "airConditioning");
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

        public Criteria andWiringIsNull() {
            addCriterion("wiring is null");
            return (Criteria) this;
        }

        public Criteria andWiringIsNotNull() {
            addCriterion("wiring is not null");
            return (Criteria) this;
        }

        public Criteria andWiringEqualTo(Integer value) {
            addCriterion("wiring =", value, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringNotEqualTo(Integer value) {
            addCriterion("wiring <>", value, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringGreaterThan(Integer value) {
            addCriterion("wiring >", value, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringGreaterThanOrEqualTo(Integer value) {
            addCriterion("wiring >=", value, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringLessThan(Integer value) {
            addCriterion("wiring <", value, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringLessThanOrEqualTo(Integer value) {
            addCriterion("wiring <=", value, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringIn(List<Integer> values) {
            addCriterion("wiring in", values, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringNotIn(List<Integer> values) {
            addCriterion("wiring not in", values, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringBetween(Integer value1, Integer value2) {
            addCriterion("wiring between", value1, value2, "wiring");
            return (Criteria) this;
        }

        public Criteria andWiringNotBetween(Integer value1, Integer value2) {
            addCriterion("wiring not between", value1, value2, "wiring");
            return (Criteria) this;
        }

        public Criteria andCabinetIsNull() {
            addCriterion("cabinet is null");
            return (Criteria) this;
        }

        public Criteria andCabinetIsNotNull() {
            addCriterion("cabinet is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetEqualTo(Integer value) {
            addCriterion("cabinet =", value, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetNotEqualTo(Integer value) {
            addCriterion("cabinet <>", value, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetGreaterThan(Integer value) {
            addCriterion("cabinet >", value, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetGreaterThanOrEqualTo(Integer value) {
            addCriterion("cabinet >=", value, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetLessThan(Integer value) {
            addCriterion("cabinet <", value, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetLessThanOrEqualTo(Integer value) {
            addCriterion("cabinet <=", value, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetIn(List<Integer> values) {
            addCriterion("cabinet in", values, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetNotIn(List<Integer> values) {
            addCriterion("cabinet not in", values, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetBetween(Integer value1, Integer value2) {
            addCriterion("cabinet between", value1, value2, "cabinet");
            return (Criteria) this;
        }

        public Criteria andCabinetNotBetween(Integer value1, Integer value2) {
            addCriterion("cabinet not between", value1, value2, "cabinet");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeIsNull() {
            addCriterion("threaded_pipe is null");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeIsNotNull() {
            addCriterion("threaded_pipe is not null");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeEqualTo(Integer value) {
            addCriterion("threaded_pipe =", value, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeNotEqualTo(Integer value) {
            addCriterion("threaded_pipe <>", value, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeGreaterThan(Integer value) {
            addCriterion("threaded_pipe >", value, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeGreaterThanOrEqualTo(Integer value) {
            addCriterion("threaded_pipe >=", value, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeLessThan(Integer value) {
            addCriterion("threaded_pipe <", value, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeLessThanOrEqualTo(Integer value) {
            addCriterion("threaded_pipe <=", value, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeIn(List<Integer> values) {
            addCriterion("threaded_pipe in", values, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeNotIn(List<Integer> values) {
            addCriterion("threaded_pipe not in", values, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeBetween(Integer value1, Integer value2) {
            addCriterion("threaded_pipe between", value1, value2, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andThreadedPipeNotBetween(Integer value1, Integer value2) {
            addCriterion("threaded_pipe not between", value1, value2, "threadedPipe");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalIsNull() {
            addCriterion("dept_principal is null");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalIsNotNull() {
            addCriterion("dept_principal is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalEqualTo(String value) {
            addCriterion("dept_principal =", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalNotEqualTo(String value) {
            addCriterion("dept_principal <>", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalGreaterThan(String value) {
            addCriterion("dept_principal >", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("dept_principal >=", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalLessThan(String value) {
            addCriterion("dept_principal <", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalLessThanOrEqualTo(String value) {
            addCriterion("dept_principal <=", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalLike(String value) {
            addCriterion("dept_principal like", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalNotLike(String value) {
            addCriterion("dept_principal not like", value, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalIn(List<String> values) {
            addCriterion("dept_principal in", values, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalNotIn(List<String> values) {
            addCriterion("dept_principal not in", values, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalBetween(String value1, String value2) {
            addCriterion("dept_principal between", value1, value2, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andDeptPrincipalNotBetween(String value1, String value2) {
            addCriterion("dept_principal not between", value1, value2, "deptPrincipal");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIsNull() {
            addCriterion("principal_tel is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIsNotNull() {
            addCriterion("principal_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelEqualTo(String value) {
            addCriterion("principal_tel =", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotEqualTo(String value) {
            addCriterion("principal_tel <>", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelGreaterThan(String value) {
            addCriterion("principal_tel >", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelGreaterThanOrEqualTo(String value) {
            addCriterion("principal_tel >=", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLessThan(String value) {
            addCriterion("principal_tel <", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLessThanOrEqualTo(String value) {
            addCriterion("principal_tel <=", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLike(String value) {
            addCriterion("principal_tel like", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotLike(String value) {
            addCriterion("principal_tel not like", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIn(List<String> values) {
            addCriterion("principal_tel in", values, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotIn(List<String> values) {
            addCriterion("principal_tel not in", values, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelBetween(String value1, String value2) {
            addCriterion("principal_tel between", value1, value2, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotBetween(String value1, String value2) {
            addCriterion("principal_tel not between", value1, value2, "principalTel");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andChiefDeanIsNull() {
            addCriterion("chief_dean is null");
            return (Criteria) this;
        }

        public Criteria andChiefDeanIsNotNull() {
            addCriterion("chief_dean is not null");
            return (Criteria) this;
        }

        public Criteria andChiefDeanEqualTo(String value) {
            addCriterion("chief_dean =", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanNotEqualTo(String value) {
            addCriterion("chief_dean <>", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanGreaterThan(String value) {
            addCriterion("chief_dean >", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanGreaterThanOrEqualTo(String value) {
            addCriterion("chief_dean >=", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanLessThan(String value) {
            addCriterion("chief_dean <", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanLessThanOrEqualTo(String value) {
            addCriterion("chief_dean <=", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanLike(String value) {
            addCriterion("chief_dean like", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanNotLike(String value) {
            addCriterion("chief_dean not like", value, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanIn(List<String> values) {
            addCriterion("chief_dean in", values, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanNotIn(List<String> values) {
            addCriterion("chief_dean not in", values, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanBetween(String value1, String value2) {
            addCriterion("chief_dean between", value1, value2, "chiefDean");
            return (Criteria) this;
        }

        public Criteria andChiefDeanNotBetween(String value1, String value2) {
            addCriterion("chief_dean not between", value1, value2, "chiefDean");
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