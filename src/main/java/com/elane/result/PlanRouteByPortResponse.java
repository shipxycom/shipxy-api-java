package com.elane.result;

import lombok.Data;

@Data
public class PlanRouteByPortResponse {
    private Integer status;                    // 状态码
    private String msg;                        // 消息
    private PlanRouteByPortData data;         // 数据
}
