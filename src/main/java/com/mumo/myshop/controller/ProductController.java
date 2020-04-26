package com.mumo.myshop.controller;

import com.mumo.myshop.dto.ProductDto;
import com.mumo.myshop.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ProductDto create(@RequestBody ProductDto productDto) {
        return productService.create(productDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
    }


}
