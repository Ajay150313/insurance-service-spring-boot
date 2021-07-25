package com.dajay.insurance;


public class User {

    private Integer userId;
    private String name;
    private Boolean isInsuranceAvailable;

    public User(Integer userId, String name, Boolean isInsuranceAvailable) {
        this.userId = userId;
        this.name = name;
        this.isInsuranceAvailable = isInsuranceAvailable;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getInsuranceAvailable() {
        return isInsuranceAvailable;
    }

    public void setInsuranceAvailable(Boolean insuranceAvailable) {
        isInsuranceAvailable = insuranceAvailable;
    }
}
