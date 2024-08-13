package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Payments")

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpayment;
    private String paymentname;
}
