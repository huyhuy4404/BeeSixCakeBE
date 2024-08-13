package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Product;
import com.poly.beesixcakebe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer idproduct) {
        return productRepository.findById(idproduct).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Integer idproduct, Product productDetails) {
        Product product = productRepository.findById(idproduct).orElse(null);
        if (product != null) {
            product.setNameproduct(productDetails.getNameproduct());
            product.setHide(productDetails.isHide());
            product.setNote(productDetails.getNote());
            product.setImg(productDetails.getImg());
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(Integer idproduct) {
        productRepository.deleteById(idproduct);
    }
    public List<Product> getProductsByCategoryId(Integer idcategory) {
        return productRepository.findByCategory_Idcategory(idcategory);
    }
}