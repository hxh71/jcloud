package com.chero.server.mybatis.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Data;
@Data
@TableName("db_order_detail")
//@GenericGenerator(name = "uuid", strategy = "uuid")
// Using org.hibernate.id.UUIDHexGenerator which does not generate IETF RFC 4122 compliant UUID values; consider using org.hibernate.id.UUIDGenerator instead
public class UserDO extends BaseDO{
	@TableId
	private String uid;
	/**
	 * 用户名（手机号）
	 */
	private String mobile;
	/**
	 * 密码
	 */
//    @JsonIgnore
	private String password;


}