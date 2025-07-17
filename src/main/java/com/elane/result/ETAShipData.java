package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ETAShipData {
    private Integer mmsi;

    @SerializedName("ship_name")
    private String shipName;

    private Integer imo;

    private Float dwt;

    @SerializedName("ship_type")
    private String shipType;

    private Float length;

    private Float width;

    private Float draught;

    @SerializedName("preport_cnname")
    private String pReportCnName;

    @SerializedName("last_time")
    private String lastTime;

    @SerializedName("last_time_utc")
    private Integer lastTimeUtc;

    private String eta;

    @SerializedName("eta_utc")
    private Integer etaUtc;

    private String dest;

    @SerializedName("ship_flag")
    private String shipFlag;

    private String registry;
}
