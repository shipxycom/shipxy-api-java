package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class SingleShipResponse {
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
    private ShipPosition data;
}
