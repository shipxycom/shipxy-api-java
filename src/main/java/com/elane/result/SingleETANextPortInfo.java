package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SingleETANextPortInfo {
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

    @SerializedName("sailed_distance")
    private Double sailedDistance;

    @SerializedName("sailed_time")
    private Double sailedTime;

    @SerializedName("ais_speed")
    private Double aisSpeed;

    private Double speed;
    private String eta;

    @SerializedName("eta_utc")
    private Integer etaUtc;

    @SerializedName("remaining_distance")
    private Double remainingDistance;

    private Double distance;
}
