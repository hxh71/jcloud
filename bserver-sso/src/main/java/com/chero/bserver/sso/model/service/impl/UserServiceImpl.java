package com.chero.bserver.sso.model.service.impl;

import com.chero.bserver.sso.model.pojo.domain.RolePO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.repository.UserDAO;
import com.chero.bserver.sso.model.repository.UserRoleDAO;
import com.chero.bserver.sso.model.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Slf4j
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserRoleDAO userRoleDAO;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public UserPO add(UserPO userPO) {
        if (userDAO.findByMobile(userPO.getMobile()) == null) {
            return userDAO.save(userPO);
        } else {
            throw new RuntimeException("该手机号已经为注册用户");
        }
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void delete(String id) {
        userDAO.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public UserPO update(UserPO user_DO_model) {
        return userDAO.saveAndFlush(user_DO_model);
    }

    public UserPO get(String id) throws Exception {
        UserPO userDO = userDAO.findOne(id);
        if (userDO != null) {
            return userDO;
        } else {
            throw new RuntimeException("该用户不存在");
        }
    }

    public UserPO getByUsername(String username) {

        UserPO userPO = userDAO.findByMobile(username);
        return userPO;
    }

    public List<UserPO> getAll() {
        return userDAO.findAll();
    }

    public Page<UserPO> getPage(Integer page, Integer rows) {
        Pageable pageable = new PageRequest(page - 1, rows);
        return userDAO.findAll(pageable);
    }

    public Map<String, Object> getAuthByMobile(String mobile) {
        Map<String, Object> map = new HashMap<>();
        UserPO user = userDAO.findByMobile(mobile);
        if (user != null) {
            map.put("allRoles", userRoleDAO.findRoleIdByIdUserId(user.getUserId()));
        }
        map.put("user", user);
        return map;
    }
    @Override
    public UserPO loadUserByUsername(String mobile) throws UsernameNotFoundException {
        UserPO user = userDAO.findByMobile(mobile);
//        Map<String, Object> map = userService.getAuthByMobile(mobile);
        log.info("【load用户名】={}", mobile);
        Set<RolePO> roles ;
        if (user == null) {
            throw new UsernameNotFoundException("用户" + mobile + "信息不存在！");
        } else {
            roles = userRoleDAO.findRoleByUserId(user.getUserId());
        }

        user.setRoles(roles);
        return user;

//        throw new RuntimeException("用户名错误");
    }
}