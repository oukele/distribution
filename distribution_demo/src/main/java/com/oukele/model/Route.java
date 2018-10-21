package com.oukele.model;

public class Route {
    private String routeId;

    private String routeName;

    private Long routeCarryagePrice;

    private String routeStartProvince;

    private String routeStartCity;

    private String routeMiddleProince;

    private String routeMiddleCity;

    private String routeEndProvince;

    private String routeEndCity;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public Long getRouteCarryagePrice() {
        return routeCarryagePrice;
    }

    public void setRouteCarryagePrice(Long routeCarryagePrice) {
        this.routeCarryagePrice = routeCarryagePrice;
    }

    public String getRouteStartProvince() {
        return routeStartProvince;
    }

    public void setRouteStartProvince(String routeStartProvince) {
        this.routeStartProvince = routeStartProvince == null ? null : routeStartProvince.trim();
    }

    public String getRouteStartCity() {
        return routeStartCity;
    }

    public void setRouteStartCity(String routeStartCity) {
        this.routeStartCity = routeStartCity == null ? null : routeStartCity.trim();
    }

    public String getRouteMiddleProince() {
        return routeMiddleProince;
    }

    public void setRouteMiddleProince(String routeMiddleProince) {
        this.routeMiddleProince = routeMiddleProince == null ? null : routeMiddleProince.trim();
    }

    public String getRouteMiddleCity() {
        return routeMiddleCity;
    }

    public void setRouteMiddleCity(String routeMiddleCity) {
        this.routeMiddleCity = routeMiddleCity == null ? null : routeMiddleCity.trim();
    }

    public String getRouteEndProvince() {
        return routeEndProvince;
    }

    public void setRouteEndProvince(String routeEndProvince) {
        this.routeEndProvince = routeEndProvince == null ? null : routeEndProvince.trim();
    }

    public String getRouteEndCity() {
        return routeEndCity;
    }

    public void setRouteEndCity(String routeEndCity) {
        this.routeEndCity = routeEndCity == null ? null : routeEndCity.trim();
    }
}