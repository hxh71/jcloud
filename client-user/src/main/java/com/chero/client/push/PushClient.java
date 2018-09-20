package com.chero.client.push;

import com.chero.client.user.UserClient;
import com.chero.common.pojo.domain.UserDO;
import com.chero.common.pojo.dto.PushReportDTO;
import com.chero.common.pojo.vo.UserMeSaveVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by hxh on 2018/5/7.
 */
@FeignClient(name = "user")
public interface PushClient {

    /**
     * 根据手机号查询用户
     * @return
     */
    @PostMapping("service/push")
    UserDO findByUsername(PushReportDTO pushReportDTO); // 一定要加上value，跟springmvc不一样

}
