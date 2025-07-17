package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 获取潮汐数据的响应体
 */
@Data
public class GetTideDataResponse {

    @SerializedName("status")
    private Integer status;

    @SerializedName("msg")
    private String msg;

    @SerializedName("data")
    private GetTideDataData data;

}
