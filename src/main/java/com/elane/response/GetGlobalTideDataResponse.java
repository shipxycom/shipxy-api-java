package com.elane.response;

import lombok.Data;

@Data
public class GetGlobalTideDataResponse {
    private Integer status;
    private String msg;
    private GetTideDataData data;
}
