package com.chero.server.user.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author hxh
 * @date 2018/7/17
 */

@Component
public class LogUtil3 implements InitializingBean {

    @Value("${test-value}")
    private Integer testvalue;


    private static LogUtil3 logUtil3;


    public Integer getTestvalue() {
        return testvalue;
    }

    public void setTestvalue(Integer testvalue) {
        this.testvalue = testvalue;
    }

    public static Integer addLog(String a) {
        return logUtil3.testvalue;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logUtil3 = this;
        logUtil3.testvalue = this.testvalue;
    }
}
