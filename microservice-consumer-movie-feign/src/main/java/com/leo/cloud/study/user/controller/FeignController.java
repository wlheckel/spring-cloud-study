package com.leo.cloud.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leo.cloud.study.user.entity.User;
import com.leo.cloud.study.user.feign.UserFeignClient;

@RestController
public class FeignController {

	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/feign/{id}")
	public User findFeignById(@PathVariable Long id) {
		return this.userFeignClient.findFeignById(id);
	}
}
