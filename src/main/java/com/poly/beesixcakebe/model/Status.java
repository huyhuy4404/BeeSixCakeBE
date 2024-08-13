package com.poly.beesixcakebe.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Statuses")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idstatus;
    private String statusname;
}
