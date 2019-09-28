package com.leo.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leo.cloud.study.domain.User;
import com.leo.cloud.study.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		User findOne = userRepository.findOne(id);
		return findOne;
	}
	
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
		return serviceInstance;
	}
}
