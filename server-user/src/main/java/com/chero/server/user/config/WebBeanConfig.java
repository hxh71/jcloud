package com.chero.server.user.config;

import com.chero.server.user.filter.TimeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hxh on 2018/6/13.
 */
@Configuration
public class WebBeanConfig {

    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TimeFilter());
        List<String> urls = new ArrayList<>();
        urls.add("/*");
        registrationBean.setUrlPatterns(urls);
        registrationBean.setOrder(1);
//        registrationBean.addUrlPatterns("/*"); // 同上
        return registrationBean;
    }
    // 配置多个filter
//    @Bean
//    public FilterRegistrationBean time2Filter() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new TimeFilter());
//        List<String> urls = new ArrayList<>();
//        urls.add("/*");
//        registrationBean.setUrlPatterns(urls);
//        registrationBean.setOrder(2);
////        registrationBean.addUrlPatterns("/*"); // 同上
//        return registrationBean;
//    }
}
