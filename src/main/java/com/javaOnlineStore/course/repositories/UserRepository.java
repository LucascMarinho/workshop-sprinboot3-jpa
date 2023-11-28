package com.javaOnlineStore.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaOnlineStore.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
}
