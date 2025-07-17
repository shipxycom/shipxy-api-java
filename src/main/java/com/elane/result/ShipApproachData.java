package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ShipApproachData {

    /**
     * 船舶数据
     */
    @SerializedName("ship_data")
    private ApproachShipInfo shipData;

    /**
     * 靠泊数据列表
     */
    @SerializedName("approach_data")
    private List<ApproachDataItem> approachData;
}
