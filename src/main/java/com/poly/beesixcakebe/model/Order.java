package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idorder;
    private LocalDateTime purchasedate;


    @ManyToOne
    @JoinColumn(name = "status")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "idaccount")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "idaddress")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "idpayment")
    private Payment payment;
}
