package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetShipStatusResponse {
    private Integer status;                // 状态码
    private String msg;                   // 消息
    private Integer total;                // 总数
    private List<ShipStatusData> data;   // 船舶状态数据列表
}
