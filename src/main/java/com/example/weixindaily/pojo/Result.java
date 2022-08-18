package com.example.weixindaily.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author luzhonghe
 * @date 2022/8/18 8:31 PM
 */
@NoArgsConstructor
@Data
public class Result {
    
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("fail")
    private Boolean fail;
    @JsonProperty("code")
    private String code;
    @JsonProperty("data")
    private String data;
    @JsonProperty("success")
    private Boolean success;
}
