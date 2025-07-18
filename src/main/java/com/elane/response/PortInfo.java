package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortInfo {

    @SerializedName("port_code")
    private String portCode;                  // 港口代码

    @SerializedName("port_name")
    private String portName;                  // 港口名称（英文）

    @SerializedName("port_cnname")
    private String portCnName;                // 港口中文名

    @SerializedName("port_time_zone")
    private String portTimeZone;              // 港口时区

    @SerializedName("port_country_name")
    private String portCountryName;           // 港口所属国家名称（英文）

    @SerializedName("port_country_cnname")
    private String portCountryCnName;         // 港口所属国家名称（中文）

    @SerializedName("port_country_code")
    private String portCountryCode;           // 港口所属国家代码

    @SerializedName("arrive_anchorage")
    private String arriveAnchorage;           // 到达锚地（注：注意和 arriveanchorage 区分）

    private String ata;                       // 实际到达时间（ATA）

    private String atb;                       // 靠泊时间（ATB）

    private String atd;                       // 实际离港时间（ATD）

    // currentport 可能包含的字段

    @SerializedName("country_en")
    private String countryEn;                 // 当前港口所属国家英文名

    @SerializedName("country_code")
    private String countryCode;               // 当前港口所属国家代码

    private String arriveanchorage;           // 到达锚地（与 arrive_anchorage 字段相似，但可能语义略有不同）
}
