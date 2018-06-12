package com.chero.server.user.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hxh on 2018/6/4.
 */
//@JsonComponent
public class JsonDate {
//    public static class Serializer extends JsonSerializer<Date> {
//        @Override
//        public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//            String formattedDate = formatter.format(date);
//            jsonGenerator.writeString(formattedDate);
//        }
//    }
    public static class Deserializer extends JsonDeserializer<Date> {
        private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        @Override
        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            Date date = null;
            try {
                date = sdf.parse(jsonParser.getText());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date;
        }
    }

}
