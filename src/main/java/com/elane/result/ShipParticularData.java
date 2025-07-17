package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class ShipParticularData {
    /** 船舶mmsi编号，9 位数字 */
    private Long mmsi;

    /** imo编号 */
    private Long imo;

    /** 船舶呼号 */
    private String call_sign;

    /** 船舶英文名称 */
    private String ship_name;

    /** 船舶长度，米，取值范围(0-1022) */
    private Float length;

    /** 船舶型宽，米，取值范围（0-1022） */
    private Float mould_width;

    /** 船旗国国家代码 */
    private String flag_country_code;

    /** 船旗国英文名称 */
    private String flag_country;

    /** 船舶建造国家英文名称 */
    private String build_country;

    /** 船舶建造日期（格式：yyyyMM 或 yyyy，如 201601） */
    private String build_date;

    /** 船级社名称 */
    private String class_name;

    /** 船东互保协会名称 */
    private String pandi_club;

    /** 船舶类型 */
    private String ship_type;

    /** 船舶类型子分类 */
    private String ship_type_level5_subgroup;

    /** 船舶类型分组 */
    private String ship_type_group;

    /** 船舶状态 */
    private String ship_status;

    /** 船舶总吨数 */
    private Float gross_tonnage;

    /** 净注册吨数 */
    private Float net_tonnage;

    /** 载重，吨 */
    private Float deadweight;

    /** 船舶装载集装箱数量 */
    private Integer teu;

    /** 最大速度，单位：节 */
    private Float speed_max;

    /** 经济航速，单位：节 */
    private Float speed_service;

    /** 船舶吃水，单位：米 */
    private Float draught;

    /** 船籍港 */
    private String port_of_registry;

    /** 集团所有方代码 */
    private String group_code;

    /** 集团所有方名称 */
    private String group_company;

    /** 集团所有方所属国家代码 */
    private String group_country_code;

    /** 集团所有方所属国家 */
    private String group_country;

    /** 船舶管理者代码 */
    private String shipmanager_code;

    /** 船舶管理者名称 */
    private String shipmanager_company;

    /** 船舶管理者所属国家代码 */
    private String shipmanager_country_code;

    /** 船舶管理者所属国家 */
    private String shipmanager_country;

    /** 船舶经营者代码 */
    private String operator_code;

    /** 船舶经营者名称 */
    private String operator_company;

    /** 船舶经营者所属国家代码 */
    private String operator_country_code;

    /** 船舶经营者所属国家 */
    private String operator_country;

    /** DOC 公司代码 */
    private String doc_code;

    /** DOC 公司名称 */
    private String doc_company;

    /** DOC 公司所属国家代码 */
    private String doc_country_code;

    /** DOC 公司所属国家 */
    private String doc_country;

    /** 注册所有方代码 */
    private String registered_code;

    /** 注册所有方名称 */
    private String registered_owner;

    /** 注册所有方所属国家代码 */
    private String registered_country_code;

    /** 注册所有方所属国家 */
    private String registered_country;

    /** 技术管理者代码 */
    private String technical_code;

    /** 技术管理者名称 */
    private String technical_manager;

    /** 技术管理者所属国家代码 */
    private String technical_country_code;

    /** 技术管理者所属国家 */
    private String technical_country;

    /** 船舶建造者代码 */
    private String builder_code;

    /** 船舶建造者名称 */
    private String builder_company;

    /** 船舶建造者所属国家代码 */
    private String builder_country_code;

    /** 船舶建造者所属国家 */
    private String builder_country;

    /** 主机信息列表 */
    private List<EngineInfo> main_engine_list;

    /** 辅机信息列表 */
    private List<EngineInfo> aux_engine_list;

    /** 档案数据更新时间，格式：2016-01-01 12:12:30 */
    private String update_time;
}
