package com.codegym.controller;

import com.codegym.model.Account;
import com.codegym.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class RegisterController {

    @Autowired
    AccountService accountService;

    @GetMapping("/register")
    public String getRegister() {
        return "Register";
    }

    @PostMapping("/register")
    public Account register(@RequestBody Account account) {
//        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));

        accountService.save(account);
        accountService.setRole(account.getIdAccount());
        return account;
    }
}
