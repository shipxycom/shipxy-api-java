package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class ShipApproachData {
    /**
     * 船舶数据
     */
    private ApproachShipInfo ship_data;

    /**
     * 靠泊数据列表
     */
    private List<ApproachDataItem> approach_data;
}
