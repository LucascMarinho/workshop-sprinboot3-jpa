package com.javaOnlineStore.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaOnlineStore.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
	
}
