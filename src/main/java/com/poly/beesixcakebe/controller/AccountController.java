package com.poly.beesixcakebe.controller;

import com.poly.beesixcakebe.model.Account;
import com.poly.beesixcakebe.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/home")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }

    @GetMapping("/{idaccount}")
    public Account getAccountById(@PathVariable String idaccount) {
        return accountService.getAccountById(idaccount);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PutMapping("/{idaccount}")
    public Account updateAccount(@PathVariable String idaccount, @RequestBody Account accountDetails) {
        return accountService.updateAccount(idaccount, accountDetails);
    }

    @DeleteMapping("/{idaccount}")
    public void deleteAccount(@PathVariable String idaccount) {
        accountService.deleteAccount(idaccount);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Account loginRequest) {
        Account account = accountService.findByIdaccountAndPassword(loginRequest.getIdaccount(), loginRequest.getPassword());
        if (account != null) {
            // Đăng nhập thành công
            return ResponseEntity.ok(account);
        } else {
            // Đăng nhập thất bại
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Tên người dùng hoặc mật khẩu không chính xác.");
        }
    }
}