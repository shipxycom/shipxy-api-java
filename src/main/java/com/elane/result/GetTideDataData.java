package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 获取潮汐数据的响应数据主体
 */
@Data
public class GetTideDataData {

    @SerializedName("overview")
    private List<TideOverviewItem> overview;

    @SerializedName("detail")
    private List<TideDetailItem> detail;

}
