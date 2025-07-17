package com.elane.result;

import lombok.Data;

@Data
public class ApproachDataItem {
    /**
     * 靠泊船舶信息
     */
    private ApproachShipInfo approach_ship;

    /**
     * 靠泊事件信息
     */
    private ApproachEventInfo approach_event;
}
