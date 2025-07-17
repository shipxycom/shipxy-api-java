package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AreaResponse {

    @SerializedName("status")
    private Integer status;

    @SerializedName("msg")
    private String msg;

    @SerializedName("data")
    private AreaData data;
}