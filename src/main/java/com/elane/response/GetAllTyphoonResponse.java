package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class GetAllTyphoonResponse {

    private Integer status;
    private String msg;
    private Integer total;
    private List<TyphoonListItem> data;

}
