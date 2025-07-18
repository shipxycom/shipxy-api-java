package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ApproachShipInfo {
    /**
     * 船舶mmsi编号
     */
    private Integer mmsi;

    /**
     * imo编号
     */
    private Integer imo;

    /**
     * 船舶呼号
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * 船舶名称
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * 船舶类型
     */
    @SerializedName("ship_type")
    private Integer shipType;
}
