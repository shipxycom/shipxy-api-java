package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 航行警告数据
 */
@Data
public class GetNavWarningData {

    @SerializedName("warning_type")
    private Integer warningType;

    @SerializedName("source")
    private String source;

    @SerializedName("title")
    private String title;

    @SerializedName("range_type")
    private Integer rangeType;

    @SerializedName("range_points")
    private String rangePoints;

    @SerializedName("radius")
    private Float radius;

    @SerializedName("pub_time")
    private String pubTime;

    @SerializedName("expire_time")
    private String expireTime;

    @SerializedName("content")
    private String content;

}