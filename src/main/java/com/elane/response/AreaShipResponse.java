package com.elane.response;

import lombok.Data;

@Data
public class AreaShipResponse {
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
    private AreaShipData data;
}
