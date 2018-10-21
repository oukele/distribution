package com.oukele.model;

import java.util.Date;

public class Clinet {
    private String clinetId;

    private String clinetName;

    private String clinetSex;

    private String clinetPassword;

    private String clinetTel;

    private Date clinetBirthdate;

    private String clinetAddress;

    private String clinetRemarks;

    private String userGroupId;

    public String getClinetId() {
        return clinetId;
    }

    public void setClinetId(String clinetId) {
        this.clinetId = clinetId == null ? null : clinetId.trim();
    }

    public String getClinetName() {
        return clinetName;
    }

    public void setClinetName(String clinetName) {
        this.clinetName = clinetName == null ? null : clinetName.trim();
    }

    public String getClinetSex() {
        return clinetSex;
    }

    public void setClinetSex(String clinetSex) {
        this.clinetSex = clinetSex == null ? null : clinetSex.trim();
    }

    public String getClinetPassword() {
        return clinetPassword;
    }

    public void setClinetPassword(String clinetPassword) {
        this.clinetPassword = clinetPassword == null ? null : clinetPassword.trim();
    }

    public String getClinetTel() {
        return clinetTel;
    }

    public void setClinetTel(String clinetTel) {
        this.clinetTel = clinetTel == null ? null : clinetTel.trim();
    }

    public Date getClinetBirthdate() {
        return clinetBirthdate;
    }

    public void setClinetBirthdate(Date clinetBirthdate) {
        this.clinetBirthdate = clinetBirthdate;
    }

    public String getClinetAddress() {
        return clinetAddress;
    }

    public void setClinetAddress(String clinetAddress) {
        this.clinetAddress = clinetAddress == null ? null : clinetAddress.trim();
    }

    public String getClinetRemarks() {
        return clinetRemarks;
    }

    public void setClinetRemarks(String clinetRemarks) {
        this.clinetRemarks = clinetRemarks == null ? null : clinetRemarks.trim();
    }

    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId == null ? null : userGroupId.trim();
    }
}