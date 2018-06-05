package com.chero.server.user.annotation;


import java.lang.annotation.*;

/**
 * @TimestampFormat Created by hxh on 2018/6/5.
 */

/**
 * Declares that a field or method parameter should be formatted as a date or time.
 * <p>
 * <p>Supports formatting by style pattern, ISO date time pattern, or custom format pattern string.
 * Can be applied to {@code java.util.Date}, {@code java.util.Calendar}, {@code java.lang.Long},
 * Joda-Time value types; and as of Spring 4 and JDK 8, to JSR-310 <code>java.time</code> types too.
 * <p>
 * <p>For style-based formatting, set the {@link #style} attribute to be the style pattern code.
 * The first character of the code is the date style, and the second character is the time style.
 * Specify a character of 'S' for short style, 'M' for medium, 'L' for long, and 'F' for full.
 * A date or time may be omitted by specifying the style character '-'.
 *
 * @author hxh
 *         // * @see org.joda.time.format.DateTimeFormat
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface TimestampFormat {

    LENGTH value() default LENGTH.MILLISECOND;
}

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