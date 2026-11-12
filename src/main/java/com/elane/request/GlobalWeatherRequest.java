package com.elane.request;

import lombok.Data;

/** 查询 WGS84 坐标的未来大气和海洋气象预报。 */
@Data
public class GlobalWeatherRequest extends BaseObj {
    private Double lng;
    private Double lat;
}
