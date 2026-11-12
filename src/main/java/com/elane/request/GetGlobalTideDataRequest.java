package com.elane.request;

import lombok.Data;

/** 查询全球观测站潮汐。port_code 为观测站 ID；日期 yyyy-MM-dd，单次不超过90天，未来不超过30天。 */
@Data
public class GetGlobalTideDataRequest extends BaseObj {
    private Integer port_code;
    private String start_date;
    private String end_date;
}
