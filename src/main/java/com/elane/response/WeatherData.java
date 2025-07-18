package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WeatherData {
    @SerializedName("weather_type")
    private Integer weatherType;

    @SerializedName("sea_area")
    private String seaArea;

    @SerializedName("publish_time")
    private String publishTime;

    @SerializedName("center_lat")
    private Double centerLat;

    @SerializedName("center_lng")
    private Double centerLng;

    private String forecastaging;
    private String meteorological;
    private String winddirection;
    private String windpower;
    private String waveheight;
    private Double visibility;
}
