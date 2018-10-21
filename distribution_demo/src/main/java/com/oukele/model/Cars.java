package com.oukele.model;

import java.util.Date;

public class Cars {
    private String carsId;

    private String carsType;

    private String carsProductionAddress;

    private Date carsProductionBirthdate;

    private Date carsBuyBirthdate;

    private String carsRemarks;

    private String routeId;

    public String getCarsId() {
        return carsId;
    }

    public void setCarsId(String carsId) {
        this.carsId = carsId == null ? null : carsId.trim();
    }

    public String getCarsType() {
        return carsType;
    }

    public void setCarsType(String carsType) {
        this.carsType = carsType == null ? null : carsType.trim();
    }

    public String getCarsProductionAddress() {
        return carsProductionAddress;
    }

    public void setCarsProductionAddress(String carsProductionAddress) {
        this.carsProductionAddress = carsProductionAddress == null ? null : carsProductionAddress.trim();
    }

    public Date getCarsProductionBirthdate() {
        return carsProductionBirthdate;
    }

    public void setCarsProductionBirthdate(Date carsProductionBirthdate) {
        this.carsProductionBirthdate = carsProductionBirthdate;
    }

    public Date getCarsBuyBirthdate() {
        return carsBuyBirthdate;
    }

    public void setCarsBuyBirthdate(Date carsBuyBirthdate) {
        this.carsBuyBirthdate = carsBuyBirthdate;
    }

    public String getCarsRemarks() {
        return carsRemarks;
    }

    public void setCarsRemarks(String carsRemarks) {
        this.carsRemarks = carsRemarks == null ? null : carsRemarks.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }
}