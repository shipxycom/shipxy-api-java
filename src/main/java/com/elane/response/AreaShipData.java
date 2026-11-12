package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AreaShipData {
    private Integer total;
    private Integer scode;
    @SerializedName("continue")
    private Integer continue_;
    @SerializedName("ship_list")
    private List<ShipPosition> shipList;
    @SerializedName("aton_list")
    private List<AtonData> atonList;
    @SerializedName("netbuoy_list")
    private List<NetBuoyData> netbuoyList;
}
