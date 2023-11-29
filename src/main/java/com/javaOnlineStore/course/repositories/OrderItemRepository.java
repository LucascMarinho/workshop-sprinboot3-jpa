package com.javaOnlineStore.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaOnlineStore.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{
	
}
