package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hxh on 2018/4/20.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionVO {
//    private String id;

    // 商品id
    @JsonIgnore
    private String productId;

    // 促销类型
    private Integer promotionType;

    // 促销类型名字和Type对应
    private String promotionName;

    // 促销价格
    private BigDecimal promotionPrice;

    // 开始时间
    private Date startTime;

    // 结束时间
    private Date endTime;

    // vip1价格
    private BigDecimal vip1Price;

    // vip2价格
    private BigDecimal vip2Price;

    // vip3价格
    private BigDecimal vip3Price;
}
