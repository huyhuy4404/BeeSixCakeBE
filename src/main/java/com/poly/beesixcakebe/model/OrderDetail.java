package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idorderdetail;

    @ManyToOne
    @JoinColumn(name = "idcart")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "idorder")
    private Order order;
}
