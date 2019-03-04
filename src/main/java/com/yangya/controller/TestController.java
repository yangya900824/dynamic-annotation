package com.yangya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yangya.entity.Area;
import com.yangya.service.impl.TestServiceImpl;

@RestController
public class TestController {
	
	@Autowired
	private TestServiceImpl testServiceImpl;

	@GetMapping("/test")
	public List<Area> test(){
		return testServiceImpl.test();
	}
}
