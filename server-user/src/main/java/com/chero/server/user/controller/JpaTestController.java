package com.chero.server.user.controller;

import com.chero.server.user.domain.JpaTestDO;
import com.chero.server.user.repository.JpaTestDAO;
import com.chero.server.user.repository.JpaTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hxh
 * @date 2018/8/7
 */
@RestController
@RequestMapping("/jpatest")
public class JpaTestController {

    @Autowired
    private JpaTestRepository jpaTestRepository;
    @Autowired
    private JpaTestDAO jpaTestDAO;

    @RequestMapping("/projection")
    public Object getProjection(@RequestParam String id) {
        return jpaTestRepository.findByProjection(id);
    }
    @RequestMapping("/projection2")
    public Object getProjection2(@RequestParam String id) {
        return jpaTestDAO.getJpaTestProjection(id);
    }
    @RequestMapping("/example")
    public Object getExample(@RequestParam String id) {
//        return jpaTestRepository.findByE(id);
//        ExampleMatcher matcher = ExampleMatcher
//                .matching()
//                .withMatcher()
        return null;
    }
}
