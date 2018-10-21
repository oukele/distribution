package com.oukele.model;

public class Station {
    private Integer stationId;

    private String stationName;

    private String stationTel;

    private String stationAddress;

    private String stationRemarks;

    private String provinceId;

    private String cityId;

    private String adminsId;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationTel() {
        return stationTel;
    }

    public void setStationTel(String stationTel) {
        this.stationTel = stationTel == null ? null : stationTel.trim();
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress == null ? null : stationAddress.trim();
    }

    public String getStationRemarks() {
        return stationRemarks;
    }

    public void setStationRemarks(String stationRemarks) {
        this.stationRemarks = stationRemarks == null ? null : stationRemarks.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getAdminsId() {
        return adminsId;
    }

    public void setAdminsId(String adminsId) {
        this.adminsId = adminsId == null ? null : adminsId.trim();
    }
}