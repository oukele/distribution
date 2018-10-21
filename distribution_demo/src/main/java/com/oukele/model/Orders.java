package com.oukele.model;

public class Orders {
    private String ordersId;

    private Integer ordersType;

    private String ordersGoodsname;

    private Integer ordersGoodsweight;

    private String ordersMailer;

    private String ordersMailAddress;

    private String ordersCollectAddress;

    private Integer ordersState;

    private String ordersMailerTel;

    private String ordersCollecter;

    private String ordersCollerterTel;

    private String ordersStartCity;

    private String ordersMiddleCity;

    private String ordersEndCity;

    private Long ordersCarryingPrice;

    private Long ordersMatchPrice;

    private Long ordersCarryagePrice;

    private String ordersTotal;

    private String ordersRemarks;

    private String handoverStartCity;

    private String carsId;

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId == null ? null : ordersId.trim();
    }

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
    }

    public String getOrdersGoodsname() {
        return ordersGoodsname;
    }

    public void setOrdersGoodsname(String ordersGoodsname) {
        this.ordersGoodsname = ordersGoodsname == null ? null : ordersGoodsname.trim();
    }

    public Integer getOrdersGoodsweight() {
        return ordersGoodsweight;
    }

    public void setOrdersGoodsweight(Integer ordersGoodsweight) {
        this.ordersGoodsweight = ordersGoodsweight;
    }

    public String getOrdersMailer() {
        return ordersMailer;
    }

    public void setOrdersMailer(String ordersMailer) {
        this.ordersMailer = ordersMailer == null ? null : ordersMailer.trim();
    }

    public String getOrdersMailAddress() {
        return ordersMailAddress;
    }

    public void setOrdersMailAddress(String ordersMailAddress) {
        this.ordersMailAddress = ordersMailAddress == null ? null : ordersMailAddress.trim();
    }

    public String getOrdersCollectAddress() {
        return ordersCollectAddress;
    }

    public void setOrdersCollectAddress(String ordersCollectAddress) {
        this.ordersCollectAddress = ordersCollectAddress == null ? null : ordersCollectAddress.trim();
    }

    public Integer getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(Integer ordersState) {
        this.ordersState = ordersState;
    }

    public String getOrdersMailerTel() {
        return ordersMailerTel;
    }

    public void setOrdersMailerTel(String ordersMailerTel) {
        this.ordersMailerTel = ordersMailerTel == null ? null : ordersMailerTel.trim();
    }

    public String getOrdersCollecter() {
        return ordersCollecter;
    }

    public void setOrdersCollecter(String ordersCollecter) {
        this.ordersCollecter = ordersCollecter == null ? null : ordersCollecter.trim();
    }

    public String getOrdersCollerterTel() {
        return ordersCollerterTel;
    }

    public void setOrdersCollerterTel(String ordersCollerterTel) {
        this.ordersCollerterTel = ordersCollerterTel == null ? null : ordersCollerterTel.trim();
    }

    public String getOrdersStartCity() {
        return ordersStartCity;
    }

    public void setOrdersStartCity(String ordersStartCity) {
        this.ordersStartCity = ordersStartCity == null ? null : ordersStartCity.trim();
    }

    public String getOrdersMiddleCity() {
        return ordersMiddleCity;
    }

    public void setOrdersMiddleCity(String ordersMiddleCity) {
        this.ordersMiddleCity = ordersMiddleCity == null ? null : ordersMiddleCity.trim();
    }

    public String getOrdersEndCity() {
        return ordersEndCity;
    }

    public void setOrdersEndCity(String ordersEndCity) {
        this.ordersEndCity = ordersEndCity == null ? null : ordersEndCity.trim();
    }

    public Long getOrdersCarryingPrice() {
        return ordersCarryingPrice;
    }

    public void setOrdersCarryingPrice(Long ordersCarryingPrice) {
        this.ordersCarryingPrice = ordersCarryingPrice;
    }

    public Long getOrdersMatchPrice() {
        return ordersMatchPrice;
    }

    public void setOrdersMatchPrice(Long ordersMatchPrice) {
        this.ordersMatchPrice = ordersMatchPrice;
    }

    public Long getOrdersCarryagePrice() {
        return ordersCarryagePrice;
    }

    public void setOrdersCarryagePrice(Long ordersCarryagePrice) {
        this.ordersCarryagePrice = ordersCarryagePrice;
    }

    public String getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(String ordersTotal) {
        this.ordersTotal = ordersTotal == null ? null : ordersTotal.trim();
    }

    public String getOrdersRemarks() {
        return ordersRemarks;
    }

    public void setOrdersRemarks(String ordersRemarks) {
        this.ordersRemarks = ordersRemarks == null ? null : ordersRemarks.trim();
    }

    public String getHandoverStartCity() {
        return handoverStartCity;
    }

    public void setHandoverStartCity(String handoverStartCity) {
        this.handoverStartCity = handoverStartCity == null ? null : handoverStartCity.trim();
    }

    public String getCarsId() {
        return carsId;
    }

    public void setCarsId(String carsId) {
        this.carsId = carsId == null ? null : carsId.trim();
    }
}