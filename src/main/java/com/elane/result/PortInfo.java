package com.elane.result;

import lombok.Data;

@Data
public class PortInfo {
    private String port_code;               // 港口代码
    private String port_name;               // 港口名称（英文）
    private String port_cnname;             // 港口中文名
    private String port_time_zone;          // 港口时区
    private String port_country_name;       // 港口所属国家名称（英文）
    private String port_country_cnname;     // 港口所属国家名称（中文）
    private String port_country_code;       // 港口所属国家代码

    private String arrive_anchorage;        // 到达锚地（注：注意和 arriveanchorage 区分）
    private String ata;                     // 实际到达时间（ATA）
    private String atb;                     // 靠泊时间（ATB）
    private String atd;                     // 实际离港时间（ATD）

    // currentport 可能包含的字段
    private String country_en;              // 当前港口所属国家英文名
    private String country_code;            // 当前港口所属国家代码
    private String arriveanchorage;         // 到达锚地（与 arrive_anchorage 字段相似，但可能语义略有不同）
}
