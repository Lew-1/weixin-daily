package com.example.weixindaily.constant;

/**
 * @author luzhonghe
 * @date 2022/8/18 10:41 PM
 */
public enum ServiceEnum {
    MULTISHOP("multi-shop", "/mall4cloud-multishop/ua/shopConfig/version", 1, 20),
    AUTH("auth", "/mall4cloud-auth/ua/authConfig/version", 1, 40),
    BIZ("biz", "/mall4cloud-biz/ua/bizConfig/version", 1, 5),
    COUPON("coupon", "/mall4cloud-coupon/ua/couponConfig/version", 1, 34),
    DELIVERY("delivery", "/mall4cloud-delivery/ua/deliveryConfig/version", 1, 5),
    PLATFORM("platform", "/mall4cloud-platform/ua/platformConfig/version", 1, 5),
    ORDER("order", "/mall4cloud-order/ua/orderConfig/version", 1, 5),
    PAYMENT("payment", "/mall4cloud-payment/ua/paymentConfig/version", 1, 6),
    PRODUCT("product", "/mall4cloud-product/ua/productConfig/version", 1, 6),
    RBAC("RBAC", "/mall4cloud-rbac/ua/rbacConfig/version", 1, 5),
    SEARCH("SEARCH", "/mall4cloud-search/ua/searchConfig/version", 1, 5),
    USER("user", "/mall4cloud-user/ua/userConfig/version", 1, 22),
//    VERSION("version", ""),
    ;


    private final String serviceName;
    
    private final String serviceVersionUrl;

    private final Integer testNum;

    private final Integer prodNum;

    ServiceEnum(String serviceName, String serviceVersionUrl, Integer testNum, Integer prodNum) {
        this.serviceName = serviceName;
        this.serviceVersionUrl = serviceVersionUrl;
        this.testNum = testNum;
        this.prodNum = prodNum;
    }
    
    public String getServiceVersionUrl() {
        return this.serviceVersionUrl;
    }
}
