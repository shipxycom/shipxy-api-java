package com.elane.result;

import lombok.Data;

@Data
public class ApproachEventInfo {
    /**
     * 靠泊区编号
     */
    private Integer approach_zone;

    /**
     * 纬度
     */
    private Float lat;

    /**
     * 经度
     */
    private Float lng;

    /**
     * 港口代码
     */
    private String port_code;

    /**
     * 位置描述
     */
    private String position;

    /**
     * 靠泊时间（字符串格式）
     */
    private String approach_time;

    /**
     * 靠泊时间，Unix时间戳
     */
    private Integer approach_time_utc;

    /**
     * 离泊时间（字符串格式）
     */
    private String separation_time;

    /**
     * 离泊时间，Unix时间戳
     */
    private Integer separation_time_utc;

    /**
     * 靠泊时长，单位小时（或根据实际调整）
     */
    private Float duration;

    /**
     * 船速，单位节
     */
    private Float sog;

}
