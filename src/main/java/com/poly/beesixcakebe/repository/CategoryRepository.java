package com.poly.beesixcakebe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poly.beesixcakebe.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
