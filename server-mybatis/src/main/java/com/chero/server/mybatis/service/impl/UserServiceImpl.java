package com.chero.server.mybatis.service.impl;

import java.util.List;

import com.chero.server.mybatis.domain.UserDO;
import com.chero.server.mybatis.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDO add(UserDO user_DO_model) {
		return null;
	}

	@Override
	public void delete(String id) {

	}

	@Override
	public UserDO update(UserDO user_DO_model) {
		return null;
	}

	@Override
	public UserDO get(String id) throws Exception {
		return null;
	}

	@Override
	public UserDO getByUsername(String username) throws Exception {
		return null;
	}

	@Override
	public List<UserDO> getAll() {
		return null;
	}

	@Override
	public Page<UserDO> getPage(Integer page, Integer rows) {
		return null;
	}
}