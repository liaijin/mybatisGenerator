package com.qcloud.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobPositionExample() {
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

        public Criteria andPlatformTypeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeEqualTo(Integer value) {
            addCriterion("platform_type =", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotEqualTo(Integer value) {
            addCriterion("platform_type <>", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThan(Integer value) {
            addCriterion("platform_type >", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_type >=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThan(Integer value) {
            addCriterion("platform_type <", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThanOrEqualTo(Integer value) {
            addCriterion("platform_type <=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIn(List<Integer> values) {
            addCriterion("platform_type in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotIn(List<Integer> values) {
            addCriterion("platform_type not in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeBetween(Integer value1, Integer value2) {
            addCriterion("platform_type between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_type not between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andSearchTextIsNull() {
            addCriterion("search_text is null");
            return (Criteria) this;
        }

        public Criteria andSearchTextIsNotNull() {
            addCriterion("search_text is not null");
            return (Criteria) this;
        }

        public Criteria andSearchTextEqualTo(String value) {
            addCriterion("search_text =", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextNotEqualTo(String value) {
            addCriterion("search_text <>", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextGreaterThan(String value) {
            addCriterion("search_text >", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextGreaterThanOrEqualTo(String value) {
            addCriterion("search_text >=", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextLessThan(String value) {
            addCriterion("search_text <", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextLessThanOrEqualTo(String value) {
            addCriterion("search_text <=", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextLike(String value) {
            addCriterion("search_text like", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextNotLike(String value) {
            addCriterion("search_text not like", value, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextIn(List<String> values) {
            addCriterion("search_text in", values, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextNotIn(List<String> values) {
            addCriterion("search_text not in", values, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextBetween(String value1, String value2) {
            addCriterion("search_text between", value1, value2, "searchText");
            return (Criteria) this;
        }

        public Criteria andSearchTextNotBetween(String value1, String value2) {
            addCriterion("search_text not between", value1, value2, "searchText");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("companyId like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("companyId not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyurlIsNull() {
            addCriterion("companyUrl is null");
            return (Criteria) this;
        }

        public Criteria andCompanyurlIsNotNull() {
            addCriterion("companyUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyurlEqualTo(String value) {
            addCriterion("companyUrl =", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlNotEqualTo(String value) {
            addCriterion("companyUrl <>", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlGreaterThan(String value) {
            addCriterion("companyUrl >", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlGreaterThanOrEqualTo(String value) {
            addCriterion("companyUrl >=", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlLessThan(String value) {
            addCriterion("companyUrl <", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlLessThanOrEqualTo(String value) {
            addCriterion("companyUrl <=", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlLike(String value) {
            addCriterion("companyUrl like", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlNotLike(String value) {
            addCriterion("companyUrl not like", value, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlIn(List<String> values) {
            addCriterion("companyUrl in", values, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlNotIn(List<String> values) {
            addCriterion("companyUrl not in", values, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlBetween(String value1, String value2) {
            addCriterion("companyUrl between", value1, value2, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyurlNotBetween(String value1, String value2) {
            addCriterion("companyUrl not between", value1, value2, "companyurl");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameIsNull() {
            addCriterion("companyFullName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameIsNotNull() {
            addCriterion("companyFullName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameEqualTo(String value) {
            addCriterion("companyFullName =", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotEqualTo(String value) {
            addCriterion("companyFullName <>", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameGreaterThan(String value) {
            addCriterion("companyFullName >", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("companyFullName >=", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameLessThan(String value) {
            addCriterion("companyFullName <", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameLessThanOrEqualTo(String value) {
            addCriterion("companyFullName <=", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameLike(String value) {
            addCriterion("companyFullName like", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotLike(String value) {
            addCriterion("companyFullName not like", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameIn(List<String> values) {
            addCriterion("companyFullName in", values, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotIn(List<String> values) {
            addCriterion("companyFullName not in", values, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameBetween(String value1, String value2) {
            addCriterion("companyFullName between", value1, value2, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotBetween(String value1, String value2) {
            addCriterion("companyFullName not between", value1, value2, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNull() {
            addCriterion("positionId is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionId is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(String value) {
            addCriterion("positionId =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(String value) {
            addCriterion("positionId <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(String value) {
            addCriterion("positionId >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(String value) {
            addCriterion("positionId >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(String value) {
            addCriterion("positionId <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(String value) {
            addCriterion("positionId <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLike(String value) {
            addCriterion("positionId like", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotLike(String value) {
            addCriterion("positionId not like", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<String> values) {
            addCriterion("positionId in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<String> values) {
            addCriterion("positionId not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(String value1, String value2) {
            addCriterion("positionId between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(String value1, String value2) {
            addCriterion("positionId not between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionurlIsNull() {
            addCriterion("positionUrl is null");
            return (Criteria) this;
        }

        public Criteria andPositionurlIsNotNull() {
            addCriterion("positionUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPositionurlEqualTo(String value) {
            addCriterion("positionUrl =", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlNotEqualTo(String value) {
            addCriterion("positionUrl <>", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlGreaterThan(String value) {
            addCriterion("positionUrl >", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlGreaterThanOrEqualTo(String value) {
            addCriterion("positionUrl >=", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlLessThan(String value) {
            addCriterion("positionUrl <", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlLessThanOrEqualTo(String value) {
            addCriterion("positionUrl <=", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlLike(String value) {
            addCriterion("positionUrl like", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlNotLike(String value) {
            addCriterion("positionUrl not like", value, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlIn(List<String> values) {
            addCriterion("positionUrl in", values, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlNotIn(List<String> values) {
            addCriterion("positionUrl not in", values, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlBetween(String value1, String value2) {
            addCriterion("positionUrl between", value1, value2, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionurlNotBetween(String value1, String value2) {
            addCriterion("positionUrl not between", value1, value2, "positionurl");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("positionName is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("positionName is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("positionName =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("positionName <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("positionName >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("positionName >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("positionName <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("positionName <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("positionName like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("positionName not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("positionName in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("positionName not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("positionName between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("positionName not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageIsNull() {
            addCriterion("positionAdvantage is null");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageIsNotNull() {
            addCriterion("positionAdvantage is not null");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageEqualTo(String value) {
            addCriterion("positionAdvantage =", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotEqualTo(String value) {
            addCriterion("positionAdvantage <>", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageGreaterThan(String value) {
            addCriterion("positionAdvantage >", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageGreaterThanOrEqualTo(String value) {
            addCriterion("positionAdvantage >=", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageLessThan(String value) {
            addCriterion("positionAdvantage <", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageLessThanOrEqualTo(String value) {
            addCriterion("positionAdvantage <=", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageLike(String value) {
            addCriterion("positionAdvantage like", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotLike(String value) {
            addCriterion("positionAdvantage not like", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageIn(List<String> values) {
            addCriterion("positionAdvantage in", values, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotIn(List<String> values) {
            addCriterion("positionAdvantage not in", values, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageBetween(String value1, String value2) {
            addCriterion("positionAdvantage between", value1, value2, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotBetween(String value1, String value2) {
            addCriterion("positionAdvantage not between", value1, value2, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andWorkyearIsNull() {
            addCriterion("workYear is null");
            return (Criteria) this;
        }

        public Criteria andWorkyearIsNotNull() {
            addCriterion("workYear is not null");
            return (Criteria) this;
        }

        public Criteria andWorkyearEqualTo(String value) {
            addCriterion("workYear =", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotEqualTo(String value) {
            addCriterion("workYear <>", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearGreaterThan(String value) {
            addCriterion("workYear >", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearGreaterThanOrEqualTo(String value) {
            addCriterion("workYear >=", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLessThan(String value) {
            addCriterion("workYear <", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLessThanOrEqualTo(String value) {
            addCriterion("workYear <=", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLike(String value) {
            addCriterion("workYear like", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotLike(String value) {
            addCriterion("workYear not like", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearIn(List<String> values) {
            addCriterion("workYear in", values, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotIn(List<String> values) {
            addCriterion("workYear not in", values, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearBetween(String value1, String value2) {
            addCriterion("workYear between", value1, value2, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotBetween(String value1, String value2) {
            addCriterion("workYear not between", value1, value2, "workyear");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andJobnatureIsNull() {
            addCriterion("jobNature is null");
            return (Criteria) this;
        }

        public Criteria andJobnatureIsNotNull() {
            addCriterion("jobNature is not null");
            return (Criteria) this;
        }

        public Criteria andJobnatureEqualTo(String value) {
            addCriterion("jobNature =", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotEqualTo(String value) {
            addCriterion("jobNature <>", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureGreaterThan(String value) {
            addCriterion("jobNature >", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureGreaterThanOrEqualTo(String value) {
            addCriterion("jobNature >=", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureLessThan(String value) {
            addCriterion("jobNature <", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureLessThanOrEqualTo(String value) {
            addCriterion("jobNature <=", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureLike(String value) {
            addCriterion("jobNature like", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotLike(String value) {
            addCriterion("jobNature not like", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureIn(List<String> values) {
            addCriterion("jobNature in", values, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotIn(List<String> values) {
            addCriterion("jobNature not in", values, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureBetween(String value1, String value2) {
            addCriterion("jobNature between", value1, value2, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotBetween(String value1, String value2) {
            addCriterion("jobNature not between", value1, value2, "jobnature");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIsNull() {
            addCriterion("industryField is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIsNotNull() {
            addCriterion("industryField is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldEqualTo(String value) {
            addCriterion("industryField =", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotEqualTo(String value) {
            addCriterion("industryField <>", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldGreaterThan(String value) {
            addCriterion("industryField >", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldGreaterThanOrEqualTo(String value) {
            addCriterion("industryField >=", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLessThan(String value) {
            addCriterion("industryField <", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLessThanOrEqualTo(String value) {
            addCriterion("industryField <=", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLike(String value) {
            addCriterion("industryField like", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotLike(String value) {
            addCriterion("industryField not like", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIn(List<String> values) {
            addCriterion("industryField in", values, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotIn(List<String> values) {
            addCriterion("industryField not in", values, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldBetween(String value1, String value2) {
            addCriterion("industryField between", value1, value2, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotBetween(String value1, String value2) {
            addCriterion("industryField not between", value1, value2, "industryfield");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesIsNull() {
            addCriterion("businessZones is null");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesIsNotNull() {
            addCriterion("businessZones is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesEqualTo(String value) {
            addCriterion("businessZones =", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotEqualTo(String value) {
            addCriterion("businessZones <>", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesGreaterThan(String value) {
            addCriterion("businessZones >", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesGreaterThanOrEqualTo(String value) {
            addCriterion("businessZones >=", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesLessThan(String value) {
            addCriterion("businessZones <", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesLessThanOrEqualTo(String value) {
            addCriterion("businessZones <=", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesLike(String value) {
            addCriterion("businessZones like", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotLike(String value) {
            addCriterion("businessZones not like", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesIn(List<String> values) {
            addCriterion("businessZones in", values, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotIn(List<String> values) {
            addCriterion("businessZones not in", values, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesBetween(String value1, String value2) {
            addCriterion("businessZones between", value1, value2, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotBetween(String value1, String value2) {
            addCriterion("businessZones not between", value1, value2, "businesszones");
            return (Criteria) this;
        }

        public Criteria andPositionlablesIsNull() {
            addCriterion("positionLables is null");
            return (Criteria) this;
        }

        public Criteria andPositionlablesIsNotNull() {
            addCriterion("positionLables is not null");
            return (Criteria) this;
        }

        public Criteria andPositionlablesEqualTo(String value) {
            addCriterion("positionLables =", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesNotEqualTo(String value) {
            addCriterion("positionLables <>", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesGreaterThan(String value) {
            addCriterion("positionLables >", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesGreaterThanOrEqualTo(String value) {
            addCriterion("positionLables >=", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesLessThan(String value) {
            addCriterion("positionLables <", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesLessThanOrEqualTo(String value) {
            addCriterion("positionLables <=", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesLike(String value) {
            addCriterion("positionLables like", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesNotLike(String value) {
            addCriterion("positionLables not like", value, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesIn(List<String> values) {
            addCriterion("positionLables in", values, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesNotIn(List<String> values) {
            addCriterion("positionLables not in", values, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesBetween(String value1, String value2) {
            addCriterion("positionLables between", value1, value2, "positionlables");
            return (Criteria) this;
        }

        public Criteria andPositionlablesNotBetween(String value1, String value2) {
            addCriterion("positionLables not between", value1, value2, "positionlables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesIsNull() {
            addCriterion("industryLables is null");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesIsNotNull() {
            addCriterion("industryLables is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesEqualTo(String value) {
            addCriterion("industryLables =", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesNotEqualTo(String value) {
            addCriterion("industryLables <>", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesGreaterThan(String value) {
            addCriterion("industryLables >", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesGreaterThanOrEqualTo(String value) {
            addCriterion("industryLables >=", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesLessThan(String value) {
            addCriterion("industryLables <", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesLessThanOrEqualTo(String value) {
            addCriterion("industryLables <=", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesLike(String value) {
            addCriterion("industryLables like", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesNotLike(String value) {
            addCriterion("industryLables not like", value, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesIn(List<String> values) {
            addCriterion("industryLables in", values, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesNotIn(List<String> values) {
            addCriterion("industryLables not in", values, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesBetween(String value1, String value2) {
            addCriterion("industryLables between", value1, value2, "industrylables");
            return (Criteria) this;
        }

        public Criteria andIndustrylablesNotBetween(String value1, String value2) {
            addCriterion("industryLables not between", value1, value2, "industrylables");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("lastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("lastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("lastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("lastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("lastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("lastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("lastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("lastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("lastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andFirsttypeIsNull() {
            addCriterion("firstType is null");
            return (Criteria) this;
        }

        public Criteria andFirsttypeIsNotNull() {
            addCriterion("firstType is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttypeEqualTo(String value) {
            addCriterion("firstType =", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeNotEqualTo(String value) {
            addCriterion("firstType <>", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeGreaterThan(String value) {
            addCriterion("firstType >", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeGreaterThanOrEqualTo(String value) {
            addCriterion("firstType >=", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeLessThan(String value) {
            addCriterion("firstType <", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeLessThanOrEqualTo(String value) {
            addCriterion("firstType <=", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeLike(String value) {
            addCriterion("firstType like", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeNotLike(String value) {
            addCriterion("firstType not like", value, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeIn(List<String> values) {
            addCriterion("firstType in", values, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeNotIn(List<String> values) {
            addCriterion("firstType not in", values, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeBetween(String value1, String value2) {
            addCriterion("firstType between", value1, value2, "firsttype");
            return (Criteria) this;
        }

        public Criteria andFirsttypeNotBetween(String value1, String value2) {
            addCriterion("firstType not between", value1, value2, "firsttype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeIsNull() {
            addCriterion("secondType is null");
            return (Criteria) this;
        }

        public Criteria andSecondtypeIsNotNull() {
            addCriterion("secondType is not null");
            return (Criteria) this;
        }

        public Criteria andSecondtypeEqualTo(String value) {
            addCriterion("secondType =", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeNotEqualTo(String value) {
            addCriterion("secondType <>", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeGreaterThan(String value) {
            addCriterion("secondType >", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeGreaterThanOrEqualTo(String value) {
            addCriterion("secondType >=", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeLessThan(String value) {
            addCriterion("secondType <", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeLessThanOrEqualTo(String value) {
            addCriterion("secondType <=", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeLike(String value) {
            addCriterion("secondType like", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeNotLike(String value) {
            addCriterion("secondType not like", value, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeIn(List<String> values) {
            addCriterion("secondType in", values, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeNotIn(List<String> values) {
            addCriterion("secondType not in", values, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeBetween(String value1, String value2) {
            addCriterion("secondType between", value1, value2, "secondtype");
            return (Criteria) this;
        }

        public Criteria andSecondtypeNotBetween(String value1, String value2) {
            addCriterion("secondType not between", value1, value2, "secondtype");
            return (Criteria) this;
        }

        public Criteria andIsschooljobIsNull() {
            addCriterion("isSchoolJob is null");
            return (Criteria) this;
        }

        public Criteria andIsschooljobIsNotNull() {
            addCriterion("isSchoolJob is not null");
            return (Criteria) this;
        }

        public Criteria andIsschooljobEqualTo(Boolean value) {
            addCriterion("isSchoolJob =", value, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobNotEqualTo(Boolean value) {
            addCriterion("isSchoolJob <>", value, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobGreaterThan(Boolean value) {
            addCriterion("isSchoolJob >", value, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSchoolJob >=", value, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobLessThan(Boolean value) {
            addCriterion("isSchoolJob <", value, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobLessThanOrEqualTo(Boolean value) {
            addCriterion("isSchoolJob <=", value, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobIn(List<Boolean> values) {
            addCriterion("isSchoolJob in", values, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobNotIn(List<Boolean> values) {
            addCriterion("isSchoolJob not in", values, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobBetween(Boolean value1, Boolean value2) {
            addCriterion("isSchoolJob between", value1, value2, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andIsschooljobNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSchoolJob not between", value1, value2, "isschooljob");
            return (Criteria) this;
        }

        public Criteria andSubwaylineIsNull() {
            addCriterion("subwayline is null");
            return (Criteria) this;
        }

        public Criteria andSubwaylineIsNotNull() {
            addCriterion("subwayline is not null");
            return (Criteria) this;
        }

        public Criteria andSubwaylineEqualTo(String value) {
            addCriterion("subwayline =", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineNotEqualTo(String value) {
            addCriterion("subwayline <>", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineGreaterThan(String value) {
            addCriterion("subwayline >", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineGreaterThanOrEqualTo(String value) {
            addCriterion("subwayline >=", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineLessThan(String value) {
            addCriterion("subwayline <", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineLessThanOrEqualTo(String value) {
            addCriterion("subwayline <=", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineLike(String value) {
            addCriterion("subwayline like", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineNotLike(String value) {
            addCriterion("subwayline not like", value, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineIn(List<String> values) {
            addCriterion("subwayline in", values, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineNotIn(List<String> values) {
            addCriterion("subwayline not in", values, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineBetween(String value1, String value2) {
            addCriterion("subwayline between", value1, value2, "subwayline");
            return (Criteria) this;
        }

        public Criteria andSubwaylineNotBetween(String value1, String value2) {
            addCriterion("subwayline not between", value1, value2, "subwayline");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNull() {
            addCriterion("stationname is null");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNotNull() {
            addCriterion("stationname is not null");
            return (Criteria) this;
        }

        public Criteria andStationnameEqualTo(String value) {
            addCriterion("stationname =", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotEqualTo(String value) {
            addCriterion("stationname <>", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThan(String value) {
            addCriterion("stationname >", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThanOrEqualTo(String value) {
            addCriterion("stationname >=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThan(String value) {
            addCriterion("stationname <", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThanOrEqualTo(String value) {
            addCriterion("stationname <=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLike(String value) {
            addCriterion("stationname like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotLike(String value) {
            addCriterion("stationname not like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameIn(List<String> values) {
            addCriterion("stationname in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotIn(List<String> values) {
            addCriterion("stationname not in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameBetween(String value1, String value2) {
            addCriterion("stationname between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotBetween(String value1, String value2) {
            addCriterion("stationname not between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andLinestaionIsNull() {
            addCriterion("linestaion is null");
            return (Criteria) this;
        }

        public Criteria andLinestaionIsNotNull() {
            addCriterion("linestaion is not null");
            return (Criteria) this;
        }

        public Criteria andLinestaionEqualTo(String value) {
            addCriterion("linestaion =", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionNotEqualTo(String value) {
            addCriterion("linestaion <>", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionGreaterThan(String value) {
            addCriterion("linestaion >", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionGreaterThanOrEqualTo(String value) {
            addCriterion("linestaion >=", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionLessThan(String value) {
            addCriterion("linestaion <", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionLessThanOrEqualTo(String value) {
            addCriterion("linestaion <=", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionLike(String value) {
            addCriterion("linestaion like", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionNotLike(String value) {
            addCriterion("linestaion not like", value, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionIn(List<String> values) {
            addCriterion("linestaion in", values, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionNotIn(List<String> values) {
            addCriterion("linestaion not in", values, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionBetween(String value1, String value2) {
            addCriterion("linestaion between", value1, value2, "linestaion");
            return (Criteria) this;
        }

        public Criteria andLinestaionNotBetween(String value1, String value2) {
            addCriterion("linestaion not between", value1, value2, "linestaion");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeIsNull() {
            addCriterion("formatCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeIsNotNull() {
            addCriterion("formatCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeEqualTo(String value) {
            addCriterion("formatCreateTime =", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotEqualTo(String value) {
            addCriterion("formatCreateTime <>", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeGreaterThan(String value) {
            addCriterion("formatCreateTime >", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("formatCreateTime >=", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeLessThan(String value) {
            addCriterion("formatCreateTime <", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("formatCreateTime <=", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeLike(String value) {
            addCriterion("formatCreateTime like", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotLike(String value) {
            addCriterion("formatCreateTime not like", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeIn(List<String> values) {
            addCriterion("formatCreateTime in", values, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotIn(List<String> values) {
            addCriterion("formatCreateTime not in", values, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeBetween(String value1, String value2) {
            addCriterion("formatCreateTime between", value1, value2, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotBetween(String value1, String value2) {
            addCriterion("formatCreateTime not between", value1, value2, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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