package com.hospital.ipd.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HFeiyongRecord implements Serializable {
    private Integer id;

    private String patientnum;

    private String patientname;

    private Long userId;

    private String feiyongxiangmu;

    private String userName;

    private BigDecimal pay;

    private String comments;

    private Boolean isDeleted;

    private Date gmtModified;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientnum() {
        return patientnum;
    }

    public void setPatientnum(String patientnum) {
        this.patientnum = patientnum == null ? null : patientnum.trim();
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFeiyongxiangmu() {
        return feiyongxiangmu;
    }

    public void setFeiyongxiangmu(String feiyongxiangmu) {
        this.feiyongxiangmu = feiyongxiangmu == null ? null : feiyongxiangmu.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public BigDecimal getPay() {
        return pay;
    }

    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}