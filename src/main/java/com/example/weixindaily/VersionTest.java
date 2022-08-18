package com.example.weixindaily;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.example.weixindaily.constant.ServiceEnum;
import com.example.weixindaily.pojo.Result;
import com.example.weixindaily.pojo.VersionInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * @author luzhonghe
 * @date 2022/8/18 7:50 PM
 */
public class VersionTest {
    
    

    public static void main(String[] args) throws Exception {
        for (ServiceEnum serviceEnum : ServiceEnum.values()) {
            getVersion(serviceEnum);
        }
//        getVersion(ServiceEnum.AUTH);
    }
    
    
    
    public static void getVersion(ServiceEnum serviceEnum) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String prod = "https://fsx.tzjjfsx.com:9087";
        String test = "https://fsxtest.tzjjfsx.com:9087";
        String url = serviceEnum.getServiceVersionUrl();
        int serviceNum = 20; //服务数量，稍微写大一点
        VersionInfo versionInfo = new VersionInfo();
        HashSet<String> prodVersionSet = new HashSet<>();
        HashSet<String> testVersionSet = new HashSet<>();
        for (int i = 0 ; i < serviceNum; i++) {
            String prodBody = HttpRequest.get(prod + url)
                    .header("Accept", "*/*")
                    .execute().body();
            Result result = mapper.readValue(prodBody, Result.class);
            String data = result.getData();
            String[] split = data.split("：");

            String testBody = HttpRequest.get(test + url)
                    .header("Accept", "*/*")
                    .execute().body();
            Result testResult = mapper.readValue(testBody, Result.class);
            String testData = testResult.getData();
            String[] testSplit = testData.split("：");

            if (i == 0) {
                versionInfo.setServiceName(split[0]);
            }
            prodVersionSet.add(split[1]);
            testVersionSet.add(testSplit[1]);
        }
        versionInfo.setTestVersion(String.join(" ", testVersionSet));
        versionInfo.setProdVersion(String.join(" ", prodVersionSet));

        System.out.println(versionInfo.getServiceName() + ": " + versionInfo.getProdVersion() + "  " + versionInfo.getTestVersion());
    }
    
    
}
