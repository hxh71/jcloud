package com.chero.bserver.sso.model.pojo.po;

/**
 * 基础PO
 * Created by hxh on 2018/3/31.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

//@SQLDelete(sql = "update demo set deleted = 1 where id = ?")
//@Where(clause = "deleted = 0")
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseWithoutIdPO {

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
    protected Date updateTime;
    /**
     * 删除标志
     */
    @JsonIgnore
    protected Boolean deleted = Boolean.FALSE;
    /**
     * 备注
     */
    protected String remarks;
}
