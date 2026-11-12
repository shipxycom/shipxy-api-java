package com.elane.response;
import lombok.Data;
import java.util.List;
@Data
public class SearchSubShipAlertOfSpeedResponse {
    private Integer status;
    private String msg;
    private Integer total;
    private List<SpeedSubscriptionData> data;
}
