package com.tiwarir.gitupload.service.impl;

import com.tiwarir.gitupload.entity.Category;
import com.tiwarir.gitupload.repository.CategoryRepository;
import com.tiwarir.gitupload.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

@Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
      return categoryRepository.save(category);

    }

    @Override
    public List<Category> getAllCategory() {
       List<Category>getAll= categoryRepository.findAll();
       return getAll;

    }
}
