package com.elane.result;

import lombok.Data;

@Data
public class EngineInfo {
    /**
     * 设计方
     */
    private String designer;
    /**
     * 功率，单位千瓦
     */
    private Integer powerKW;
}
