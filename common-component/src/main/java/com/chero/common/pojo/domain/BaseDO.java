package com.chero.common.pojo.domain;

/**
 * 基础DO
 * Created by hxh on 2018/3/31.
 */

import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
class BaseDO implements Serializable {
    /**
     * 创建用户
     */
    protected String createUser;
    /**
     * 更新用户
     */
    protected String updateUser;
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 更新时间
     */
    protected Date updateTime;
    /**
     * 删除标志
     */
    protected Integer deleteFlag = 0;
    /**
     * 备注
     */
    protected String remarks;
}
