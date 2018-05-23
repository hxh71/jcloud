package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hxh on 2018/4/19.
 */
@Data
public class AppProductVO {
    @JsonProperty("productId")
    private String id;

    private String name;

    private String specification;

    private String icon;

    private Integer usageCount;

    private BigDecimal price;

    private Integer valid;

    private Date updateTime;
}

