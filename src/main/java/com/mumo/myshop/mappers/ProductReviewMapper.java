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
        productReview.setId(productReviewDto.getId());
        productReview.setReview(productReviewDto.getReview());
        Product product = productRepository.getOne(productReviewDto.getProductId());
        productReview.setProduct(product);
        return productReview;
    }

    @Override
    public ProductReviewDto convertToDto(ProductReview productReview) {
       
        ProductReviewDto productReviewDto = new ProductReviewDto()
            .setId(productReview.getId())
            .setReview(productReview.getReview());
            
        return productReviewDto;
    }

}