package com.javaOnlineStore.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaOnlineStore.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	
}
