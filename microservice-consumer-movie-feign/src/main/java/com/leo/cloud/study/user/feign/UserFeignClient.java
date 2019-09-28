package com.leo.cloud.study.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leo.cloud.study.user.entity.User;

@FeignClient(name="microservice-provider-user")
public interface UserFeignClient {

	@RequestMapping("/{id}")
	public User findFeignById(@RequestParam("id") Long id) ;
}
