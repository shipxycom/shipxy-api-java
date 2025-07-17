package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SearchShipResult {

    /**
     * 匹配类型，关键字匹配结果的类型，匹配类型:1：船名；2：呼号；3：mmsi；5：imo
     */
    @SerializedName("match_type")
    private Integer matchType;

    /**
     * 船舶编号，船舶唯一标识，数值与mmsi一致
     */
    private Integer mmsi;

    /**
     * imo编号，船舶imo编号
     */
    private Integer imo;

    /**
     * 船舶呼号，船舶呼号
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * 船舶名称，船舶英文名称
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * 数据来源，数据源，0代表岸基或船基AIS基站，1代表卫星基站
     */
    @SerializedName("data_source")
    private Integer dataSource;

    /**
     * 最后更新时间，AIS最后更新上传的时间
     */
    @SerializedName("last_time")
    private String lastTime;

    @SerializedName("last_time_utc")
    private Integer lastTimeUtc;
}
