package com.chero.server.user.exception;

import com.chero.common.pojo.enums.ExceptionEnum;
import lombok.Data;

/**
 * Created by hxh on 2018/4/10.
 */
@Data
public class ParamException extends RuntimeException {

    private static final long serialVersionUID = 5246782975258589800L;

    private Integer id = ExceptionEnum.PARAM_ERROR.getCode();

    public ParamException(Integer id, String message) {
        super(message);
        this.id = id;
    }

    public ParamException(String message) {
        super(message);
    }

    public ParamException(Integer id) {
        super(ExceptionEnum.PARAM_ERROR.getMessage());
        this.id = id;
    }

    public ParamException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.id = exceptionEnum.getCode();
    }

    public ParamException() {
        super(ExceptionEnum.PARAM_ERROR.getMessage());
    }
}
