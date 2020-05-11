package com.mumo.myshop.mappers;

import com.mumo.myshop.dto.CategoryDto;
import com.mumo.myshop.models.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CategoryMapper implements AbstractMapper<Category, CategoryDto> {

  @Override
  public Category convertToEntity(CategoryDto categoryDto) {
    // return modelMapper.map(categoryDto, Category.class);
    Category category = new Category();
    category.setId(categoryDto.id());
    category.setName(categoryDto.name());
    return category;
  }

  @Override
  public CategoryDto convertToDto(Category category) {
    // return modelMapper.map(category, CategoryDto.class);
    CategoryDto categoryDto = new CategoryDto().id(category.getId()).name(category.getName());
    return categoryDto;
  }
}
