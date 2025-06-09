package com.tiwarir.gitupload.service;

import com.tiwarir.gitupload.entity.Category;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);
    public List<Category> getAllCategory();

}
