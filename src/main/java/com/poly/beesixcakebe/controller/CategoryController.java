package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Category;
import com.poly.beesixcakebe.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/{idcategory}")
    public Category getCategoryById(@PathVariable Integer idcategory) {
        return categoryService.getCategoryById(idcategory);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/{idcategory}")
    public Category updateCategory(@PathVariable Integer idcategory, @RequestBody Category categoryDetails) {
        return categoryService.updateCategory(idcategory, categoryDetails);
    }

    @DeleteMapping("/{idcategory}")
    public void deleteCategory(@PathVariable Integer idcategory) {
        categoryService.deleteCategory(idcategory);
    }
}
