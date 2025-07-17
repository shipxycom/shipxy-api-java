package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TideOverviewItem {

    @SerializedName("tide_date")
    private String tideDate;

    @SerializedName("tide_time1")
    private String tideTime1;

    @SerializedName("tide_time2")
    private String tideTime2;

    @SerializedName("tide_time3")
    private String tideTime3;

    @SerializedName("tide_time4")
    private String tideTime4;

    @SerializedName("tide_height1")
    private Float tideHeight1;

    @SerializedName("tide_height2")
    private Float tideHeight2;

    @SerializedName("tide_height3")
    private Float tideHeight3;

    @SerializedName("tide_height4")
    private Float tideHeight4;

    @SerializedName("tide_lowhigh1")
    private String tideLowhigh1;

    @SerializedName("tide_lowhigh2")
    private String tideLowhigh2;

    @SerializedName("tide_lowhigh3")
    private String tideLowhigh3;

    @SerializedName("tide_lowhigh4")
    private String tideLowhigh4;
}
