package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 船队数据
 */
@Data
public class FleetData {

    @SerializedName("fleet_id")
    private String fleetId;

    @SerializedName("fleet_name")
    private String fleetName;

    @SerializedName("mmsis")
    private String mmsis;

    @SerializedName("monitor")
    private String monitor;

}