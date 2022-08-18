package com.example.weixindaily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WeixinDailyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeixinDailyApplication.class, args);
    }

}
