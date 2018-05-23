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
@GenericGenerator(name = "uuid", strategy = "uuid")
public class UserDO extends BaseDO{
	@Id
	@GeneratedValue(generator = "uuid")
	private String uid;
	/**
	 * 用户名（手机号）
	 */
	private String username;
	/**
	 * 密码
	 */
//    @JsonIgnore
	private String password;


}