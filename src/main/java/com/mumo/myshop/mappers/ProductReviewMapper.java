package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.ProductReviewDto;
import com.mumo.myshop.models.Product;
import com.mumo.myshop.models.ProductReview;
import com.mumo.myshop.repository.ProductRepository;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class ProductReviewMapper implements AbstractMapper<ProductReview, ProductReviewDto> {

    private final ProductRepository productRepository;

    @Override
    public ProductReview convertToEntity(ProductReviewDto productReviewDto) {
        ProductReview productReview = new ProductReview();
        productReview.setId(productReviewDto.id());
        productReview.setReview(productReviewDto.review());
        Product product = productRepository.getOne(productReviewDto.productId());
        productReview.setProduct(product);
        return productReview;
    }

    @Override
    public ProductReviewDto convertToDto(ProductReview productReview) {
       
        ProductReviewDto productReviewDto = new ProductReviewDto()
            .id(productReview.getId())
            .review(productReview.getReview());
            
        return productReviewDto;
    }

}