package com.example.weixindaily;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author luzhonghe
 * @date 2022/8/18 7:50 PM
 */
public class VersionTest {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        
        String body = HttpRequest.get("https://fsx.tzjjfsx.com:9087/mall4cloud-multishop/ua/shopConfig/version")
                .header("Accept", "*/*")
                .execute().body();

    }
    
    
}
