package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaddress;
    private String housenumber;
    private String city;
    private String ward;
    private String street;
    private String district;
    private String phonenumber;
    private String fullname;

    @ManyToOne
    @JoinColumn(name = "idaccount")
    private Account account;
}