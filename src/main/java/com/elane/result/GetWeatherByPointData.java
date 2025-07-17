package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GetWeatherByPointData
{
    private Float bm500;
    private Float humidity;
    private Float oceandir;
    private Float oceanspeed;
    private Float pressure;
    private Float swelldir;
    private Float swellheight;
    private Float swellperiod;
    private Float temperature;
    private Float visibility;
    private Float waveheight;
    private Float winddir;
    private Float windspeed;

    @SerializedName("publish_time")
    private String publishTime;

    private Float lng;
    private Float lat;
}
