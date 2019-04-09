package com.chero.server.user.annotation;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.context.support.EmbeddedValueResolutionSupport;
import org.springframework.format.*;
import org.springframework.format.annotation.DateTimeFormat;
import sun.util.resources.cldr.en.CalendarData_en_US;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hxh
 * @date 2018/6/5
 */
public class TimestampFormatAnnotationFormatterFactory extends EmbeddedValueResolutionSupport
        implements AnnotationFormatterFactory<TimestampFormat> {
    private final Set<Class<?>> FIELD_TYPES;
    private final TimestampFormatter formatter;

    public TimestampFormatAnnotationFormatterFactory() {
        Set<Class<?>> fieldTypes = new HashSet<Class<?>>(2);
        fieldTypes.add(Date.class);
        fieldTypes.add(LocalDate.class);
        this.FIELD_TYPES = Collections.unmodifiableSet(fieldTypes);
        this.formatter = new TimestampFormatter();
    }
    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }

    @Override
    public Printer<?> getPrinter(TimestampFormat annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }

    @Override
    public Parser<?> getParser(TimestampFormat annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }
    protected TimestampFormatter getFormatter(TimestampFormat annotation, Class<?> fieldType) {
        TimestampFormatter timestampFormatter = new TimestampFormatter();
        timestampFormatter.setLength(annotation.value());
//        System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！" + this.FIELD_TYPES);
        return timestampFormatter;
    }
    private class TimestampFormatter implements org.springframework.format.Formatter<Date>,Serializable {
        private static final long serialVersionUID = -818656464607971661L;

        private TimestampFormat.LENGTH length;

        public void setLength(TimestampFormat.LENGTH length) {
            this.length = length;
        }

        @Override
        public Date parse(String value, Locale locale) throws ParseException {
            Long timeStamp;
            if (this.length != null) {
                switch (this.length) {
                    case MILLISECOND:
//                        if (value.length() != 13) {
//                            throw new IllegalArgumentException(value + " 不支持非13位");
//                        }
//                        timeStamp = Long.valueOf(value);
                        timeStamp = Long.valueOf(value);
                        break;
                    case SECOND:
//                        if (value.length() != 10) {
//                            throw new IllegalArgumentException(value + " 不支持非10位");
//                        }
                        timeStamp = Long.valueOf(value) * 1000;
                        break;
                    default:
                        throw new IllegalStateException("Unsupported length format: " + this.length);
                }
            } else {
                timeStamp = Long.valueOf(value);
            }
            return new Date(timeStamp);
//            return;
//        if (allowEmpty && !StringUtils.hasText(text)) {
//            return null;
//        } else if (value != null && this.exactDateLength >= 0 && text.length() != this.exactDateLength) {
//            throw new IllegalArgumentException("Could not parse date: it is not exactly" + this.exactDateLength + "characters long");
//        } else {
//            return new Date(Long.valueOf(value));
//        }
        }

        @Override
        public String print(Date value, Locale locale) {
            return (value != null ? String.valueOf(TimeUnit.MILLISECONDS.toSeconds(value.getTime())) : "");
        }
    }
}
