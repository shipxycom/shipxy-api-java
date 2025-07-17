package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class PlanRouteByPointData {
    private Double distance;            // 距离
    private List<RoutePoint> route;    // 航线点列表
}
