package com.chero.bserver.sso.model.controller;


import com.chero.bserver.sso.model.service.RbacService;
import com.chero.bserver.sso.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by hxh on 2018/5/10.
 */
@RestController
public class ResourceController {
    @Autowired
    private RbacService rbacService;

    @RequestMapping("/user")
    public Principal resource(Principal user) {
        return user;
    }
    @RequestMapping("/user1")
    public Object user1() {
        return UserUtil.getCurrentUser();
    }
}
