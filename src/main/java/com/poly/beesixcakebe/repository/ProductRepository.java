package com.poly.beesixcakebe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poly.beesixcakebe.model.Product;
import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory_Idcategory(Integer idcategory);
}
