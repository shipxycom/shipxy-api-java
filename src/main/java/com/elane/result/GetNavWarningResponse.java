package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class GetNavWarningResponse {

    @SerializedName("status")
    private Float status;

    @SerializedName("msg")
    private String msg;

    @SerializedName("total")
    private Integer total;

    @SerializedName("data")
    private List<GetNavWarningData> data;

}
