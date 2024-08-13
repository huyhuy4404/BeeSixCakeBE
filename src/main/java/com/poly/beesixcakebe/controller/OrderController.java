package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Order;
import com.poly.beesixcakebe.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }

    @GetMapping("/{idorder}")
    public Order getOrderById(@PathVariable Integer idorder) {
        return orderService.getOrderById(idorder);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{idorder}")
    public Order updateOrder(@PathVariable Integer idorder, @RequestBody Order orderDetails) {
        return orderService.updateOrder(idorder, orderDetails);
    }

    @DeleteMapping("/{idorder}")
    public void deleteOrder(@PathVariable Integer idorder) {
        orderService.deleteOrder(idorder);
    }

    @GetMapping("/account/{idaccount}")
    public List<Order> findByAccount_Idaccount(@PathVariable String idaccount) {
        return orderService.findByAccount_Idaccount(idaccount);
    }
    @GetMapping("/status/{status}")
    public List<Order> findByStatus_Idstatus(@PathVariable Integer status) {
        return orderService.findByStatus_Idstatus(status);
    }
    @GetMapping("/address/{idaddress}")
    public List<Order> findByAddress_Idaddress(@PathVariable Integer idaddress) {
        return orderService.findByAddress_Idaddress(idaddress);
    }
    @GetMapping("/payment/{idpayment}")
    public List<Order> findByPayment_Idpayment(@PathVariable Integer idpayment) {
        return orderService.findByPayment_Idpayment(idpayment);
    }
}

