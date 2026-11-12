package com.elane.request;

import lombok.Data;

/** 查询历史气象。时间为北京时间 yyyy-MM-dd HH:mm:ss，单次不超过1个月，开始不早于3年前，结束须在24小时前。 */
@Data
public class HistoryWeatherRequest extends GlobalWeatherRequest {
    private String start_time;
    private String end_time;
}
