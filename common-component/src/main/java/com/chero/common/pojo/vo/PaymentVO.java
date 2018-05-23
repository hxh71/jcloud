package com.chero.common.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/21.
 */
@Data
public class PaymentVO {

    private String userInfoId;

    private String mainUserId;
    // 商品类目
    private String categoryType;

    // 商品id
    private String productId;

    // 商品名称
    private String productName;

    // 增减（true 增， false 减）
    private Boolean plusMinus;

    // 内容（商品名称）
    private String content;


    private String nicname;

    // 次数
    private Integer count;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;

}
