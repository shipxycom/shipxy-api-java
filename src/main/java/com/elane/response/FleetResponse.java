package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 船队响应数据
 */
@Data
public class FleetResponse {

    @SerializedName("status")
    private Integer status;

    @SerializedName("msg")
    private String msg;

    @SerializedName("data")
    private FleetData data;

}
