package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 潮汐详细项，包含一天24小时的潮高数据
 */
@Data
public class TideDetailItem {

    @SerializedName("tide_date")
    private String tideDate;

    @SerializedName("h0")
    private Float h0;

    @SerializedName("h1")
    private Float h1;

    @SerializedName("h2")
    private Float h2;

    @SerializedName("h3")
    private Float h3;

    @SerializedName("h4")
    private Float h4;

    @SerializedName("h5")
    private Float h5;

    @SerializedName("h6")
    private Float h6;

    @SerializedName("h7")
    private Float h7;

    @SerializedName("h8")
    private Float h8;

    @SerializedName("h9")
    private Float h9;

    @SerializedName("h10")
    private Float h10;

    @SerializedName("h11")
    private Float h11;

    @SerializedName("h12")
    private Float h12;

    @SerializedName("h13")
    private Float h13;

    @SerializedName("h14")
    private Float h14;

    @SerializedName("h15")
    private Float h15;

    @SerializedName("h16")
    private Float h16;

    @SerializedName("h17")
    private Float h17;

    @SerializedName("h18")
    private Float h18;

    @SerializedName("h19")
    private Float h19;

    @SerializedName("h20")
    private Float h20;

    @SerializedName("h21")
    private Float h21;

    @SerializedName("h22")
    private Float h22;

    @SerializedName("h23")
    private Float h23;
}