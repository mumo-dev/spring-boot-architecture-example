package com.mumo.myshop.controller;

import com.mumo.myshop.dto.CategoryDto;
import com.mumo.myshop.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public CategoryDto create(@RequestBody CategoryDto categoryDto) {
        return categoryService.create(categoryDto);
    }

    @GetMapping
    public List<CategoryDto> getAll() {
        return categoryService.getAll();
    }
}
