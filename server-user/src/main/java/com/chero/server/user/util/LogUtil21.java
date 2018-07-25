package com.chero.server.user.util;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author hxh
 * @date 2018/7/17
 */

public class LogUtil21 {

    @Value("${test-value}")
    private Integer testvalue;

    private static LogUtil21 logUtil2;

    public void init() {
        logUtil2 = this;
        logUtil2.testvalue = testvalue;
    }

    public Integer getTestvalue() {
        return testvalue;
    }

    public void setTestvalue(Integer testvalue) {
        this.testvalue = testvalue;
    }

    public static Integer addLog(String a) {
        return logUtil2.testvalue;
    }
}
