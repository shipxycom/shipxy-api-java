package com.elane.request;

import lombok.Data;

@Data
public class UpdateFleetRequest extends BaseObj {
    /**
     * 船队id,船队的ID，用来对船队信息进行维护的唯一标识。
     */
    private String fleet_id;
    /**
     * 船队名称，输入名称则更新船队名称
     */
    private String fleet_name;
    /**
     * 船舶清单，批量更新船队船舶信息，输入船舶mmsi编号，以英文逗号隔开。覆盖式全量更新，不做单独的增加和减少。
     */
    private String mmsis;
    /**
     * 变更船队进行监控的内容，1代表船队船舶查询；2代表船位实时推送；3代表船舶到离事件推送；4代表动态ETA推送；5代表AIS异常事件推送；6代表区域监控推送；7代表船舶搭靠事件推送。多选以英文逗号隔开。覆盖式全量更新，不做单独的增加和减少。
     */
    private String monitor;
}
