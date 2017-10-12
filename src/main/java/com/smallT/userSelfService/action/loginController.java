package com.smallT.userSelfService.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smallT.userSelfService.entity.User;
import com.smallT.utils.Msg;

/**
 * mactest,登录
 * 合并测试
 * @author superk
 *k-1分支测试与合并
 */
@Controller
@RequestMapping("/userLogin")
public class loginController {
	
	@ResponseBody
	@RequestMapping("/lgn")
	public Msg Login(User user){
		String pwd = user.getPassword();
		Msg msg = new Msg();
		msg.setSuss(true);
		msg.setMessage("ok");
		return msg;
	}
}
