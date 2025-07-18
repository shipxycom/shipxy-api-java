package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TideStationInfo {

    @SerializedName("port_code")
    private Integer portCode;

    @SerializedName("port_cnname")
    private String portCnname;

    @SerializedName("port_name")
    private String portName;

    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    @SerializedName("port_country_name")
    private String portCountryName;

    private Float lat;

    private Float lng;

    @SerializedName("port_time_zone")
    private String portTimeZone;

    private String datumn;

    @SerializedName("tide_type")
    private String tideType;
}
