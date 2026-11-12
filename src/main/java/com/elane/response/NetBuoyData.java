package com.elane.response;

import lombok.Data;

@Data
public class NetBuoyData {
    private Long mmsi;
    private Double length;
    private Double width;
    private Double lat;
    private Double lng;
    private String last_time;
    private Long last_time_utc;
}
