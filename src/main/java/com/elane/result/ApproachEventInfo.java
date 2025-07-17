package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ApproachEventInfo {
    /**
     * 靠泊区编号
     */
    @SerializedName("approach_zone")
    private Integer approachZone;

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
    @SerializedName("port_code")
    private String portCode;

    /**
     * 位置描述
     */
    private String position;

    /**
     * 靠泊时间（字符串格式）
     */
    @SerializedName("approach_time")
    private String approachTime;

    /**
     * 靠泊时间，Unix时间戳
     */
    @SerializedName("approach_time_utc")
    private Integer approachTimeUtc;

    /**
     * 离泊时间（字符串格式）
     */
    @SerializedName("separation_time")
    private String separationTime;

    /**
     * 离泊时间，Unix时间戳
     */
    @SerializedName("separation_time_utc")
    private Integer separationTimeUtc;

    /**
     * 靠泊时长，单位小时（或根据实际调整）
     */
    private Float duration;

    /**
     * 船速，单位节
     */
    private Float sog;
}
