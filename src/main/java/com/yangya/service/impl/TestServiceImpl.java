package com.yangya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangya.config.DataSourceType;
import com.yangya.config.MyDataSource;
import com.yangya.entity.Area;
import com.yangya.mapper.AreaMapper;
import com.yangya.service.TestService;
@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private AreaMapper areaMapper;

	@Override
	@MyDataSource(DataSourceType.Master)
	public List<Area> test() {
		return areaMapper.selectByPid(null);
	}
	

}
