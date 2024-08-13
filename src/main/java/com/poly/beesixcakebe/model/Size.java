package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Sizes")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsize;
    private String sizename;

    @ManyToOne
    @JoinColumn(name = "idproduct")
    private Product product;
}
