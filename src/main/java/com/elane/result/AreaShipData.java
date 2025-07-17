package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class AreaShipData {
    private Integer total;
    private Integer scode;
    private Integer continue_;
    private List<ShipPosition> ship_list;
}
