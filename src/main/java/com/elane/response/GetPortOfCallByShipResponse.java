package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetPortOfCallByShipResponse {
    /**
     * 状态码
     */
    private Integer status;

    /**
     * 消息提示
     */
    private String msg;

    /**
     * 数据列表
     */
    private List<PortOfCallData> data;
}
