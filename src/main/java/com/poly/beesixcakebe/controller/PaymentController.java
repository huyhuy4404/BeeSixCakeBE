package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Payment;
import com.poly.beesixcakebe.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayment() {
        return paymentService.getAllPayment();
    }

    @GetMapping("/{idpayment}")
    public Payment getPaymentById(@PathVariable Integer idpayment) {
        return paymentService.getPaymentById(idpayment);
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @PutMapping("/{idpayment}")
    public Payment updatePayment(@PathVariable Integer idpayment, @RequestBody Payment paymentDetails) {
        return paymentService.updatePayment(idpayment, paymentDetails);
    }

    @DeleteMapping("/{idpayment}")
    public void deletePayment(@PathVariable Integer idpayment) {
        paymentService.deletePayment(idpayment);
    }
}

