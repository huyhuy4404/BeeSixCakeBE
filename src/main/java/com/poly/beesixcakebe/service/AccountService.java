package com.poly.beesixcakebe.service;

import com.poly.beesixcakebe.model.Account;
import com.poly.beesixcakebe.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    public Account getAccountById(String idaccount) {
        return accountRepository.findById(idaccount).orElse(null);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(String idaccount, Account accountDetails) {
        Account account = accountRepository.findById(idaccount).orElse(null);
        if (account != null) {
            account.setIdaccount(accountDetails.getIdaccount());
            account.setPassword(accountDetails.getPassword());
            account.setFullname(accountDetails.getFullname());
            account.setEmail(accountDetails.getEmail());
            account.setPhonenumber(accountDetails.getPhonenumber());
            account.setAdmin(accountDetails.isAdmin());
            account.setActive(accountDetails.isActive());
            return accountRepository.save(account);
        }
        return null;
    }

    public void deleteAccount(String idaccount) {
        accountRepository.deleteById(idaccount);
    }
    public Account findByIdaccountAndPassword(String idaccount, String password) {
        return accountRepository.findByIdaccountAndPassword(idaccount, password);
    }
}
