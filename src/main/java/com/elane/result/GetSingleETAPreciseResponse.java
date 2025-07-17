package com.elane.result;

import lombok.Data;

@Data
public class GetSingleETAPreciseResponse {
    private Integer status;
    private String msg;
    private GetSingleETAPreciseData data;
}
