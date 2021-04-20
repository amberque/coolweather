package com.coolweather.android.db;

public class Country {
    private int id;
    private String countryName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouuntryName() {
        return countryName;
    }

    public void setCouuntryName(String couuntryName) {
        this.countryName = couuntryName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    private int weatherId;
}
