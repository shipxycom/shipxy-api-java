package com.elane.result;

import lombok.Data;

@Data
public class ShipStatusData {
    private String ship_name;            // 船名
    private String call_sign;            // 呼号
    private Integer imo;                 // IMO号
    private Integer mmsi;                // MMSI号
    private String ship_type;            // 船舶类型
    private String current_sea_area;    // 当前海区
    private String sea_area_code;       // 海区代码
    private String current_city;        // 当前城市
    private String current_city_code;   // 当前城市代码
    private Double lng;                 // 经度
    private Double lat;                 // 纬度
    private PortInfo previousport;      // 前一个港口信息
    private PortInfo currentport;       // 当前港口信息
}
