package com.chero.bserver.sso.model.controller;

import com.chero.bserver.sso.model.pojo.domain.ClientPO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.repository.ClientDAO;
import com.chero.bserver.sso.model.repository.UserDAO;
import com.chero.bserver.sso.model.service.UserService;
import com.chero.bserver.sso.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hxh on 2018/5/11.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("user")
    public Object getUser() {
        return UserUtil.getCurrentUser();
    }
    @GetMapping("all")
    public Object getAll() {
        return SecurityContextHolder.getContext().getAuthentication() ;
    }
}
