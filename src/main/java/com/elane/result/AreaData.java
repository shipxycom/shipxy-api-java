package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 区域数据
 */
@Data
public class AreaData {

    @SerializedName("area_id")
    private String areaId;

    @SerializedName("area_bounds")
    private String areaBounds;

    @SerializedName("area_name")
    private String areaName;

    @SerializedName("url")
    private String url;

    @SerializedName("filter_type")
    private Integer filterType;

    @SerializedName("ship_type")
    private String shipType;

    @SerializedName("length")
    private String length;

    @SerializedName("fleet_id")
    private String fleetId;
}
