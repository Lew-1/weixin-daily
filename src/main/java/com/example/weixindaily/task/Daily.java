package com.example.weixindaily.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author luzhonghe
 * @date 2022/8/15 10:04 PM
 */
@Component
public class Daily {

    @Scheduled(cron = "*/15 * * * * ?")
    public void weixin() {
        
    }
    
}
