package com.poly.beesixcakebe.repository;

import com.poly.beesixcakebe.model.PriceToSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PriceToSizeRepository extends JpaRepository<PriceToSize, Integer> {
    List<PriceToSize> findBySize_Idsize(Integer idsize);

}
