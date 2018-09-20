package com.chero.server.mybatis.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.chero.server.mybatis.domain.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author hxh
 */
@Repository
public interface UserMapper extends BaseMapper<UserDO> {
//    UserDO findByMobile(String username);
    int deleteAll();
}