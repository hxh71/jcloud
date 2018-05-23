package com.chero.bserver.sso.model.controller;

import com.chero.bserver.sso.model.pojo.domain.ClientPO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.repository.ClientDAO;
import com.chero.bserver.sso.model.repository.UserDAO;
import com.chero.bserver.sso.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ClientDAO clientDAO;

    @Autowired
    UserDAO userDAO;
    @Autowired
    UserService userService;


    @GetMapping("/client/delete")
    public void clientDelete(@RequestParam String id) {
        clientDAO.delete(id);
    }
    @GetMapping("/client/add")
    public Object clientAdd() {
        ClientPO clientPO = new ClientPO();
        return clientDAO.save(clientPO);
    }
    @GetMapping("/client/get")
    public Object clientGet(@RequestParam String id) {
        return clientDAO.findOne(id);
    }

    @GetMapping("/user/delete")
    public void userDelete(@RequestParam String id) {
        userDAO.delete(id);
    }
    @GetMapping("/user/add")
    public Object userAdd() {
        UserPO userPO = new UserPO();
        userPO.setMobile("153");
        return userService.add(userPO);
    }
    @GetMapping("/user/get")
    public Object userGet(@RequestParam String id) {
        return userDAO.findOne(id);
    }

    @GetMapping("/user/getByUserId")
    public Object userGetByUserName(@RequestParam String userId) {
        return userDAO.findByUserId(userId);
    }
    @GetMapping("/user/getByMobile")
    public Object userGetByMobile(@RequestParam String mobile) {
        return userDAO.findByMobile(mobile);
    }


}
