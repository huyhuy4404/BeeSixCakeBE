package com.poly.beesixcakebe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poly.beesixcakebe.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Account findByIdaccountAndPassword(String idaccount, String password);
}
