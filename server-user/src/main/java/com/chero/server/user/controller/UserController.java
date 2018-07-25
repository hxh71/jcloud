package com.chero.server.user.controller;
import com.chero.common.pojo.vo.ResultVO;
import com.chero.common.utils.ResultVOUtil;
import com.chero.server.user.domain.UserDO;
import com.chero.server.user.service.UserService;
import com.chero.server.user.util.Result;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService user_modelService;
	@PostMapping
	public ResultVO add(UserDO user_DO_model){
		try{
			return ResultVOUtil.success(user_modelService.add(user_DO_model));
		}catch(Exception e){
			e.printStackTrace();
			return ResultVOUtil.error(1000, e.toString());
		}
	}
	@RequestMapping("/delete")
	public Result delete(String id){
		try{
			user_modelService.delete(id);
			return Result.success();
		}catch(Exception e){
			e.printStackTrace();
			return Result.failure(e.toString());
		}
	}

	@GetMapping("mobile/{mobile}")
	public ResultVO getByUsername(@PathVariable String mobile) throws Exception {
			UserDO user_DO_model = user_modelService.getByUsername(mobile);
			return ResultVOUtil.success(user_DO_model);
	}
}