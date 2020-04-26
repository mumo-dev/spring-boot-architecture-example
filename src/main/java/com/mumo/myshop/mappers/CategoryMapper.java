package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.CategoryDto;
import com.mumo.myshop.models.Category;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CategoryMapper implements AbstractMapper<Category, CategoryDto> {

    private final ModelMapper modelMapper;

    @Override
    public Category convertToEntity(CategoryDto categoryDto) {
        return  modelMapper.map(categoryDto, Category.class);
    }

    @Override
    public CategoryDto convertToDto(Category category) {
        return modelMapper.map(category, CategoryDto.class);
    }
}
