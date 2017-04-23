package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class Weather {
    public AQI aqi;
    public Basic basic;
    @SerializedName("daily_forecast")
    public List<Daily_forecast> dailyForecasts;
    @SerializedName("hourly_forecast")
    public List<Hourly_forecast> hourlyForecasts;
    public Now now;
    public String status;
    public Suggestion suggestion;
}
