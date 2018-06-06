package com.chero.server.user.annotation;


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

    LENGTH value() default LENGTH.MILLISECOND;

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

