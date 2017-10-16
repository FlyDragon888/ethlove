package com.smallT.userSelfService.action;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smallT.userSelfService.entity.User;
import com.smallT.userSelfService.service.RegisterService;
import com.smallT.utils.Msg;
import com.smallT.utils.ipUtil;

/**
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
	public Msg register(User user,HttpServletRequest request){
		user.setRegisterDate(new Date());
		user.setActivte(false);
		user.setVipLevel(0);
		user.setLastLoginDate(new Date());
		user.setLastLoginIp(ipUtil.getIp2(request));
		registerServiceImp.Register(user);
		return new Msg(true,"success");
	}
}
