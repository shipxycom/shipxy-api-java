package com.elane.response;

import lombok.Data;

@Data
public class BaseResponse {
    private Integer status;
    private String msg;
}
