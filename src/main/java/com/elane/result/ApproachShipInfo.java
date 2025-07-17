package com.elane.result;

import lombok.Data;

@Data
public class ApproachShipInfo {
    /**
     * 船舶mmsi编号
     */
    private Integer mmsi;

    /**
     * imo编号
     */
    private Integer imo;

    /**
     * 船舶呼号
     */
    private String call_sign;

    /**
     * 船舶名称
     */
    private String ship_name;

    /**
     * 船舶类型
     */
    private Integer ship_type;
}
