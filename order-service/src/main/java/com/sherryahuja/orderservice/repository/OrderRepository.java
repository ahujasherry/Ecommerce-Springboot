package com.sherryahuja.orderservice.repository;

import com.sherryahuja.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
