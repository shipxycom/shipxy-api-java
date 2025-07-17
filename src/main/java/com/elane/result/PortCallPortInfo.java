package com.elane.result;

import lombok.Data;

@Data
public class PortCallPortInfo {
    private String port_code;             // 港口代码
    private String port_cnname;           // 港口中文名
    private String port_name;             // 港口名
    private String port_time_zone;        // 港口时区
    private String terminal_name;         // 码头名称
    private String berth_name;            // 泊位名称
    private String arrival_anchorage;     // 到达锚地
    private String ata;                   // 实际到港时间 (ATA)
    private String atb;                   // 实际靠泊时间 (ATB)
    private String atd;                   // 实际离港时间 (ATD)
    private Double arrival_draught;       // 到港吃水
    private Double departure_draught;     // 离港吃水
    private Double stay_time;             // 停留时间
    private Double stay_terminal_time;    // 停靠码头时间
}
