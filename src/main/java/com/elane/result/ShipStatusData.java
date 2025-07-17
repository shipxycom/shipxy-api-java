package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ShipStatusData {

    @SerializedName("ship_name")
    private String shipName;            // 船名

    @SerializedName("call_sign")
    private String callSign;            // 呼号

    private Integer imo;                // IMO号

    private Integer mmsi;               // MMSI号

    @SerializedName("ship_type")
    private String shipType;            // 船舶类型

    @SerializedName("current_sea_area")
    private String currentSeaArea;      // 当前海区

    @SerializedName("sea_area_code")
    private String seaAreaCode;         // 海区代码

    @SerializedName("current_city")
    private String currentCity;         // 当前城市

    @SerializedName("current_city_code")
    private String currentCityCode;     // 当前城市代码

    private Double lng;                 // 经度

    private Double lat;                 // 纬度

    private PortInfo previousport;      // 前一个港口信息

    private PortInfo currentport;       // 当前港口信息
}
