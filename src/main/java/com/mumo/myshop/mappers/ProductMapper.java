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
        Category category = categoryRepository.getOne(productDto.categoryId());
        Seller seller = sellerRepository.getOne(productDto.sellerId());
        Product product = new Product();
        product.setCategory(category);
        product.setSeller(seller);
        product.setId(productDto.id());
        product.setDescription(productDto.description());
        product.setName(productDto.name());
        return product;
    }

    @Override
    public ProductDto convertToDto(Product product) {
      
        ProductDto productDto = new ProductDto()
        .id(product.getId())
        .name(product.getName())
        .description(product.getDescription());
        
        return productDto;
    }
}
