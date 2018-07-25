package com.chero.bserver.sso.model.pojo.domain;

import com.chero.bserver.sso.model.pojo.po.base.BaseWithoutIdPO;
import lombok.Data;

@Data
public class MenuDO extends BaseWithoutIdPO {

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