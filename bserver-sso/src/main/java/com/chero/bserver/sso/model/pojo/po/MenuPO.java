package com.chero.bserver.sso.model.pojo.po;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_MENU;

@Data
@Entity
@Table(name = SYS_MENU)
@SQLDelete(sql = "update " + SYS_MENU + " set deleted = 1 where id = ?")
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