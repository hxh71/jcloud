package com.chero.bserver.sso.model.pojo.domain;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import javax.persistence.Entity;
import javax.persistence.Table;
import static com.chero.bserver.sso.model.pojo.TableName.DB_USER_ROLE;

@Data
@Entity
@Table(name = DB_USER_ROLE)
@SQLDelete(sql = "update " + DB_USER_ROLE + " set deleted = 1 where id = ?")
@Where(clause = "deleted = 0")
public class UserRolePO extends BasePO {
	private String userId;
	private String roleId;
}