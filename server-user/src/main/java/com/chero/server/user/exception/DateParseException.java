//package com.chero.server.user.exception;
//
//import com.chero.common.pojo.enums.ExceptionEnum;
//import lombok.Data;
//
///**
// * Created by hxh on 2018/4/10.
// */
//@Data
//public class DateParseException extends RuntimeException {
//
//    private static final long serialVersionUID = -7808785271682803324L;
//
//    private Integer id = ExceptionEnum.DATE_PARSE_ERROR.getCode();
//
//    public DateParseException(Integer id, String message) {
//        super(message);
//        this.id = id;
//    }
//
//    public DateParseException(String message) {
//        super(message);
//    }
//
//    public DateParseException(Integer id) {
//        super(ExceptionEnum.DATE_PARSE_ERROR.getMessage());
//        this.id = id;
//    }
//
//
//    public DateParseException(ExceptionEnum exceptionEnum) {
//        super(exceptionEnum.getMessage());
//        this.id = exceptionEnum.getCode();
//    }
//
//
//    public DateParseException() {
//        super(ExceptionEnum.DATE_PARSE_ERROR.getMessage());
//    }
//}
