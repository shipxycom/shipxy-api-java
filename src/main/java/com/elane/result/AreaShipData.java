package com.elane.result;

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
}
