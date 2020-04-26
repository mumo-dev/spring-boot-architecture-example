package com.mumo.myshop.repository;

import com.mumo.myshop.models.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}