package com.poly.beesixcakebe.repository;

import com.poly.beesixcakebe.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByAccount_Idaccount(String idaccount);
    List<Order> findByStatus_Idstatus(Integer status);
    List<Order> findByAddress_Idaddress(Integer idaddress);
    List<Order> findByPayment_Idpayment(Integer idpayment);
}
