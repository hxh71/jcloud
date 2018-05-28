package com.chero.bserver.sso.model.service.impl;

import com.chero.bserver.sso.convert.UserRoleFactory;
import com.chero.bserver.sso.model.pojo.domain.RolePO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.pojo.dto.UserDTO;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserRoleDAO userRoleDAO;

    @Override
    public UserDTO loadUserByUsername(String mobile) throws UsernameNotFoundException {
        UserPO user = userDAO.findByMobile(mobile);
        log.info("【load用户名】={}", mobile);
        List<RolePO> roles ;
        if (user == null) {
            throw new UsernameNotFoundException("用户" + mobile + "信息不存在！");
        } else {
            roles = userRoleDAO.findRoleByUserId(user.getUserId());
        }
        return UserRoleFactory.create(user, roles);
    }
}