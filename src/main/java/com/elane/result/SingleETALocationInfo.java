package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SingleETALocationInfo {
    private Double lng;
    private Double lat;
    private Double speed;
    private Double sog;

    @SerializedName("sea_area")
    private String seaArea;

    @SerializedName("sea_area_code")
    private Integer seaAreaCode;
}
