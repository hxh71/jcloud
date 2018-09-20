package com.chero.server.mybatis.controller;

import com.chero.client.user.UserClient;
import com.chero.server.mybatis.domain.TestDO;
import com.chero.server.mybatis.mapper.TestMapper;
import com.chero.server.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    private TestMapper testMapper;

    @RequestMapping("/daoSave")
    public Object daoSave(TestDO testDO) {

        return testMapper.insert(testDO);
    }

    @RequestMapping("/daoSave2")
    public Object daoSave2(@RequestBody TestDO testDO) {

        return testMapper.insert(testDO);
    }
    @RequestMapping("/countDao")
    public Object countDao(TestDO testDO) {
        TestDO a = new TestDO();
        a.setUid("a79ae1acd573");
        Example<TestDO> example = Example.of(a);
//        return testMapper.count1111(example);
        return null;
    }
    @RequestMapping("/countDao2")
    public Object countDao2(TestDO testDO) {

//        return testMapper.count2222();
        return null;
    }
    @RequestMapping("/countDao3")
    public Object countDao3(TestDO testDO) {

//        List<TestMapper.NameOnly> nameOnlyList = testMapper.count3();
//        List<TestMapper.NameOnlyImpl> list = new ArrayList<>();
//        for (TestMapper.NameOnly nameOnly:
//             nameOnlyList) {
//            System.out.println("!!!!!!uid");
//            System.out.println(nameOnly.getU());
//            TestMapper.NameOnlyImpl nameOnlyImpl = new TestMapper.NameOnlyImpl();
//            BeanUtils.copyProperties(nameOnly, nameOnlyImpl);
//            list.add(nameOnlyImpl);
//        }
        return null;
    }

    @RequestMapping("/findDao")
    public Object findDao() {

        return testMapper.selectById("00b0b25f-1222-4372-9ddc-14bd6c283f64");
    }
    @RequestMapping("/findDao1")
    public Object findDao1() {
        TestDO testDO = new TestDO();
        testDO.setUid("6d129201-dec1-46cb-928b-a79ae1acd573");
        Example<TestDO> example = Example.of(testDO);
//        return testMapper.selectById(example);
        return null;
    }
    @RequestMapping("/findDao2")
    public Object findDao2() {
        TestDO testDO = new TestDO();
        testDO.setUid("6d129201-dec1-46cb-928b-a79ae1acd573");
        Example<TestDO> example = Example.of(testDO);
//        return testMapper.findOne(example);
        return null;
    }

    @RequestMapping("/likeDao")
    public Object like(String[] str) {
//        for (int i = 0; i < str.length; i++) {
//            str[i] = '%' + str[i] + '%';
//        }

//        return testMapper.findAllBySLike(str);
        return null;
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