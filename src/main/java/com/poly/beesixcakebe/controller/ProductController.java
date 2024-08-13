package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Product;
import com.poly.beesixcakebe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{idproduct}")
    public Product getProductById(@PathVariable Integer idproduct) {
        return productService.getProductById(idproduct);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{idproduct}")
    public Product updateProduct(@PathVariable Integer idproduct, @RequestBody Product productDetails) {
        return productService.updateProduct(idproduct, productDetails);
    }

    @DeleteMapping("/{idproduct}")
    public void deleteProduct(@PathVariable Integer idproduct) {
        productService.deleteProduct(idproduct);
    }
    @GetMapping("/category/{idcategory}")
    public List<Product> getProductsByCategoryId(@PathVariable Integer idcategory) {
        return productService.getProductsByCategoryId(idcategory);
    }
}

