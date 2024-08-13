    package com.poly.beesixcakebe.model;


    import jakarta.persistence.*;
    import lombok.Data;
    import java.util.List;

    @Data
    @Entity
    @Table(name = "Categorys")
    public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idcategory;
        private String namecategory;
//        @OneToMany(mappedBy = "category")
//        private List<Product> products;
    }
