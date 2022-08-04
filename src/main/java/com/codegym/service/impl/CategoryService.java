package com.codegym.service.impl;

import com.codegym.model.Category;
import com.codegym.repository.ICategoryRepo;
import com.codegym.repository.IColorRepo;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepo iCategoryRepo;


    @Override
    public List<Category> getAll() {
        return (List<Category>) iCategoryRepo.findAll();
    }

    @Override
    public Category save(Category category) {
        return iCategoryRepo.save(category);
    }
}
