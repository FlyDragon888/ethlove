package com.smallT.userSelfService.dao;

import org.springframework.stereotype.Repository;

import com.smallT.userSelfService.entity.User;

@Repository
public interface RegisterDao{
	public void register(User user);
}
