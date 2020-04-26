package com.mumo.myshop.services;

import com.mumo.myshop.dto.CategoryDto;
import com.mumo.myshop.mappers.CategoryMapper;
import com.mumo.myshop.models.Category;
import com.mumo.myshop.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryDto create(CategoryDto categoryDto) {
       Category category= categoryMapper.convertToEntity(categoryDto);
       return categoryMapper.convertToDto(categoryRepository.save(category));
    }

    public List<CategoryDto> getAll() {
        return  categoryRepository.findAll()
                .stream()
                .map(categoryMapper::convertToDto)
                .collect(Collectors.toList());
    }

}