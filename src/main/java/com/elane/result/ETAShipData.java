package com.elane.result;

import lombok.Data;

@Data
public class ETAShipData {
    private Integer mmsi;
    private String ship_name;
    private Integer imo;
    private Float dwt;
    private String ship_type;
    private Float length;
    private Float width;
    private Float draught;
    private String preport_cnname;
    private String last_time;
    private Integer last_time_utc;
    private String eta;
    private Integer eta_utc;
    private String dest;
    private String ship_flag;
    private String registry;
}
