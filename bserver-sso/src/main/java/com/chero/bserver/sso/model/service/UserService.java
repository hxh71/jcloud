package com.chero.bserver.sso.model.service;

import com.chero.bserver.sso.model.pojo.domain.UserPO;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;

public interface UserService extends UserDetailsService {
	UserPO add(UserPO user_DO_model);
	void delete(String id);
	UserPO update(UserPO user_DO_model);
	UserPO get(String id) throws Exception;
	UserPO getByUsername(String username);
	List<UserPO> getAll();
	Page<UserPO> getPage(Integer page, Integer rows);

	/**
	 * 根据指定的用户编号查询用户的信息以及
	 * @param mobile 用户编号
	 * @return 包含有如下返回内容：
	 * key = user、value = 用户信息， 如果没有信息返回null；
	 * key = allRoles、 value
	 */
	Map<String, Object> getAuthByMobile(String mobile);
}