package com.smallT.userSelfService.action;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smallT.userSelfService.entity.User;
import com.smallT.userSelfService.service.RegisterService;
import com.smallT.utils.Msg;

/**
 * 测试分支与master合并
 * master更改第二次测试
 * @author superk
 *
 */

@Controller
@RequestMapping("/userSelfService")
public class RegisterController {
	
	@Resource
	private RegisterService  registerServiceImp;  
	
	@ResponseBody
	@RequestMapping("/register")
	public Msg register(User user){
		user.setRegisterDate(new Date());
		registerServiceImp.Register(user);
		return new Msg(true,"success");
	}
}
