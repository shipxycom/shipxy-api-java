package com.elane.response;
import lombok.Data;
import com.google.gson.annotations.SerializedName;
@Data
public class SpeedSubscriptionData {
    private Long mmsi;
    @SerializedName("speed_limit") private String speedLimit;
    @SerializedName("speed_duration") private Double speedDuration;
}
