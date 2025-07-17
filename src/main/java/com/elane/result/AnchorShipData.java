package com.elane.result;

import lombok.Data;

@Data
public class AnchorShipData {
    /** 船舶mmsi编号，9 位数字 */
    private Long mmsi;

    /** imo编号 */
    private Long imo;

    /** 船舶呼号 */
    private String call_sign;

    /** 船舶英文名称 */
    private String ship_name;

    /** 船舶类型 */
    private Integer ship_type;

    /** 船舶长度，米，取值范围(0-1022) */
    private Float length;

    /** 船舶宽度 */
    private Float width;

    /** 左舷距 */
    private Float left;

    /** 尾距 */
    private Float trail;

    /** 吃水深度 */
    private Float draught;

    /** 到达时间，北京时间，格式如：2025-03-03 10:51:40 */
    private String arrival_time;

    /** 到达时间，Unix时间戳，UTC时间 */
    private Integer arrival_time_utc;

    /** 船舶当前在港口持续停留的时间，单位分钟 */
    private Float stay_time;

    /**
     * 航行状态
     * 0正常，-1代表无效数据
     */
    private Integer navistat;
}
