package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/21.
 */
@Data
public class ServiceRemainVO {
    @JsonIgnore
    private String id;
    // 用户id
    private String mainUserId;
    // 商品类目
    private Integer categoryType;
    // 服务次数
    private Integer remainCount;
    // 有效期限
    private Integer valid;
    // 开始时间
    private Date startTime;
    // 结束时间
    private Date endTime;
}
