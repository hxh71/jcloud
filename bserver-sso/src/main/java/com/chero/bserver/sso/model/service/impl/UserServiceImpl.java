package com.chero.bserver.sso.model.service.impl;

import com.chero.bserver.sso.convert.UserRoleFactory;
import com.chero.bserver.sso.model.pojo.po.RolePO;
import com.chero.bserver.sso.model.pojo.po.UserPO;
import com.chero.bserver.sso.model.pojo.domain.UserDO;
import com.chero.bserver.sso.model.repository.RoleDao;
import com.chero.bserver.sso.model.repository.UserDAO;
import com.chero.bserver.sso.model.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDao roleDao;

    @Override
    public UserDO loadUserByUsername(String mobile) throws UsernameNotFoundException {
        UserPO user = userDAO.findByMobile(mobile);
        log.info("【load用户名】={}", mobile);
        List<RolePO> roles ;
        if (user == null) {
            throw new UsernameNotFoundException("用户" + mobile + "信息不存在！");
        } else {
            roles = roleDao.findRolesByUserId(user.getUserId());
            return UserRoleFactory.create(user, roles);
        }
    }

    @Override
    public UserDO findByMobile(String mobile) {
        UserPO user = userDAO.findByMobile(mobile);
        log.info("【load用户名】={}", mobile);
        List<RolePO> roles ;
        if (user == null) {
            return null;
        } else {
            roles = roleDao.findRolesByUserId(user.getUserId());
            return UserRoleFactory.create(user, roles);
        }
    }
}