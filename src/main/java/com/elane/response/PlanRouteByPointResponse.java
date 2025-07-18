package com.elane.response;

import lombok.Data;

@Data
public class PlanRouteByPointResponse {
    private Integer status;                      // 状态码
    private String msg;                          // 消息
    private PlanRouteByPointData data;          // 数据
}
