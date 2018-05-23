package com.chero.bserver.sso.model.pojo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import javax.persistence.Entity;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_ROLE;

@Data
@Entity
@Table(name = SYS_ROLE)
@SQLDelete(sql = "update " + SYS_ROLE + " set deleted = 1 where id = ?")
@Where(clause = "deleted = 0")
@NoArgsConstructor
public class RolePO extends BasePO {


	private String roleId;

	private String title;

	public RolePO(String roleId, String title) {
		this.roleId = roleId;
		this.title = title;
	}
}