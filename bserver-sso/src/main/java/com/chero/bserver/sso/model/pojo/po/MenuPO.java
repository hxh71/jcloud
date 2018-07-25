package com.chero.bserver.sso.model.pojo.po;

import com.chero.bserver.sso.model.pojo.po.base.BaseWithoutIdPO;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLDeleteAll;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_CLIENT;
import static com.chero.bserver.sso.model.pojo.TableName.SYS_MENU;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_A;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_PREFIX;

@Data
@Entity
@Table(name = SYS_MENU)
@SQLDelete(sql = D_PREFIX + SYS_MENU + D)
//@SQLDeleteAll(sql = D_PREFIX + SYS_MENU + D_A)
@Where(clause = "deleted = 0")
public class MenuPO extends BaseWithoutIdPO {

	@Id
    @GeneratedValue
	private Long menuId;
	private String url;
	private String path;
	private String component;
	private String name;
	private String icon;
	private Boolean keepAlive;
	private Boolean requireAuth;
	private Long parentId;

}