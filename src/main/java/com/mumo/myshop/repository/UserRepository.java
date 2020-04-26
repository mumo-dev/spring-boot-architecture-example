package com.mumo.myshop.repository;

import com.mumo.myshop.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}