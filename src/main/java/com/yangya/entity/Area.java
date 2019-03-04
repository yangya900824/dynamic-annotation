package com.yangya.entity;

import java.math.BigDecimal;

public class Area {
    private BigDecimal id;

    private String areaName;

    private String areaCode;

    private String areaShort;

    private String areaIsHot;

    private BigDecimal areaSequence;

    private BigDecimal areaParentId;

    private String initData;

    private String initAddr;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaShort() {
        return areaShort;
    }

    public void setAreaShort(String areaShort) {
        this.areaShort = areaShort;
    }

    public String getAreaIsHot() {
        return areaIsHot;
    }

    public void setAreaIsHot(String areaIsHot) {
        this.areaIsHot = areaIsHot;
    }

    public BigDecimal getAreaSequence() {
        return areaSequence;
    }

    public void setAreaSequence(BigDecimal areaSequence) {
        this.areaSequence = areaSequence;
    }

    public BigDecimal getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(BigDecimal areaParentId) {
        this.areaParentId = areaParentId;
    }

    public String getInitData() {
        return initData;
    }

    public void setInitData(String initData) {
        this.initData = initData;
    }

    public String getInitAddr() {
        return initAddr;
    }

    public void setInitAddr(String initAddr) {
        this.initAddr = initAddr;
    }
}