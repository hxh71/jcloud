package com.chero.common.pojo.enums;

import lombok.Getter;

/**
 * Created by hxh on 2018/4/10.
 */
@Getter
public enum ExceptionEnum implements CodeEnum{
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
    ORDER_NOT_EXIST(12, "订单不存在"),
    ORDERDETAIL_NOT_EXIST(13, "订单详情不存在"),
    ORDER_STATUS_ERROR(14, "订单状态不正确"),
    ORDER_UPDATE_FAIL(15, "订单更新失败"),
    ORDER_DETAIL_EMPTY(15, "订单详情为空"),
    ORDER_PAY_STATUS_ERROR(17, "订单支付状态不正确"),
    CART_EMPTY(18, "购物车为空"),
    ORDER_OWNER_ERROR(19, "该订单不属于当前用户"),
    WECHAT_MP_ERROR(20, "微信公众号方面错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21, "微信支付异步通知金额校验不通过"),
    DATE_PARSE_ERROR(4001, "日期解析错误"),
    CODE_PEOCESSOR_NOT_EXIST(1000,"验证码处理器不存在"),
    CODE_GENERATOR_NOT_EXIST(1001,"验证码生成器不存在"),
    CODE_GET_ERROR(1002, "获取验证码获取失败"),
    CODE_NULL_ERROR(1003, "验证码不能为空"),
    CODE_ERROR(1004, "验证码错误"),
    CODE_EXPIRED_ERROR(1005, "验证码已过期"),
    CODE_MATCH_ERROR(1006, "验证码不匹配"),
    PARAM_ERROR(2000, "参数错误"),
    PARAM_MOBILE_NOT_EXIST(2001, "手机号未填"),
    PARAM_PASSWORD_NOT_EXIST(2002, "密码未填"),
    PARAM_SMSCODE_NOT_EXIST(2003, "验证码未填"),
    VALIDATE_MOBILE_NOT_REGISTER(3000, "该手机号未注册"),
    VALIDATE_MOBILE_IS_REGISTER(3001, "该手机号已经注册"),


    ;

    private Integer code;

    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}