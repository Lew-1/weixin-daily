package com.example.weixindaily;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luzhonghe
 * @date 2022/8/15 10:12 PM
 */
public class Weixin {
    
    public String getAccessToken() {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("grant_type", "client_credential");
        paramMap.put("appid", "wxc7791bfa960347f3");
        paramMap.put("secret", "6fc71fa3daa2fb1596e01dd9810e865e");
        String s = HttpUtil.get("https://api.weixin.qq.com/cgi-bin/token", paramMap);
        return null;
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
