package com.elane.result;

import lombok.Data;

@Data
public class ShipRegistryData {
    /**
     * 船舶mmsi编号
     */
    private Integer mmsi;      // 使用包装类Integer可以赋null
    /**
     * 船讯网授权码，验证服务权限
     */
    private String registry;
}
