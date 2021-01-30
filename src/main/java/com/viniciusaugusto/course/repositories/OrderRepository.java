package com.viniciusaugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusaugusto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
