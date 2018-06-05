package com.chero.server.user.annotation;

import org.springframework.context.support.EmbeddedValueResolutionSupport;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.*;

/**
 * Created by hxh on 2018/6/5.
 */
public class TimestampFormatAnnotationFormatterFactory extends EmbeddedValueResolutionSupport
        implements AnnotationFormatterFactory<TimestampFormat> {
    private static final Set<Class<?>> FIELD_TYPES;

    static {
        Set<Class<?>> fieldTypes = new HashSet<Class<?>>(4);
        fieldTypes.add(Date.class);
//        fieldTypes.add(Calendar.class);
//        fieldTypes.add(Long.class);
        FIELD_TYPES = Collections.unmodifiableSet(fieldTypes);
    }
    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }

    @Override
    public Printer<?> getPrinter(TimestampFormat annotation, Class<?> fieldType) {
        return null;
    }

    @Override
    public Parser<?> getParser(TimestampFormat annotation, Class<?> fieldType) {
        return null;
    }
}
