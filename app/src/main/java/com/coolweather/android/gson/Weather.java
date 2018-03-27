package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 她是龙 on 2018/3/27.
 */

public class Weather {

    public Now now;

    public String status;

    public Basic basic;

    public AQI aqi;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
