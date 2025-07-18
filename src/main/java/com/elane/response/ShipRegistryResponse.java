package com.elane.response;

import lombok.Data;

@Data
public class ShipRegistryResponse {
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
    private ShipRegistryData data;
}
