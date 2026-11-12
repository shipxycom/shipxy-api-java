package com.elane.response;

import lombok.Data;

/** Preserves original weather object/array and all nested fields, including
 * observation_time (UTC), atmospheric_data and ocean_data. */
@Data
public class GlobalWeatherResponse {
    private Integer status;
    private String msg;
    private Object data;
}
