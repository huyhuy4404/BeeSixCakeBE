package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Order;
import com.poly.beesixcakebe.model.OrderDetail;
import com.poly.beesixcakebe.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public List<OrderDetail> getAllOrderDetail() {
        return orderDetailRepository.findAll();
    }

    public OrderDetail getOrderDetailById(Integer idorderdetail) {
        return orderDetailRepository.findById(idorderdetail).orElse(null);
    }

    public OrderDetail createOrderDetail(OrderDetail orderdetail) {
        return orderDetailRepository.save(orderdetail);
    }

    public OrderDetail updateOrderDetail(Integer idorderdetail, OrderDetail orderdetailDetails) {
        OrderDetail orderdetail = orderDetailRepository.findById(idorderdetail).orElse(null);
        if (orderdetail != null) {
            orderdetail.setCart(orderdetailDetails.getCart());
            orderdetail.setOrder(orderdetailDetails.getOrder());
            return orderDetailRepository.save(orderdetail);
        }
        return null;
    }

    public void deleteorderDetail(Integer idorderdetail) {
        orderDetailRepository.deleteById(idorderdetail);
    }
    public List<OrderDetail> findByOrder_Idorder(Integer idorder) {
        return orderDetailRepository.findByOrder_Idorder(idorder);
    }
    public List<OrderDetail> findByCart_Idcart(Integer idcart) {
        return orderDetailRepository.findByCart_Idcart(idcart);
    }
}