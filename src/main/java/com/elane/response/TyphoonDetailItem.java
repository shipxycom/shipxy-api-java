package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TyphoonDetailItem {
    @SerializedName("typhoon_id")
    private Integer typhoonId;

    @SerializedName("typhoon_time")
    private String typhoonTime;

    private String forecast;

    private String fhour;

    private Float lat;

    private Float lng;

    private Integer grade;

    private Float mspeed;

    private Float pressure;

    private Float kspeed;

    private String direction;

    @SerializedName("radius7")
    private Float radius7;

    @SerializedName("radius10")
    private Float radius10;

    @SerializedName("radius7_s")
    private Float radius7S;

    @SerializedName("radius10_s")
    private Float radius10S;

    @SerializedName("radius12_s")
    private Float radius12S;
}
