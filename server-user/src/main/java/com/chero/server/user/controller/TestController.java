package com.chero.server.user.controller;

import com.chero.client.user.UserClient;
import com.chero.common.pojo.vo.ResultVO;
import com.chero.common.utils.ResultVOUtil;
import com.chero.server.user.domain.TestDO;
import com.chero.server.user.domain.UserDO;
import com.chero.server.user.repository.TestRepository;
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

    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/daoSave")
    public Object daoSave(TestDO testDO) throws ParseException {

        return testRepository.save(testDO);
    }
}