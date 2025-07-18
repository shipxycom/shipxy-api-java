package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ShipTrackPoint {

    /**
     * 数据来源
     * 0代表岸基或船基AIS基站，1代表卫星基站
     */
    @SerializedName("data_source")
    private Byte dataSource;

    /**
     * 点位更新时间，Unix时间戳
     */
    private Long utc;

    /**
     * 纬度，WGS84坐标系
     */
    private Double lat;

    /**
     * 经度，WGS84坐标系
     */
    private Double lng;

    /**
     * 船速，单位节
     * 当返回值为-1时，代表无效数据
     */
    private Float sog;

    /**
     * 航迹向，单位度
     * 当返回值为-1时，代表无效数据
     */
    private Float cog;
}
