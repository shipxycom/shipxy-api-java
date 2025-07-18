package com.elane.request;

import lombok.Data;

@Data
public class AddAreaRequest extends BaseObj {
    /**
     * 区域范围，经纬度逗号分隔，多个点减号分隔，如： （lng,lat - lng,lat - lng,lat ）经纬度数，多个经纬度坐标点必须按照顺时针或逆时针依次输入。
     */
    private String area_bounds;
    /**
     * 区域名称，为您创建的区域起名，用来后续查询和区分
     */
    private String area_name;
    /**
     * 推送url，推送的url地址，触发监控条件时候向这个url地址推送数据。
     */
    private String url;
    /**
     * 筛选类型，区域筛选监控的类型，1代表全部船舶，2代表根据船舶类型和长度筛选匹配，3代表船队船舶。选择1的时候，不需要输入船舶类型、长度和船队id，输入也不会保存；选择2的时候，船舶类型和船舶长度为必填；选择3的时候，船队id为必填。
     */
    private Integer filter_type;
    /**
     * 船舶类型，区域监控船舶的类型，根据船舶类型筛选监控并推送，多个类型使用英文逗号隔开，不填则全选。船舶类型列表请参考开发文档附录。
     */
    private String ship_type;
    /**
     * 船舶长度，区域监控船舶长度，根据船舶的长度筛选并推送，多个长度使用英文逗号隔开，不填则全选。
     * 1，代表0-40米；2，代表40-80米；3，代表80-160米；
     * 4，代表160-240米；5，代表240-320米；6，代表320米以上。
     */
    private String length;
    /**
     * 船队id，区域监控船队，如果只想监控某一只或一批船舶在区域的进出情况。可以创建船队，输入fleet_id则会监控船队下所有船舶。填入此参数则不会再使用ship_type监控船只，只监控船队船舶。
     */
    private String fleet_id;

}
