package com.chero.bserver.sso.model.repository;

import com.chero.bserver.sso.model.pojo.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hxh on 2018/5/8.
 */
public interface UserDAO extends JpaRepository<UserPO, String> {
    UserPO findByMobile(String username);
    UserPO findByUserId(String userId);

}
