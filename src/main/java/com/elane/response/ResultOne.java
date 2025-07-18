package com.elane.response;

import lombok.Data;

@Data
public class ResultOne<T> {
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
    private T data;
}
