package com.chero.server.user.controller;

import com.chero.server.user.domain.TestDO;
import com.chero.server.user.repository.TestRepository;
import com.chero.server.user.service.TestService;
import com.chero.server.user.util.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/test")
public class TestController {

    //    @Autowired
//    private UserClient userClient;
    @Autowired
    private TestService testService;

//    @GetMapping("/user")
//    public String getUser() {
//        return userClient.getTestUser();
//    }

//    @GetMapping("/all")
//    public Object getAll() {
//        return userClient.getTestAll();
//    }

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

    @RequestMapping("/daoUpdate")
    public Object daoUpdate(TestDO testDO) {

        return testRepository.update(testDO.getS(), testDO.getUid());
    }

    @RequestMapping("/countDao")
    public Object countDao(TestDO testDO) {
        TestDO a = new TestDO();
        a.setUid("a79ae1acd573");
        Example<TestDO> example = Example.of(a);
        return testRepository.count1111(example);
    }

    @RequestMapping("/countDao2")
    public Object countDao2(TestDO testDO) {

        return testRepository.count2222();
    }

    @RequestMapping("/countDao3")
    public Object countDao3(TestDO testDO) {

        List<TestRepository.NameOnly> nameOnlyList = testRepository.count3();
        List<TestRepository.NameOnlyImpl> list = new ArrayList<>();
        for (TestRepository.NameOnly nameOnly :
                nameOnlyList) {
            System.out.println("!!!!!!uid");
//            System.out.println(nameOnly.getU());
            TestRepository.NameOnlyImpl nameOnlyImpl = new TestRepository.NameOnlyImpl();
            BeanUtils.copyProperties(nameOnly, nameOnlyImpl);
            list.add(nameOnlyImpl);
        }
        return nameOnlyList;
    }

    @RequestMapping("/findDao")
    public Object findDao() {

        Optional<TestDO> op = testRepository.findById("6d129201-dec1-46cb-928b-a79ae1acd573");
        return op.orElse(null);
    }

    @RequestMapping("/findDao1")
    public Object findDao1() {
        TestDO testDO = new TestDO();
        testDO.setUid("6d129201-dec1-46cb-928b-a79ae1acd573");
        Example<TestDO> example = Example.of(testDO);
        return testRepository.findOne(example);
    }

    @RequestMapping("/findDao2")
    public Object findDao2() {
        TestDO testDO = new TestDO();
        testDO.setUid("6d129201-dec1-46cb-928b-a79ae1acd573");
        Example<TestDO> example = Example.of(testDO);
        return testRepository.findOne(example);
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

    @RequestMapping("/getTestValue")
    public Object getTestValue() {

        return TestLogUtil.getTest();
//        return new Object();
    }

    @RequestMapping("/getTestValue2")
    public Object getTestValue2() {

        return LogUtil2.addLog("aa");
//        return new Object();
    }
    @RequestMapping("/getTestValue21")
    public Object getTestValue21() {

        return LogUtil21.addLog("aa");
//        return new Object();
    }

    @RequestMapping("/getTestValue3")
    public Object getTestValue3() {

        return LogUtil3.addLog("aa");
//        return new Object();
    }
}