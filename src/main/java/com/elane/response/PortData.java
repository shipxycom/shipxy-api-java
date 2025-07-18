package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortData {
    /**
     * 港口标准五位码
     */
    @SerializedName("port_code")
    private String portCode;

    /**
     * 港口英文名称
     */
    @SerializedName("port_name")
    private String portName;

    /**
     * 港口中文名称
     */
    @SerializedName("port_cnname")
    private String portCnName;

    /**
     * 港口所在时区
     */
    @SerializedName("port_time_zone")
    private String portTimeZone;

    /**
     * 港口所属国家英文名
     */
    @SerializedName("port_country_name")
    private String portCountryName;

    /**
     * 港口所属国家中文名
     */
    @SerializedName("port_country_cnname")
    private String portCountryCnName;
}
