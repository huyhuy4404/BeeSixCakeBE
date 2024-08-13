package com.poly.beesixcakebe.repository;

import com.poly.beesixcakebe.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findByPricetosize_Idpricetosize(Integer idpricetosize);
    List<Cart> findByAccount_Idaccount(String idaccount);
}
