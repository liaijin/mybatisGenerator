package com.qcloud.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobPosition implements Serializable {
    private Long id;

    private Integer platformType;

    private String searchText;

    private String companyid;

    private String companyurl;

    private String companyfullname;

    private String positionid;

    private String positionurl;

    private String positionname;

    private Date createtime;

    private String positionadvantage;

    private String workyear;

    private String education;

    private String jobnature;

    private String salary;

    private Integer cityId;

    private String industryfield;

    private String district;

    private String businesszones;

    private String positionlables;

    private String industrylables;

    private String longitude;

    private String latitude;

    private Date lastlogin;

    private String firsttype;

    private String secondtype;

    private Boolean isschooljob;

    private String subwayline;

    private String stationname;

    private String linestaion;

    private String formatcreatetime;

    private Boolean isDeleted;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText == null ? null : searchText.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyurl() {
        return companyurl;
    }

    public void setCompanyurl(String companyurl) {
        this.companyurl = companyurl == null ? null : companyurl.trim();
    }

    public String getCompanyfullname() {
        return companyfullname;
    }

    public void setCompanyfullname(String companyfullname) {
        this.companyfullname = companyfullname == null ? null : companyfullname.trim();
    }

    public String getPositionid() {
        return positionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid == null ? null : positionid.trim();
    }

    public String getPositionurl() {
        return positionurl;
    }

    public void setPositionurl(String positionurl) {
        this.positionurl = positionurl == null ? null : positionurl.trim();
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPositionadvantage() {
        return positionadvantage;
    }

    public void setPositionadvantage(String positionadvantage) {
        this.positionadvantage = positionadvantage == null ? null : positionadvantage.trim();
    }

    public String getWorkyear() {
        return workyear;
    }

    public void setWorkyear(String workyear) {
        this.workyear = workyear == null ? null : workyear.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getJobnature() {
        return jobnature;
    }

    public void setJobnature(String jobnature) {
        this.jobnature = jobnature == null ? null : jobnature.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getIndustryfield() {
        return industryfield;
    }

    public void setIndustryfield(String industryfield) {
        this.industryfield = industryfield == null ? null : industryfield.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getBusinesszones() {
        return businesszones;
    }

    public void setBusinesszones(String businesszones) {
        this.businesszones = businesszones == null ? null : businesszones.trim();
    }

    public String getPositionlables() {
        return positionlables;
    }

    public void setPositionlables(String positionlables) {
        this.positionlables = positionlables == null ? null : positionlables.trim();
    }

    public String getIndustrylables() {
        return industrylables;
    }

    public void setIndustrylables(String industrylables) {
        this.industrylables = industrylables == null ? null : industrylables.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getFirsttype() {
        return firsttype;
    }

    public void setFirsttype(String firsttype) {
        this.firsttype = firsttype == null ? null : firsttype.trim();
    }

    public String getSecondtype() {
        return secondtype;
    }

    public void setSecondtype(String secondtype) {
        this.secondtype = secondtype == null ? null : secondtype.trim();
    }

    public Boolean getIsschooljob() {
        return isschooljob;
    }

    public void setIsschooljob(Boolean isschooljob) {
        this.isschooljob = isschooljob;
    }

    public String getSubwayline() {
        return subwayline;
    }

    public void setSubwayline(String subwayline) {
        this.subwayline = subwayline == null ? null : subwayline.trim();
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

    public String getLinestaion() {
        return linestaion;
    }

    public void setLinestaion(String linestaion) {
        this.linestaion = linestaion == null ? null : linestaion.trim();
    }

    public String getFormatcreatetime() {
        return formatcreatetime;
    }

    public void setFormatcreatetime(String formatcreatetime) {
        this.formatcreatetime = formatcreatetime == null ? null : formatcreatetime.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}