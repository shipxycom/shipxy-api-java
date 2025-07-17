package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SingleETAPortInfo {
    @SerializedName("port_code")
    private String portCode;

    @SerializedName("port_cnname")
    private String portCnname;

    @SerializedName("port_name")
    private String portName;

    @SerializedName("time_zone")
    private Integer timeZone;

    @SerializedName("port_country_code")
    private String portCountryCode;

    @SerializedName("port_country_name")
    private String portCountryName;

    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    private Double ata;
    private Double atb;
    private Double atd;
}
