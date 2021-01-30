package com.viniciusaugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusaugusto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
