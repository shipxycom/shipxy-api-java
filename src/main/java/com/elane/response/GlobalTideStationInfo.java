package com.elane.response;

import lombok.Data;

/** Global station ID differs from the five-character port code. */
@Data
public class GlobalTideStationInfo {
    private Integer port_code;
    private String port_cnname;
    private String port_name;
    private String port_country_cnname;
    private String port_country_name;
    private Double lat;
    private Double lng;
    private String port_time_zone;
    // Hutool accepts the numeric string shown in the PDF as a Double.
    private Double datumn;
}
