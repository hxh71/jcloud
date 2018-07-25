package com.chero.bserver.sso.model.pojo.po.base;


import com.chero.bserver.sso.config.BaseEntityAuditListener;
import com.chero.bserver.sso.util.IDUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


/**
 * 基础PO
 *
 * @author hxh
 * @date 2018/3/31
 */
@Data
@MappedSuperclass
@EntityListeners(BaseEntityAuditListener.class)

//@EntityListeners(AuditingEntityListener.class)
public abstract class BaseSnowflakeIdPO {

    @Id
    @GenericGenerator(name = "snowFlakeId",
            strategy = "com.chero.bserver.sso.model.pojo.po.id.strategy.SnowflakeId")
    @GeneratedValue(generator = "snowFlakeId")
    protected Long id;
    
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
