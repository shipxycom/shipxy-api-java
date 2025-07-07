package com.elane.params;

import lombok.Data;

@Data
public class GetTideDataParams extends BaseObj {
    /**
     * 港口潮汐观测站id
     */
    private String port_code;
    /**
     * 起始日期，查询潮汐起始日期（2022-09-26），支持从2020年开始往后的历史数据查询。
     */
    private String start_date;
    /**
     * 结束日期，查询潮汐结束日期（2022-10-03）
     */
    private String end_date;
}
