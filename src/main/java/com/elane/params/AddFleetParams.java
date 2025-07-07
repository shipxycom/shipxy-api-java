package com.elane.params;

import lombok.Data;

@Data
public class AddFleetParams extends BaseObj {
    /**
     * 船队名称，为您创建的船队起名，用来后续查询和区分
     */
    private String fleet_name;
    /**
     * 船舶清单，添加船队下管理的船舶信息，输入多个mmsi编号，用英文逗号隔开
     */
    private String mmsis;
    /**
     * 监控内容，选择船队进行监控的内容，1代表船队船舶查询；2代表船位实时推送；3代表船舶到离事件推送；4代表动态ETA推送；5代表AIS异常事件推送；6代表区域监控推送；7代表船舶搭靠事件推送。多选以英文逗号隔开。
     */
    private String monitor;
}
