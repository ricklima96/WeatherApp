package com.ricardo.weatherapp.model;

import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("id")
    private String weatherId;

    @SerializedName("weather_state_name")
    private String stateName;

    @SerializedName("weather_state_abbr")
    private String stateAbbreviation;

    @SerializedName("min_temp")
    private String minTemp;

    @SerializedName("max_temp")
    private String maxTemp;

    @SerializedName("the_temp")
    private String currentTemp;

    public String getWeatherId() {
        return weatherId;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public String getCurrentTemp() {
        return currentTemp;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setCurrentTemp(String currentTemp) {
        this.currentTemp = currentTemp;
    }
}
