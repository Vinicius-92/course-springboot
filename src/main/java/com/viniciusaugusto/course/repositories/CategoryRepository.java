package com.viniciusaugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusaugusto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
