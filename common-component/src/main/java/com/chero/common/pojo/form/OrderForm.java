package com.chero.common.pojo.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import sun.dc.pr.PRError;

/**
 * Created by hxh on 2018/4/19.
 */

@Data
public class OrderForm {

    /**
     * 买家姓名
     */
//    @NotEmpty(message = "姓名必填")
//    private String name;

    /**
     * 买家手机哈
     */
//    @NotEmpty(message = "手机号必填")
//    private String mobile;

    /**
     * 买家地址
     */
//    @NotEmpty(message = "地址必填")
//    private String address;

    /**
     * 买家微信openid
     */
//    @NotEmpty(message = "openid必填")
//    private String openid;

    /**
     * 购物车
     */
//    @NotEmpty(message = "购物车不能为空")
//    private String items;

    @NotEmpty(message = "未选商品")
    private String productId;
    @NotEmpty(message = "商品数量未选")
    private Integer qunatity;

//    @NotEmpty(message = "商品数量未选")
//    private String userId;
}
