package com.chero.server.user.controller;

import com.chero.server.user.domain.SqlTestDO;
import com.chero.server.user.repository.JpaTestDAO;
import com.chero.server.user.repository.JpaTestRepository;
import com.chero.server.user.repository.SqlTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hxh
 * @date 2018/8/7
 */
@RestController
@RequestMapping("/pagetest")
public class PageTestController {

    @Autowired
    private SqlTestRepository sqlTestRepository;

    @RequestMapping("/1")
    public Page<SqlTestDO> pagetest1(Pageable p) {
        return sqlTestRepository.findAll(p);
    }

}
