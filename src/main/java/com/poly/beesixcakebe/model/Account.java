package com.poly.beesixcakebe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    private String idaccount;
    private String password;
    private String fullname;
    private String email;
    private String phonenumber;
    private boolean admin;
    private boolean active;
}
