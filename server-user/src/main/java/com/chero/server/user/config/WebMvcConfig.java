package com.chero.server.user.config;

import com.chero.server.user.annotation.TimestampFormatAnnotationFormatterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hxh on 2018/6/6.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldAnnotation(new TimestampFormatAnnotationFormatterFactory());
        super.addFormatters(registry);
    }
}