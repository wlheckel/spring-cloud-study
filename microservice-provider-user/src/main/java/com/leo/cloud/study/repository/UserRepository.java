package com.leo.cloud.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.cloud.study.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
