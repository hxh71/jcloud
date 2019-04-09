package com.chero.server.user.service.impl;

import com.chero.server.user.domain.UserDO;
import com.chero.server.user.service.UserService;
import com.chero.server.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public UserDO add(UserDO user_DO_model) {
        return userRepository.save(user_DO_model);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void delete(String id) {
//        userRepository.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public UserDO update(UserDO user_DO_model) {
        return userRepository.saveAndFlush(user_DO_model);
    }

    @Override
    public UserDO get(String id) throws Exception {
        return userRepository.findOne(id);
//        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserDO getByUsername(String username) throws Exception {

        UserDO userDO = userRepository.findByMobile(username);
        if (userDO != null) {
            return userDO;
        } else {
            throw new RuntimeException("该用户不存在");
        }
    }

    @Override
    public List<UserDO> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<UserDO> getPage(Integer page, Integer rows) {
        Pageable pageable = new PageRequest(page - 1, rows);
        return userRepository.findAll(pageable);
    }
}