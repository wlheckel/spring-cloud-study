package com.leo.cloud.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leo.cloud.study.user.entity.User;
import com.leo.cloud.study.user.service.RibbonHystrixService;

@RestController
public class RibbonHystrixController {

	@Autowired
	private RibbonHystrixService ribbonHystrixService ;
	
	@GetMapping("/ribbon/{id}")
	public User findById(@PathVariable Long id) {
		return ribbonHystrixService.findById(id);
	}
}
