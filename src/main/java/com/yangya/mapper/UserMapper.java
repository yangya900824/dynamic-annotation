package com.yangya.mapper;

import java.util.List;

import com.yangya.entity.User;

public interface UserMapper {
	
	List<User> selectAll();

    User selectByPrimaryKey(int id);

}