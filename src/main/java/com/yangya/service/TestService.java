package com.yangya.service;

import java.util.List;

import com.yangya.entity.Area;
import com.yangya.entity.User;

public interface TestService {
	
	public List<Area> test();
	
	public List<User> getUserMaster();
	
	public List<User> getUserSlave();

}
