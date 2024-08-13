package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PriceToSizes")
public class PriceToSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpricetosize;
    private Float price;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "idsize")
    private Size size;
}