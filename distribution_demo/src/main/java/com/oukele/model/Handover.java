package com.oukele.model;

import java.util.Date;

public class Handover {
    private String handoverStartCity;

    private String handoverEndCity;

    private String handoverReachedCity;

    private Integer handoverState;

    private Date handoverGeneratorDate;

    private String handoverRemarks;

    public String getHandoverStartCity() {
        return handoverStartCity;
    }

    public void setHandoverStartCity(String handoverStartCity) {
        this.handoverStartCity = handoverStartCity == null ? null : handoverStartCity.trim();
    }

    public String getHandoverEndCity() {
        return handoverEndCity;
    }

    public void setHandoverEndCity(String handoverEndCity) {
        this.handoverEndCity = handoverEndCity == null ? null : handoverEndCity.trim();
    }

    public String getHandoverReachedCity() {
        return handoverReachedCity;
    }

    public void setHandoverReachedCity(String handoverReachedCity) {
        this.handoverReachedCity = handoverReachedCity == null ? null : handoverReachedCity.trim();
    }

    public Integer getHandoverState() {
        return handoverState;
    }

    public void setHandoverState(Integer handoverState) {
        this.handoverState = handoverState;
    }

    public Date getHandoverGeneratorDate() {
        return handoverGeneratorDate;
    }

    public void setHandoverGeneratorDate(Date handoverGeneratorDate) {
        this.handoverGeneratorDate = handoverGeneratorDate;
    }

    public String getHandoverRemarks() {
        return handoverRemarks;
    }

    public void setHandoverRemarks(String handoverRemarks) {
        this.handoverRemarks = handoverRemarks == null ? null : handoverRemarks.trim();
    }
}