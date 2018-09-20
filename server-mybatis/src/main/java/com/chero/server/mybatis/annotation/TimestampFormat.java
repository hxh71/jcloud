package com.chero.server.mybatis.annotation;


import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @TimestampFormat Created by hxh on 2018/6/5.
 */

/**
 * @author hxh
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface TimestampFormat {

    @AliasFor("length")
    LENGTH value() default LENGTH.MILLISECOND;

    @AliasFor("value")
    LENGTH length() default LENGTH.MILLISECOND;

    enum LENGTH {

        /**
         * 毫秒
         */
        MILLISECOND,

        /**
         * 秒
         */
        SECOND
    }
}

