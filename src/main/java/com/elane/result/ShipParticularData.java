package com.elane.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ShipParticularData {

    /** 船舶mmsi编号，9 位数字 */
    private Long mmsi;

    /** imo编号 */
    private Long imo;

    /** 船舶呼号 */
    @SerializedName("call_sign")
    private String callSign;

    /** 船舶英文名称 */
    @SerializedName("ship_name")
    private String shipName;

    /** 船舶长度，米，取值范围(0-1022) */
    private Float length;

    /** 船舶型宽，米，取值范围（0-1022） */
    @SerializedName("mould_width")
    private Float mouldWidth;

    /** 船旗国国家代码 */
    @SerializedName("flag_country_code")
    private String flagCountryCode;

    /** 船旗国英文名称 */
    @SerializedName("flag_country")
    private String flagCountry;

    /** 船舶建造国家英文名称 */
    @SerializedName("build_country")
    private String buildCountry;

    /** 船舶建造日期（格式：yyyyMM 或 yyyy，如 201601） */
    @SerializedName("build_date")
    private String buildDate;

    /** 船级社名称 */
    @SerializedName("class_name")
    private String className;

    /** 船东互保协会名称 */
    @SerializedName("pandi_club")
    private String pandiClub;

    /** 船舶类型 */
    @SerializedName("ship_type")
    private String shipType;

    /** 船舶类型子分类 */
    @SerializedName("ship_type_level5_subgroup")
    private String shipTypeLevel5Subgroup;

    /** 船舶类型分组 */
    @SerializedName("ship_type_group")
    private String shipTypeGroup;

    /** 船舶状态 */
    @SerializedName("ship_status")
    private String shipStatus;

    /** 船舶总吨数 */
    @SerializedName("gross_tonnage")
    private Float grossTonnage;

    /** 净注册吨数 */
    @SerializedName("net_tonnage")
    private Float netTonnage;

    /** 载重，吨 */
    private Float deadweight;

    /** 船舶装载集装箱数量 */
    private Integer teu;

    /** 最大速度，单位：节 */
    @SerializedName("speed_max")
    private Float speedMax;

    /** 经济航速，单位：节 */
    @SerializedName("speed_service")
    private Float speedService;

    /** 船舶吃水，单位：米 */
    private Float draught;

    /** 船籍港 */
    @SerializedName("port_of_registry")
    private String portOfRegistry;

    /** 集团所有方代码 */
    @SerializedName("group_code")
    private String groupCode;

    /** 集团所有方名称 */
    @SerializedName("group_company")
    private String groupCompany;

    /** 集团所有方所属国家代码 */
    @SerializedName("group_country_code")
    private String groupCountryCode;

    /** 集团所有方所属国家 */
    @SerializedName("group_country")
    private String groupCountry;

    /** 船舶管理者代码 */
    @SerializedName("shipmanager_code")
    private String shipmanagerCode;

    /** 船舶管理者名称 */
    @SerializedName("shipmanager_company")
    private String shipmanagerCompany;

    /** 船舶管理者所属国家代码 */
    @SerializedName("shipmanager_country_code")
    private String shipmanagerCountryCode;

    /** 船舶管理者所属国家 */
    @SerializedName("shipmanager_country")
    private String shipmanagerCountry;

    /** 船舶经营者代码 */
    @SerializedName("operator_code")
    private String operatorCode;

    /** 船舶经营者名称 */
    @SerializedName("operator_company")
    private String operatorCompany;

    /** 船舶经营者所属国家代码 */
    @SerializedName("operator_country_code")
    private String operatorCountryCode;

    /** 船舶经营者所属国家 */
    @SerializedName("operator_country")
    private String operatorCountry;

    /** DOC 公司代码 */
    @SerializedName("doc_code")
    private String docCode;

    /** DOC 公司名称 */
    @SerializedName("doc_company")
    private String docCompany;

    /** DOC 公司所属国家代码 */
    @SerializedName("doc_country_code")
    private String docCountryCode;

    /** DOC 公司所属国家 */
    @SerializedName("doc_country")
    private String docCountry;

    /** 注册所有方代码 */
    @SerializedName("registered_code")
    private String registeredCode;

    /** 注册所有方名称 */
    @SerializedName("registered_owner")
    private String registeredOwner;

    /** 注册所有方所属国家代码 */
    @SerializedName("registered_country_code")
    private String registeredCountryCode;

    /** 注册所有方所属国家 */
    @SerializedName("registered_country")
    private String registeredCountry;

    /** 技术管理者代码 */
    @SerializedName("technical_code")
    private String technicalCode;

    /** 技术管理者名称 */
    @SerializedName("technical_manager")
    private String technicalManager;

    /** 技术管理者所属国家代码 */
    @SerializedName("technical_country_code")
    private String technicalCountryCode;

    /** 技术管理者所属国家 */
    @SerializedName("technical_country")
    private String technicalCountry;

    /** 船舶建造者代码 */
    @SerializedName("builder_code")
    private String builderCode;

    /** 船舶建造者名称 */
    @SerializedName("builder_company")
    private String builderCompany;

    /** 船舶建造者所属国家代码 */
    @SerializedName("builder_country_code")
    private String builderCountryCode;

    /** 船舶建造者所属国家 */
    @SerializedName("builder_country")
    private String builderCountry;

    /** 主机信息列表 */
    @SerializedName("main_engine_list")
    private List<EngineInfo> mainEngineList;

    /** 辅机信息列表 */
    @SerializedName("aux_engine_list")
    private List<EngineInfo> auxEngineList;

    /** 档案数据更新时间，格式：2016-01-01 12:12:30 */
    @SerializedName("update_time")
    private String updateTime;
}
