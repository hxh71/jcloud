package com.chero.bserver.sso.model.pojo.po;

import com.chero.bserver.sso.model.pojo.po.id.embed.UserRolePK;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import static com.chero.bserver.sso.model.pojo.TableName.DB_USER_ROLE;

@Data
@Entity
@Table(name = DB_USER_ROLE)
public class UserRolePO {
	@EmbeddedId
	private UserRolePK id;
}