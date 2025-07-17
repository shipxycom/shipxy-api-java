package com.elane.result;

import lombok.Data;

@Data
public class PortData {
    /**
     * 港口标准code
     * 港口标准五位码
     */
    private String port_code;

    /**
     * 港口英文名称
     */
    private String port_name;

    /**
     * 港口中文名称
     */
    private String port_cnname;

    /**
     * 港口时区
     * 港口所在时区
     */
    private String port_time_zone;

    /**
     * 港口所属国家英文名
     */
    private String port_country_name;

    /**
     * 港口所属国家中文名
     */
    private String port_country_cnname;

}
