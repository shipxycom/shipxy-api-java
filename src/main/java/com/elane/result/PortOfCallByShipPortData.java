package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortOfCallByShipPortData {

    @SerializedName("ship_name")
    private String shipName;                   // 船名

    @SerializedName("call_sign")
    private String callSign;                   // 呼号

    private Integer imo;                       // IMO号

    private Integer mmsi;                      // MMSI号

    @SerializedName("ship_type")
    private String shipType;                   // 船舶类型（字符串）

    @SerializedName("port_cnname")
    private String portCnName;                 // 港口中文名

    @SerializedName("port_name")
    private String portName;                   // 港口名

    @SerializedName("port_time_zone")
    private String portTimeZone;               // 港口时区

    @SerializedName("port_code")
    private String portCode;                   // 港口代码

    @SerializedName("terminal_name")
    private String terminalName;               // 码头名称

    @SerializedName("berth_name")
    private String berthName;                  // 泊位名称

    @SerializedName("port_country_cnname")
    private String portCountryCnName;          // 港口所在国家中文名

    @SerializedName("port_country_name")
    private String portCountryName;            // 港口所在国家名

    @SerializedName("port_country_code")
    private String portCountryCode;            // 港口所在国家代码

    private String arriveanchorage;            // 到达锚地（假设JSON字段为 arriveanchorage）

    private String ata;                        // 实际到达时间（ATA）

    private String atb;                        // 靠泊时间（ATB）

    private String atd;                        // 实际离港时间（ATD）

    @SerializedName("arrival_draught")
    private Double arrivalDraught;             // 到港吃水

    @SerializedName("departure_draught")
    private Double departureDraught;           // 离港吃水

    @SerializedName("stay_time")
    private Double stayTime;                   // 停留时间

    @SerializedName("stay_terminal_time")
    private Double stayTerminalTime;           // 码头停留时间
}
