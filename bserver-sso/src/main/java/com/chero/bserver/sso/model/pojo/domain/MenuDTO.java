package com.chero.bserver.sso.model.pojo.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_MENU;

@Data
public class MenuDTO extends BaseWithoutIdPO {

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