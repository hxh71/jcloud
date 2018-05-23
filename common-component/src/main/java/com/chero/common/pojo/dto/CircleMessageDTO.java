package com.chero.common.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/16.
 */
@Data
public class CircleMessageDTO {
    /**
     * 起始日期
     */
    private Date from;
    /**
     * 结束日期
     */
    private Date to;
    /**
     * 其他角色id
     */
    private String otherRoleId;
}
