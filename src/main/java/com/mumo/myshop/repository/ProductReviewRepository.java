package com.mumo.myshop.repository;

import java.util.List;

import com.mumo.myshop.models.ProductReview;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReview, Long>{

    List<ProductReview> findByProductId(Long productId);

}