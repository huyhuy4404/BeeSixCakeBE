package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Payment;
import com.poly.beesixcakebe.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer idpayment) {
        return paymentRepository.findById(idpayment).orElse(null);
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment updatePayment(Integer idpayment, Payment paymentDetails) {
        Payment payment = paymentRepository.findById(idpayment).orElse(null);
        if (payment != null) {
            payment.setPaymentname(paymentDetails.getPaymentname());
            return paymentRepository.save(payment);
        }
        return null;
    }

    public void deletePayment(Integer idpayment) {
        paymentRepository.deleteById(idpayment);
    }
}
