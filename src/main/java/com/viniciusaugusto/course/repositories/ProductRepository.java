package com.viniciusaugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusaugusto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
