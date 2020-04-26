package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.ProductDto;
import com.mumo.myshop.models.Category;
import com.mumo.myshop.models.Product;
import com.mumo.myshop.models.Seller;
import com.mumo.myshop.repository.CategoryRepository;
import com.mumo.myshop.repository.ProductRepository;
import com.mumo.myshop.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProductMapper implements AbstractMapper<Product, ProductDto> {

    private final ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;
    private final SellerRepository sellerRepository;


    @Override
    public Product convertToEntity(ProductDto productDto) {
        Category category = categoryRepository.getOne(productDto.getCategoryId());
        Seller seller = sellerRepository.getOne(productDto.getSellerId());
        Product product = modelMapper.map(productDto, Product.class);
        product.setCategory(category);
        product.setSeller(seller);
        return product;
    }

    @Override
    public ProductDto convertToDto(Product product) {
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;
    }
}
