package com.chero.server.user.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
@Data
@Entity
@Table(name = "db_order_detail")
//@GenericGenerator(name = "uuid", strategy = "uuid")
@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator") // 代替原来的uuid 防止 warn
// Using org.hibernate.id.UUIDHexGenerator which does not generate IETF RFC 4122 compliant UUID values; consider using org.hibernate.id.UUIDGenerator instead
public class UserDO extends BaseDO{
	@Id
	@GeneratedValue(generator = "uuid")
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