package com.poly.beesixcakebe.repository;
import com.poly.beesixcakebe.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    List<OrderDetail> findByOrder_Idorder(Integer idorder);
    List<OrderDetail> findByCart_Idcart(Integer idcart);
}
