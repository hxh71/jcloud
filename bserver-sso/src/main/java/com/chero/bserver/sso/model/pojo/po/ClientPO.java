package com.chero.bserver.sso.model.pojo.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_CLIENT;

/**
 * Created by hxh on 2018/4/28.
 */
@Data
@Entity
@Table(name = SYS_CLIENT)
@SQLDelete(sql = "update " + SYS_CLIENT + " set deleted = 1 where id = ?")
@Where(clause = "deleted = 0")
@NoArgsConstructor
public class ClientPO extends BasePO {
    private String clientId;
    private String clientSecret;
    private String resourceIds;
    private String scope;
    private String authorizedGrantTypes;
    private String authorities;
    private Boolean enabled;
}
