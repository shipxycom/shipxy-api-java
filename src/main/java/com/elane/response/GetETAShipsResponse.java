package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetETAShipsResponse {
    /**
     * 状态
     */
    private Integer status;
    /**
     * 结果
     */
    private String msg;
    /**
     * 总数
     */
    private Integer total;
    /**
     * 数据
     */
    private List<ETAShipData> data;
}
