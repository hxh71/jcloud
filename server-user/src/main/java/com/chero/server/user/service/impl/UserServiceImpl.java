package com.chero.server.user.service.impl;
import com.chero.server.user.domain.UserDO;
import com.chero.server.user.service.UserService;
import com.chero.server.user.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public UserDO add(UserDO user_DO_model){
		return userRepository.save(user_DO_model);
	}
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public void delete(String id){
		userRepository.delete(id);
	}
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public UserDO update(UserDO user_DO_model){
		return userRepository.saveAndFlush(user_DO_model);
	}
	public UserDO get(String id) throws Exception{
		UserDO userDO = userRepository.findOne(id);
		if (userDO != null) {
			return userDO;
		} else {
			throw new RuntimeException("该用户不存在");
		}
	}
	public UserDO getByUsername(String username) throws Exception{

		UserDO userDO =  userRepository.findByUsername(username);
		if (userDO != null) {
			return userDO;
		} else {
			throw new RuntimeException("该用户不存在");
		}
	}
	public List<UserDO> getAll(){
		return userRepository.findAll();
	}
	public Page<UserDO> getPage(Integer page, Integer rows){
		Pageable pageable = new PageRequest(page-1, rows);
		return userRepository.findAll(pageable);
	}
}