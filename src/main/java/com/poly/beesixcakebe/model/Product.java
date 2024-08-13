package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproduct;
    private String nameproduct;
    private boolean hide;
    private String note;
    private String img;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;
}
