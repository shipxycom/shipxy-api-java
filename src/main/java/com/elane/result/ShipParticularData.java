package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class ShipParticularData {
    private Integer mmsi;
    private Integer imo;
    private String call_sign;
    private String ship_name;
    private Float length;
    private Float mould_width;
    private String flag_country_code;
    private String flag_country;
    private String build_country;
    private String build_date;
    private String class_name;
    private String pandi_club;
    private String ship_type;
    private String ship_type_level5_subgroup;
    private String ship_type_group;
    private String ship_status;
    private Float gross_tonnage;
    private Float net_tonnage;
    private Float deadweight;
    private Integer teu;
    private Float speed_max;
    private Float speed_service;
    private Float draught;
    private String port_of_registry;
    private String group_code;
    private String group_company;
    private String group_country_code;
    private String group_country;
    private String shipmanager_code;
    private String shipmanager_company;
    private String shipmanager_country_code;
    private String shipManager_country;
    private String operator_code;
    private String operator_company;
    private String operator_country_code;
    private String operator_country;
    private String doc_code;
    private String doc_company;
    private String doc_country_code;
    private String doc_country;
    private String registered_code;
    private String registered_owner;
    private String registered_country_code;
    private String registered_country;
    private String technical_code;
    private String technical_manager;
    private String technical_country_code;
    private String technical_country;
    private String builder_code;
    private String builder_company;
    private String builder_country_code;
    private String builder_country;
    private String update_time;
    private List<EngineInfo> main_engine_list;
    private List<EngineInfo> aux_engine_list;
}
