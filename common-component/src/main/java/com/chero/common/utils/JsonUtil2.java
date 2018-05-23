//package com.chero.common.utils;
//
///**
// * Created by hxh on 2018/4/17.
// */
//import lombok.extern.slf4j.Slf4j;
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.JsonParser;
//import org.codehaus.jackson.map.DeserializationConfig;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.type.TypeReference;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//
//
//@Slf4j
//public class JsonUtil2 {
//
//    /**
//     * Logger for this class
//     */
//
//    private final static ObjectMapper objectMapper = new ObjectMapper();
//
//    static {
//        objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
//        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
//        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
//        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
//        objectMapper.configure(JsonParser.Feature.INTERN_FIELD_NAMES, true);
//        objectMapper.configure(JsonParser.Feature.CANONICALIZE_FIELD_NAMES, true);
//        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//    }
//
//    public static String encode(Object obj) {
//        try {
//            return objectMapper.writeValueAsString(obj);
//        } catch (JsonGenerationException e) {
//            log.error("encode(Object)", e); //$NON-NLS-1$
//        } catch (JsonMappingException e) {
//            log.error("encode(Object)", e); //$NON-NLS-1$
//        } catch (IOException e) {
//            log.error("encode(Object)", e); //$NON-NLS-1$
//        }
//        return null;
//    }
//
//    /**
//     * 将json string反序列化成对象
//     *
//     * @param json
//     * @param valueType
//     * @return
//     */
//    public static <T> T decode(String json, Class<T> valueType) {
//        try {
//            return objectMapper.readValue(json, valueType);
//        } catch (JsonParseException e) {
//            log.error("decode(String, Class<T>)", e);
//        } catch (JsonMappingException e) {
//            log.error("decode(String, Class<T>)", e);
//        } catch (IOException e) {
//            log.error("decode(String, Class<T>)", e);
//        }
//        return null;
//    }
//
//    /**
//     * 将json array反序列化为对象
//     *
//     * @param json
//     * @param jsonTypeReference
//     * @return
//     */
//    public static <T> T decode(String json, TypeReference<T> jsonTypeReference) {
//        try {
//            return (T) objectMapper.readValue(json, jsonTypeReference);
//        } catch (JsonParseException e) {
//            log.error("decode(String, JsonTypeReference<T>)", e);
//        } catch (JsonMappingException e) {
//            log.error("decode(String, JsonTypeReference<T>)", e);
//        } catch (IOException e) {
//            log.error("decode(String, JsonTypeReference<T>)", e);
//        }
//        return null;
//    }
//}