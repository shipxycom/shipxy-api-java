package com.elane.result;

import lombok.Data;

@Data
public class ShipRegistryData {
    private Integer mmsi;      // 使用包装类Integer可以赋null
    private String registry;
}
