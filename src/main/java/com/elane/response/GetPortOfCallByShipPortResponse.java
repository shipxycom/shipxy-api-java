package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetPortOfCallByShipPortResponse {

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 消息
     */
    private String msg;

    /**
     * 总数
     */
    private Integer total;

    /**
     * 数据列表
     */
    private List<PortOfCallByShipPortData> data;

}
