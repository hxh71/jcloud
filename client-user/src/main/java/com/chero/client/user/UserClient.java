package com.chero.client.user;


import com.chero.common.pojo.domain.UserDO;
import com.chero.common.pojo.dto.CreateUserDTO;
import com.chero.common.pojo.dto.UserDTO;
import com.chero.common.pojo.vo.UserMeSaveVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * Created by hxh on 2018/3/24.
 */
@FeignClient(name = "sso")
//, fallbackFactory = UserClient.UserClientFallback.class
public interface UserClient {

    @GetMapping("/test/user")
    String getTestUser(); // 一定要加上value，跟springmvc不一样
    @GetMapping("/test/all")
    Object getTestAll(); // 一定要加上value，跟springmvc不一样
}
