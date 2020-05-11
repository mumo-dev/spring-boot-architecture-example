package com.mumo.myshop.services;


import com.mumo.myshop.dto.ProductDto;
import com.mumo.myshop.mappers.ProductMapper;
import com.mumo.myshop.models.Product;

import com.mumo.myshop.repository.ProductRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductDto create(ProductDto productDto) {
        Product product = productMapper.convertToEntity(productDto);
        return productMapper.convertToDto(productRepository.save(product));
    }

    public List<ProductDto> getAll() {
        return  productRepository.findAll()
                .stream()
                .map(productMapper::convertToDto)
                .collect(Collectors.toList());
    }

}