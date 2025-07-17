package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ApproachDataItem {
    /**
     * 靠泊船舶信息
     */
    @SerializedName("approach_ship")
    private ApproachShipInfo approachShip;

    /**
     * 靠泊事件信息
     */
    @SerializedName("approach_event")
    private ApproachEventInfo approachEvent;
}
