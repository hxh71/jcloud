package com.chero.server.user.controller;

import com.chero.client.user.UserClient;
import com.chero.common.pojo.vo.ResultVO;
import com.chero.common.utils.ResultVOUtil;
import com.chero.server.user.domain.TestDO;
import com.chero.server.user.domain.UserDO;
import com.chero.server.user.repository.TestRepository;
import com.chero.server.user.service.TestService;
import com.chero.server.user.service.UserService;
import com.chero.server.user.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private TestService testService;

    @GetMapping("/user")
    public String getUser() {
        return userClient.getTestUser();
    }

    @GetMapping("/all")
    public Object getAll() {
        return userClient.getTestAll();
    }

    @RequestMapping("/date")
    public Object getDate(Bean bean) throws ParseException {
        Map<String, Object> map = new HashMap<>();
        map.put("date", bean.getDate());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("1969-01-01");
        System.out.println(date.getTime());
//		return date.getTime();
        return bean;
    }

    @RequestMapping("/list")
    public Object getList(@RequestBody DataBean data) throws ParseException {
//		list.add()
        return data;
    }

    @RequestMapping("/list2")
    public Object getList2(DataBean data) throws ParseException {
//		list.add()
        return data;
    }

    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/daoSave")
    public Object daoSave(TestDO testDO) {

        return testRepository.save(testDO);
    }

    @RequestMapping("/daoSave2")
    public Object daoSave2(@RequestBody TestDO testDO) {

        return testRepository.save(testDO);
    }
    @RequestMapping("/countDao")
    public Object countDao(TestDO testDO) {

        return testRepository.count1111();
    }
    @RequestMapping("/countDao2")
    public Object countDao2(TestDO testDO) {

        return testRepository.count2222();
    }
    @RequestMapping("/countDao3")
    public Object countDao3(TestDO testDO) {

        return testRepository.count3();
    }

    @RequestMapping("/findDao")
    public Object findDao() {

        return testRepository.findOne("6d129201-dec1-46cb-928b-a79ae1acd573");
    }

    @RequestMapping("/likeDao")
    public Object like(String[] str) {
//        for (int i = 0; i < str.length; i++) {
//            str[i] = '%' + str[i] + '%';
//        }

        return testRepository.findAllBySLike(str);
    }

    @RequestMapping("/exception/service")
    public Object testException() {

        testService.testException();
        return new Object();
    }
    @RequestMapping("/exception/controller")
    public Object testException2() {

        throw new RuntimeException("控制异常抛出");
//        return new Object();
    }
}