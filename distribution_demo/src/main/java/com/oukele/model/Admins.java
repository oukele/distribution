package com.oukele.model;

public class Admins {
    private String adminsId;

    private String adminsName;

    private Integer adminsSex;

    private Integer adminsState;

    private String adminsCity;

    private String adminsAddress;

    private String adminsPassword;

    private String adminsTel;

    private String adminsRemarks;

    private String clientId;

    public String getAdminsId() {
        return adminsId;
    }

    public void setAdminsId(String adminsId) {
        this.adminsId = adminsId == null ? null : adminsId.trim();
    }

    public String getAdminsName() {
        return adminsName;
    }

    public void setAdminsName(String adminsName) {
        this.adminsName = adminsName == null ? null : adminsName.trim();
    }

    public Integer getAdminsSex() {
        return adminsSex;
    }

    public void setAdminsSex(Integer adminsSex) {
        this.adminsSex = adminsSex;
    }

    public Integer getAdminsState() {
        return adminsState;
    }

    public void setAdminsState(Integer adminsState) {
        this.adminsState = adminsState;
    }

    public String getAdminsCity() {
        return adminsCity;
    }

    public void setAdminsCity(String adminsCity) {
        this.adminsCity = adminsCity == null ? null : adminsCity.trim();
    }

    public String getAdminsAddress() {
        return adminsAddress;
    }

    public void setAdminsAddress(String adminsAddress) {
        this.adminsAddress = adminsAddress == null ? null : adminsAddress.trim();
    }

    public String getAdminsPassword() {
        return adminsPassword;
    }

    public void setAdminsPassword(String adminsPassword) {
        this.adminsPassword = adminsPassword == null ? null : adminsPassword.trim();
    }

    public String getAdminsTel() {
        return adminsTel;
    }

    public void setAdminsTel(String adminsTel) {
        this.adminsTel = adminsTel == null ? null : adminsTel.trim();
    }

    public String getAdminsRemarks() {
        return adminsRemarks;
    }

    public void setAdminsRemarks(String adminsRemarks) {
        this.adminsRemarks = adminsRemarks == null ? null : adminsRemarks.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }
}