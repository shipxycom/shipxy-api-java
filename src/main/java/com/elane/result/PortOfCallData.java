package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortOfCallData {

    @SerializedName("ship_name")
    private String shipName;                   // 船名

    @SerializedName("call_sign")
    private String callSign;                   // 呼号

    private Integer imo;                       // IMO号

    private Integer mmsi;                      // MMSI号

    @SerializedName("ship_type")
    private Integer shipType;                  // 船舶类型，保持 Integer 类型（如果是字符串，请改为 String）

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

    @SerializedName("arrival_anchorage")
    private String arrivalAnchorage;           // 到达锚地

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
