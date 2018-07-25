package com.chero.bserver.sso.model.pojo.po;

import com.chero.bserver.sso.config.BaseEntityAuditListener;
import com.chero.bserver.sso.model.pojo.po.base.BaseSnowflakeIdPO;
import com.chero.bserver.sso.util.SQLDeleteConstant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLDeleteAll;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_CLIENT;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_A;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_PREFIX;

/**
 * Created by hxh on 2018/4/28.
 */
@Data
@Entity
@Table(name = SYS_CLIENT)
@SQLDelete(sql = D_PREFIX + SYS_CLIENT + D)
//@SQLDeleteAll(sql = D_PREFIX + SYS_CLIENT + D_A)
@Where(clause = "deleted = 0")
@NoArgsConstructor
public class ClientPO extends BaseSnowflakeIdPO {
    private String clientId;
    private String clientSecret;
    private String resourceIds;
    private String scope;
    private String authorizedGrantTypes;
    private String authorities;
    private Boolean enabled;
}
