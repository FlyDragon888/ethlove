package com.smallT.userSelfService.service.serviceImp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.smallT.userSelfService.dao.RegisterDao;
import com.smallT.userSelfService.entity.User;
import com.smallT.userSelfService.service.RegisterService;

@Service("registerService")
public class RegisterServiceImp implements RegisterService {

	@Resource
	private RegisterDao registerDao;
	@Override
	public void Register(User user) {
		registerDao.register(user);
	}
	
}
