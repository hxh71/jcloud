package com.chero.server.user.annotation;

import org.springframework.format.Formatter;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Created by hxh on 2018/6/5.
 */
public class TimestampFormatter implements Formatter<Date>,Serializable {
    private static final long serialVersionUID = -818656464607971661L;

    @Override
    public Date parse(String value, Locale locale) throws ParseException {
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
//        Date value = (Date) getValue();

        return (value != null ? String.valueOf(TimeUnit.MILLISECONDS.toSeconds(value.getTime())) : "");
    }
//
//
//    public String print(Timestamp value, Locale locale) {
//        if(value == null) {
//            return "";
//        }
//        return value.toString();
//    }
//
//
//    public Timestamp parse(String value, Locale locale) throws ParseException {
//        if(value.length() == 16){
//            value = new StringBuffer(value).append(":00").toString();
//        }
//        return Timestamp.valueOf(value);
//    }

}
