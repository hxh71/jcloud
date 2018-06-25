package com.chero.bserver.sso.model.service;

import com.chero.bserver.sso.model.pojo.domain.UserDO;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {

    public UserDO findByMobile(String mobile);
}