package com.chero.server.mybatis.service;
import java.util.List;

import com.chero.server.mybatis.domain.UserDO;
import org.springframework.data.domain.Page;
public interface UserService {
	public UserDO add(UserDO user_DO_model);
	public void delete(String id);
	public UserDO update(UserDO user_DO_model);
	public UserDO get(String id) throws Exception;
	public UserDO getByUsername(String username) throws Exception;
	public List<UserDO> getAll();
	public Page<UserDO> getPage(Integer page, Integer rows);
}