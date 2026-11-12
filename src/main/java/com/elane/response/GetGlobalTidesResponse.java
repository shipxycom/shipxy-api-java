package com.elane.response;

import lombok.Data;
import java.util.List;

@Data
public class GetGlobalTidesResponse {
    private Integer status;
    private String msg;
    private Integer total;
    private List<GlobalTideStationInfo> data;
}
