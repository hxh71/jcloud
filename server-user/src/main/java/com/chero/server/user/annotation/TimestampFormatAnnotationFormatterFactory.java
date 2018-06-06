package com.chero.server.user.annotation;

import org.springframework.context.support.EmbeddedValueResolutionSupport;
import org.springframework.format.*;

import java.io.Serializable;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by hxh on 2018/6/5.
 */
public class TimestampFormatAnnotationFormatterFactory extends EmbeddedValueResolutionSupport
        implements AnnotationFormatterFactory<TimestampFormat> {
    private final Set<Class<?>> FIELD_TYPES;
    private final TimestampFormatter formatter;

    public TimestampFormatAnnotationFormatterFactory() {
        Set<Class<?>> fieldTypes = new HashSet<Class<?>>(2);
        fieldTypes.add(Date.class);
        this.FIELD_TYPES = Collections.unmodifiableSet(fieldTypes);
        this.formatter = new TimestampFormatter();
    }
    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }

    @Override
    public Printer<?> getPrinter(TimestampFormat annotation, Class<?> fieldType) {
        annotation.
        return formatter;
    }

    @Override
    public Parser<?> getParser(TimestampFormat annotation, Class<?> fieldType) {
        return formatter;
    }
    private static class TimestampFormatter implements org.springframework.format.Formatter<Date>,Serializable {
        private static final long serialVersionUID = -818656464607971661L;

        @Override
        public Date parse(String value, Locale locale) throws ParseException {
            return new Date(Long.valueOf(value));
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
