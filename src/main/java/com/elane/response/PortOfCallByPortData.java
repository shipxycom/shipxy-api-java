package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortOfCallByPortData {

    private Integer imo;                     // IMO号

    private Integer mmsi;                    // MMSI号

    @SerializedName("ship_type")
    private String shipType;                 // 船舶类型

    @SerializedName("ship_name")
    private String shipName;                 // 船名

    @SerializedName("call_sign")
    private String callSign;                 // 呼号

    private PortCallPortInfo currentport;   // 当前港口信息

    private PortCallPortInfo previousport;  // 前一个港口信息

    private PortCallPortInfo nextport;      // 下一个港口信息
}
