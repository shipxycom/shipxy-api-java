package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BerthShipData {

    /**
     * 船舶mmsi编号，9 位数字
     */
    private Long mmsi;

    /**
     * imo编号
     */
    private Long imo;

    /**
     * 船舶呼号
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * 船舶英文名称
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * 船舶类型
     */
    @SerializedName("ship_type")
    private Integer shipType;

    /**
     * 船舶长度，米，取值范围(0-1022)
     */
    private Float length;

    /**
     * 船舶宽度，米
     */
    private Float width;

    /**
     * 左舷距，米
     */
    private Float left;

    /**
     * 尾距，米
     */
    private Float trail;

    /**
     * 吃水深度，米
     */
    private Float draught;

    /**
     * 到达时间，北京时间，格式如：2025-03-03 10:51:40
     */
    @SerializedName("arrival_time")
    private String arrivalTime;

    /**
     * 到达时间，Unix时间戳，UTC时间
     */
    @SerializedName("arrival_time_utc")
    private Integer arrivalTimeUtc;

    /**
     * 船舶当前在港口持续停留的时间，单位分钟
     */
    @SerializedName("stay_time")
    private Float stayTime;

    /**
     * 航行状态
     * 0表示状态正常，-1代表无效数据
     */
    private Integer navistat;
}
