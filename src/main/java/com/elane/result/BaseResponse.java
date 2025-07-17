package com.elane.result;

import lombok.Data;

@Data
public class BaseResponse {
    private Integer status;
    private String msg;
}
