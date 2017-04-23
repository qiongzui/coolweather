package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("cnty")
    public String cntyName;
    @SerializedName("id")
    public String weatherId;
    public String lat;
    public String lon;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String locTime;
        @SerializedName("utc")
        public String utcTime;
    }
}
