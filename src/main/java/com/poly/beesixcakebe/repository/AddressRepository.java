package com.poly.beesixcakebe.repository;

import com.poly.beesixcakebe.model.Account;
import com.poly.beesixcakebe.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    List<Address> findByAccount_Idaccount(String idaccount);
}