package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SingleETAShipInfo {
    private Integer mmsi;          // MMSI 号
    private Integer imo;           // IMO 号

    @SerializedName("ship_name")
    private String shipName;       // 船名

    @SerializedName("call_sign")
    private String callSign;       // 呼号

    @SerializedName("ship_type")
    private Integer shipType;      // 船舶类型
}
