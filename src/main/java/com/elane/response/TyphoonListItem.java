package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TyphoonListItem {
    @SerializedName("typhoon_id")
    private Integer typhoonId;

    @SerializedName("typhoon_code")
    private Integer typhoonCode;

    @SerializedName("typhoon_cncode")
    private String typhoonCncode;

    @SerializedName("typhoon_cnname")
    private String typhoonCnname;

    @SerializedName("typhoon_name")
    private String typhoonName;

    @SerializedName("current_year")
    private Integer currentYear;

    private String dataMark;
}
