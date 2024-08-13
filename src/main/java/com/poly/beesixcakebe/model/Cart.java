package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcart;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "idpricetosize")
    private PriceToSize pricetosize;

    @ManyToOne
    @JoinColumn(name = "idaccount")
    private Account account;
}
