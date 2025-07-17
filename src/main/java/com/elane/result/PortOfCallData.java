package com.elane.result;

import lombok.Data;

@Data
public class PortOfCallData {
    private String ship_name;                 // 船名
    private String call_sign;                 // 呼号
    private Integer imo;                     // IMO号
    private Integer mmsi;                    // MMSI号
    private Integer ship_type;               // 船舶类型
    private String port_cnname;              // 港口中文名
    private String port_name;                // 港口名
    private String port_time_zone;           // 港口时区
    private String port_code;                // 港口代码
    private String terminal_name;            // 码头名称
    private String berth_name;               // 泊位名称
    private String port_country_cnname;      // 港口所在国家中文名
    private String port_country_name;         // 港口所在国家名
    private String port_country_code;         // 港口所在国家代码
    private String arrival_anchorage;          // 到达锚地
    private String ata;                      // 实际到达时间（ATA）
    private String atb;                      // 靠泊时间（ATB）
    private String atd;                      // 实际离港时间（ATD）
    private Double arrival_draught;          // 到港吃水
    private Double departure_draught;        // 离港吃水
    private Double stay_time;                 // 停留时间
    private Double stay_terminal_time;        // 码头停留时间
}
