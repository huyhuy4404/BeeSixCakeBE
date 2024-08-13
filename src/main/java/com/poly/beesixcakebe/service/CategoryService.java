package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Category;
import com.poly.beesixcakebe.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Integer idcategory) {
        return categoryRepository.findById(idcategory).orElse(null);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Integer idcategory, Category categoryDetails) {
        Category category = categoryRepository.findById(idcategory).orElse(null);
        if (category != null) {
            category.setNamecategory(categoryDetails.getNamecategory());
            return categoryRepository.save(category);
        }
        return null;
    }

    public void deleteCategory(Integer idcategory) {
        categoryRepository.deleteById(idcategory);
    }
}