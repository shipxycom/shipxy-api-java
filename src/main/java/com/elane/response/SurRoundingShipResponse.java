package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class SurRoundingShipResponse {
    /** 周边船舶总数。 */
    private Integer total;
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
    private List<ShipPosition> data;
}
