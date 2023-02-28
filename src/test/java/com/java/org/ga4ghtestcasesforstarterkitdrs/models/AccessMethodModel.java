package com.java.org.ga4ghtestcasesforstarterkitdrs.models;

public class AccessMethodModel {

    private AccessUrlModel access_url;
    private String type;
    private String region;

    public AccessUrlModel getAccess_url() {
        return access_url;
    }

    public void setAccess_url(AccessUrlModel access_url) {
        this.access_url = access_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
