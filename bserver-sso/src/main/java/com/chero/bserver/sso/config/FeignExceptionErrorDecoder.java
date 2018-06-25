//package com.chero.bserver.sso.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import feign.Response;
//import feign.Util;
//import feign.codec.ErrorDecoder;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by hxh on 2018/6/21.
// */
//@Configuration
//@Slf4j
//public class FeignExceptionErrorDecoder implements ErrorDecoder {
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Override
//    public Exception decode(String s, Response response) {
//
//        try {
//            if (response.body() != null) {
//                String targetMsg = null;
//                String body = Util.toString(response.body().asReader());
//                log.error(body);
//                ExceptionInfo ei = this.objectMapper.readValue(body.getBytes("UTF-8"), ExceptionInfo.class);
//                Class clazz = Class.forName(ei.getException());
//                Object obj = clazz.newInstance();
//                String message = ei.getMessage();
//                if (obj instanceof BusinessException) {
//                    targetMsg = message.substring(message.indexOf("{"), message.indexOf("}") + 1);
//                    BusinessException businessException = JsonUtil.toObj(targetMsg, BusinessException.class);
//                    return businessException;
//                }else{
//                    targetMsg=message.substring(message.indexOf(":"),message.length());
//                    return new InternalException(targetMsg);
//                }
//
//            }
//        } catch (Exception var4) {
//            log.error(var4.getMessage());
//            return new InternalException(var4.getMessage());
//        }
//        return new InternalException("系统异常,请联系管理员");
//    }
//
//}
