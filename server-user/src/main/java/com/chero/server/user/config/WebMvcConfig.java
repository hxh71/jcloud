package com.chero.server.user.config;

import com.chero.server.user.annotation.TimestampFormatAnnotationFormatterFactory;
import com.chero.server.user.interceptor.TimeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author hxh
 * @date 2018/6/6
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldAnnotation(new TimestampFormatAnnotationFormatterFactory());
        super.addFormatters(registry);
    }

    /**
     * {@inheritDoc}
     * <p>This implementation is empty.
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TimeInterceptor());
//        registry.-5

//        super.addInterceptors(registry);
    }
}