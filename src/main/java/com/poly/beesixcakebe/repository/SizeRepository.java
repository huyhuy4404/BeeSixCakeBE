package com.poly.beesixcakebe.repository;

import com.poly.beesixcakebe.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {
    List<Size> findByProduct_Idproduct(Integer idproduct);
}
