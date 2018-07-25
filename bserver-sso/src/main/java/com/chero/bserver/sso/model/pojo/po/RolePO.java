package com.chero.bserver.sso.model.pojo.po;

import com.chero.bserver.sso.model.pojo.po.base.BaseWithoutIdPO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLDeleteAll;
import org.hibernate.annotations.Where;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_MENU;
import static com.chero.bserver.sso.model.pojo.TableName.SYS_ROLE;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_A;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_PREFIX;

@Data
@Entity
@Table(name = SYS_ROLE)
@SQLDelete(sql = D_PREFIX + SYS_ROLE + D)
//@SQLDeleteAll(sql = D_PREFIX + SYS_ROLE + D_A)
@Where(clause = "deleted = 0")
@NoArgsConstructor
public class RolePO extends BaseWithoutIdPO {

	@Id
	private String roleId;

	private String title;

	public RolePO(String roleId, String title) {
		this.roleId = roleId;
		this.title = title;
	}
}