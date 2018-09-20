package com.chero.server.mybatis.domain;

/**
 * 基础DO
 * Created by hxh on 2018/3/31.
 */

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

//@SQLDelete(sql = "update demo set deleted = 1 where id = ?")
//@Where(clause = "deleted = 0")
@Data
class BaseDO{
    /**
     * 创建用户
     */
    @CreatedBy
    protected String createUser;
    /**
     * 更新用户
     */
    @LastModifiedBy
    protected String updateUser;
    /**
     * 创建时间
     */
    @CreatedDate
    protected Date createTime;
    /**
     * 更新时间
     */
    @LastModifiedDate
//    @UpdateTimestamp
    protected Date updateTime;
    /**
     * 删除标志
     */
    protected Integer deleted = 0;
    /**
     * 备注
     */
    protected String remarks;
}
