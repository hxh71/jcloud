package com.chero.bserver.sso.model.controller;

import com.chero.bserver.sso.model.pojo.domain.UserDO;
import com.chero.bserver.sso.model.service.UserService;
import com.chero.bserver.sso.util.UserUtil;
import com.chero.client.test.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by hxh on 2018/5/11.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestClient testClient;

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Object getUser() {
        return UserUtil.getCurrentUser();
    }

    @GetMapping("/all")
    public Object getAll() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @GetMapping("/exception")
    public Object testFeignException() {
        return testClient.testException();
    }

    @GetMapping("/db")
    public Object dbTest(@RequestParam String[] mobiles) {
        List<UserDO> userDOList = new ArrayList<>();
        for (String mobile :
                mobiles) {
            UserDO userDO = userService.findByMobile(mobile);
            userDOList.add(userDO);
        }
        return userDOList;
    }

    @GetMapping("/db1")
    public Object dbTest1(@RequestParam String[] mobiles) {
        List<UserDO> userDOList = new ArrayList<>();
        for (String mobile :
                mobiles) {
            UserDO userDO = userService.findByMobile(mobile);
//            if (!userDOList.contains(userDO)) {
                userDOList.add(userDO);
//            }
        }

        return new HashSet<>(userDOList);
    }
}
