package com.chero.common.pojo.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 22:11
 */
@Data
public class ProductVO implements Serializable {

    @JsonProperty("productId")
    private String id;

    // 商品顶级类型
    private Integer topType;
    // 商品顶级名称
    private String topTypeName;

    // 商品类型
    private Integer categoryType;
    // 商品类型名称
    private String categoryTypeName;

    // 商品名称
    private String name;
    // 描述
    private String description;
    // 商品规格
    private String specification;
    // 商品图标
    private String icon;
    // 商品使用次数
    private Integer usageCount;
    // 过期时间
    private Integer valid;
    // 是否为赠送商品
    private Boolean bonus;
    // 商品价格
    private BigDecimal price;
    // 商品状态
    private Integer productStatus;
    // 库存
    private Integer stock;

    // 赠送商品
    private String bonusProductIds;

    // 商品标签
    private String tagTypes;

    private String keyword;

    private Date createTime;

    private Date updateTime;

    @JsonProperty("promotions")
    List<PromotionVO> promotionVOList = new ArrayList<>();
}
