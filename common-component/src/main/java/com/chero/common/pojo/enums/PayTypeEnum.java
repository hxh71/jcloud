package com.chero.common.pojo.enums;

import lombok.Getter;

/**
 * Created by hxh on 2018/4/19.
 */
@Getter
public enum  PayTypeEnum {
    WXPAY_APP(0, "微信"),
    ALIPAY_APP(1, "支付宝"),
            ;

    private Integer code;
    private String message;
    PayTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
