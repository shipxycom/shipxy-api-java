package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetTidesResponse {

    private Integer status;
    private String msg;
    private Integer total;
    private List<TideStationInfo> data;

}