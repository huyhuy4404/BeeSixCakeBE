package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Order;
import com.poly.beesixcakebe.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Integer idorder) {
        return orderRepository.findById(idorder).orElse(null);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Integer idorder, Order orderDetails) {
        Order order = orderRepository.findById(idorder).orElse(null);
        if (order != null) {
            order.setPurchasedate(orderDetails.getPurchasedate());
            order.setPayment(orderDetails.getPayment());
            order.setAddress(orderDetails.getAddress());
            return orderRepository.save(order);
        }
        return null;
    }

    public void deleteOrder(Integer idorder) {
        orderRepository.deleteById(idorder);
    }

    public List<Order> findByAccount_Idaccount(String idaccount) {
        return orderRepository.findByAccount_Idaccount(idaccount);
    }
    public List<Order> findByStatus_Idstatus(Integer status) {
        return orderRepository.findByStatus_Idstatus(status);
    }
    public List<Order> findByAddress_Idaddress(Integer idaddress) {
        return orderRepository.findByAddress_Idaddress(idaddress);
    }
    public List<Order> findByPayment_Idpayment(Integer idpayment) {
        return orderRepository.findByPayment_Idpayment(idpayment);
    }
}
