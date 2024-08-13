package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.OrderDetail;
import com.poly.beesixcakebe.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderdetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderdetailService;

    @GetMapping
    public List<OrderDetail> getAllOrderDetail() {
        return orderdetailService.getAllOrderDetail();
    }

    @GetMapping("/{idorderdetail}")
    public OrderDetail getOrderDetailById(@PathVariable Integer idorderdetail) {
        return orderdetailService.getOrderDetailById(idorderdetail);
    }

    @PostMapping
    public OrderDetail createOrderDetail(@RequestBody OrderDetail orderdetail) {
        return orderdetailService.createOrderDetail(orderdetail);
    }

    @PutMapping("/{idorderdetail}")
    public OrderDetail updateOrderDetail(@PathVariable Integer idorderdetail, @RequestBody OrderDetail orderdetailDetails) {
        return orderdetailService.updateOrderDetail(idorderdetail, orderdetailDetails);
    }

    @DeleteMapping("/{idorderdetail}")
    public void deleteorderDetail(@PathVariable Integer idorderdetail) {
        orderdetailService.deleteorderDetail(idorderdetail);
    }

    @GetMapping("/order/{idorder}")
    public List<OrderDetail> findByOrder_Idorder(@PathVariable Integer idorder) {
        return orderdetailService.findByOrder_Idorder(idorder);
    }
    @GetMapping("/cart/{idcart}")
    public List<OrderDetail> findByCart_Idcart(@PathVariable Integer idcart) {
        return orderdetailService.findByCart_Idcart(idcart);
    }
}
