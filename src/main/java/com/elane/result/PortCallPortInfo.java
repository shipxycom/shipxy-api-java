package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortCallPortInfo {

    @SerializedName("port_code")
    private String portCode;               // 港口代码

    @SerializedName("port_cnname")
    private String portCnName;             // 港口中文名

    @SerializedName("port_name")
    private String portName;               // 港口名

    @SerializedName("port_time_zone")
    private String portTimeZone;           // 港口时区

    @SerializedName("terminal_name")
    private String terminalName;           // 码头名称

    @SerializedName("berth_name")
    private String berthName;              // 泊位名称

    @SerializedName("arrival_anchorage")
    private String arrivalAnchorage;       // 到达锚地

    private String ata;                    // 实际到港时间 (ATA)

    private String atb;                    // 实际靠泊时间 (ATB)

    private String atd;                    // 实际离港时间 (ATD)

    @SerializedName("arrival_draught")
    private Double arrivalDraught;         // 到港吃水

    @SerializedName("departure_draught")
    private Double departureDraught;       // 离港吃水

    @SerializedName("stay_time")
    private Double stayTime;               // 停留时间

    @SerializedName("stay_terminal_time")
    private Double stayTerminalTime;       // 停靠码头时间
}
