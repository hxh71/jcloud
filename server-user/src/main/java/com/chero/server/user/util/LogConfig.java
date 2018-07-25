package com.chero.server.user.util;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hxh
 * @date 2018/7/17
 */
@Configuration
public class LogConfig {

    @Value("${test-value}")
    private Integer testValue;

    @Bean
    public LogUtil2 getLogUtil2() { //自己添加
        LogUtil2 logUtil2 = new LogUtil2();
        logUtil2.init(testValue);
        return logUtil2;
    }

    @Bean(initMethod = "init")
    public LogUtil21 getLogUtil21() { // initMehtod注入
        LogUtil21 logUtil21 = new LogUtil21();
        return logUtil21;
    }
}
