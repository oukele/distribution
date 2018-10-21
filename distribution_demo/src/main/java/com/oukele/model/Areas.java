package com.oukele.model;

public class Areas {
    private Integer areasId;

    private String areasName;

    private Long areasPrice;

    private String areasRemarks;

    private String cityId;

    public Integer getAreasId() {
        return areasId;
    }

    public void setAreasId(Integer areasId) {
        this.areasId = areasId;
    }

    public String getAreasName() {
        return areasName;
    }

    public void setAreasName(String areasName) {
        this.areasName = areasName == null ? null : areasName.trim();
    }

    public Long getAreasPrice() {
        return areasPrice;
    }

    public void setAreasPrice(Long areasPrice) {
        this.areasPrice = areasPrice;
    }

    public String getAreasRemarks() {
        return areasRemarks;
    }

    public void setAreasRemarks(String areasRemarks) {
        this.areasRemarks = areasRemarks == null ? null : areasRemarks.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }
}