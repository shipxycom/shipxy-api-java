package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class FleetShipResponse {
    /**
     * 状态
     */
    private Integer status;
    /**
     * 结果
     */
    private String msg;
    /**
     * 数据
     */
//    private List<ShipPosition> data;
    private List<FleetShipResult> data;
}
