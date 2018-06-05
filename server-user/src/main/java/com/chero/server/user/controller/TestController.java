package com.chero.server.user.controller;
import com.chero.client.user.UserClient;
import com.chero.common.pojo.vo.ResultVO;
import com.chero.common.utils.ResultVOUtil;
import com.chero.server.user.domain.UserDO;
import com.chero.server.user.service.UserService;
import com.chero.server.user.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
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
	public Object getDate(Bean bean) {
		Map<String, Object> map = new HashMap<>();
		map.put("date", bean.getDate());
		return bean;
	}
}