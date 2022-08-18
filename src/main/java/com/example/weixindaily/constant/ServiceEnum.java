package com.example.weixindaily.constant;

/**
 * @author luzhonghe
 * @date 2022/8/18 10:41 PM
 */
public enum ServiceEnum {
    MULTISHOP("multishop", "/mall4cloud-multishop/ua/shopConfig/version"),
    AUTH("auth", "/mall4cloud-auth/ua/authConfig/version"),
    BIZ("biz", "/mall4cloud-biz/ua/bizConfig/version"),
    COUPON("coupon", "/mall4cloud-coupon/ua/couponConfig/version"),
    DELIVERY("delivery", "/mall4cloud-delivery/ua/deliveryConfig/version"),
    PLATFORM("platform", "/mall4cloud-platform/ua/platformConfig/version"),
    ORDER("order", "/mall4cloud-order/ua/orderConfig/version"),
    PAYMENT("payment", "/mall4cloud-payment/ua/paymentConfig/version"),
    PRODUCT("product", "/mall4cloud-product/ua/productConfig/version"),
    RBAC("RBAC", "/mall4cloud-rbac/ua/rbacConfig/version"),
    SEARCH("SEARCH", "/mall4cloud-search/ua/searchConfig/version"),
    USER("user", "/mall4cloud-user/ua/userConfig/version"),
//    VERSION("version", ""),
    ;


    private final String serviceName;
    
    private final String serviceVersionUrl;

    ServiceEnum(String serviceName, String serviceVersionUrl) {
        this.serviceName = serviceName;
        this.serviceVersionUrl = serviceVersionUrl;
    }
    
    public String getServiceVersionUrl() {
        return this.serviceVersionUrl;
    }
}
