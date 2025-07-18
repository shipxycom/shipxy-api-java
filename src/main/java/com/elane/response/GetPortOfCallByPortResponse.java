package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetPortOfCallByPortResponse {
    private Integer status;                      // 状态码
    private String msg;                          // 消息
    private Integer total;                       // 总数
    private List<PortOfCallByPortData> data;    // 数据列表
}
