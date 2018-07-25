package com.chero.server.user.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @author hxh
 * @date 2018/7/17
 */
@Component//泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
public class LogUtil {

    @Value("${test-value}")
    private Integer testvalue;

    private static LogUtil logUtil;

    @PostConstruct //@PostConstruct修饰的方法会在服务器加载Servle的时候运行，并且只会被服务器执行一次。PostConstruct在构造函数之后执行,init()方法之前执行
    public void init() {
        logUtil = this;
        logUtil.testvalue = this.testvalue;
    }


    public Integer getTestvalue() {
        return testvalue;
    }

    public void setTestvalue(Integer testvalue) {
        this.testvalue = testvalue;
    }

    public static Integer addLog(String a) {
        return logUtil.testvalue;
    }
}