package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.ProductDto;
import com.mumo.myshop.models.Category;
import com.mumo.myshop.models.Product;
import com.mumo.myshop.models.Seller;
import com.mumo.myshop.repository.CategoryRepository;

import com.mumo.myshop.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProductMapper implements AbstractMapper<Product, ProductDto> {

    private final CategoryRepository categoryRepository;
    private final SellerRepository sellerRepository;


    @Override
    public Product convertToEntity(ProductDto productDto) {
        Category category = categoryRepository.getOne(productDto.getCategoryId());
        Seller seller = sellerRepository.getOne(productDto.getSellerId());
        Product product = new Product();
        product.setCategory(category);
        product.setSeller(seller);
        product.setId(productDto.getId());
        product.setDescription(productDto.getDescription());
        product.setName(productDto.getName());
        return product;
    }

    @Override
    public ProductDto convertToDto(Product product) {
      
        ProductDto productDto = new ProductDto()
        .setId(product.getId())
        .setName(product.getName())
        .setDescription(product.getDescription());
        
        return productDto;
    }
}
