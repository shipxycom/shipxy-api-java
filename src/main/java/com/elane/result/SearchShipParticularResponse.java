package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class SearchShipParticularResponse {

    private Integer status;
    private String msg;
    private List<ShipParticularData> data;
}
