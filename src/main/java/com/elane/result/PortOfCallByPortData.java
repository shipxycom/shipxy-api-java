package com.elane.result;

import lombok.Data;

@Data
public class PortOfCallByPortData {
    private Integer imo;                     // IMO号
    private Integer mmsi;                    // MMSI号
    private String ship_type;                // 船舶类型
    private String ship_name;                // 船名
    private String call_sign;                // 呼号
    private PortCallPortInfo currentport;   // 当前港口信息
    private PortCallPortInfo previousport;  // 前一个港口信息
    private PortCallPortInfo nextport;      // 下一个港口信息
}
