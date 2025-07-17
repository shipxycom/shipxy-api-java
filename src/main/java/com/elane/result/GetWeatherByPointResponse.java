package com.elane.result;

import lombok.Data;

@Data
public class GetWeatherByPointResponse {
    private Float status;
    private String msg;
    private GetWeatherByPointData data;
}
