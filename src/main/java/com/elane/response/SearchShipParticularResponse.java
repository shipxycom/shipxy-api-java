package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class SearchShipParticularResponse {
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
    private List<ShipParticularData> data;
}
