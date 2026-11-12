package com.elane.response;

import lombok.Data;

@Data
public class AtonData {
    private Long mmsi;
    private String aton_name;
    private Integer aton_type;
    private Double length;
    private Double width;
    private Double left;
    private Double trail;
    private Integer is_virtual;
    private Double lat;
    private Double lng;
    private String last_time;
    private Long last_time_utc;
}
