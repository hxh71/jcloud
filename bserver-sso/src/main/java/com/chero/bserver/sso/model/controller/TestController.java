package com.chero.bserver.sso.model.controller;

import com.chero.bserver.sso.model.pojo.domain.UserDO;
import com.chero.bserver.sso.model.pojo.po.ClientPO;
import com.chero.bserver.sso.model.repository.ClientDAO;
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

    @GetMapping("/test")
    public Object aaa() {
        return "success";
    }

    @Autowired
    private ClientDAO clientDAO;

    @GetMapping("/client")
    public Object cllient() {
        return clientDAO.save(new ClientPO());
    }

    @GetMapping("/client/find")
    public Object findcllient() {
        return clientDAO.findByClientId("hxh");
    }

    @GetMapping("/client/delete")
    public Object deletecllient() {
        clientDAO.delete(1014786355764158464L);
        return "success";
    }
    @GetMapping("/client/deleteAll")
    public Object deletecllientAll() {
        Long[] ids = new Long[2];
        ids[0] = 1014713098540949504L;
        ids[1] = 1014713098540949505L;
//        clientDAO.deleteAllByIdIn(ids);
        List<ClientPO> list = new ArrayList<>();
        ClientPO clientPO1 = new ClientPO();
        clientPO1.setId(ids[0]);
        list.add(clientPO1);
        ClientPO clientPO2 = new ClientPO();
        clientPO2.setId(ids[0]);
        list.add(clientPO2);
        clientDAO.deleteInBatch(list);
        return "success";
    }

    @GetMapping("/client/getId")
    public Object getIdcllient() {
        ClientPO clientPO = new ClientPO();
        return clientPO;
    }
    @GetMapping("/client/test")
    public Object getIdcllienttest() {
        ClientPO clientPO = clientDAO.findByClientId("hxh");
        clientPO.setRemarks("测试！！!!！");
        return clientDAO.save(clientPO);

    }
    @GetMapping("/client/update")
    public Object getIdcllientupdate() {

         clientDAO.updateByClientId("hxh", "为什么不更改时间呢？？？");
        return "success";
    }
//    @GetMapping("/client/delete")
//    public Object getIdcllientupdatedete() {
//
//         clientDAO.delete(1014786355764158464L);
//        return "success";
//    }
    @GetMapping("/client/update1")
    public Object getIdcllientupdate1() {
        ClientPO clientPO = clientDAO.findByClientId("hxh");
        if (clientPO != null) {
            clientPO.setRemarks("使用save更改");
        }
        clientDAO.save(clientPO);
         clientDAO.updateByClientId("hxh", "为什么不更改时间呢？？？");
        return "success";
    }
    @GetMapping("/client/update2")
    public Object getIdcllientupdate2() {

         clientDAO.updateByClientId("hxh", "为什么不更改时间呢？？？", "123");
        return "success";
    }
    @GetMapping("/client/update3")
    public Object getIdcllientupdate3() {

         clientDAO.updateByClientId("hxh", "为什么不更改时间呢!？？", "hxh");
//        clientDAO.save()
        return "success";
    }
}
