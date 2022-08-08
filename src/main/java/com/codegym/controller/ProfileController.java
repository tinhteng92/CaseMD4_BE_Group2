package com.codegym.controller;


import com.codegym.model.Account;
import com.codegym.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    IAccountService accountService;
    @GetMapping("/{username}")
    public Account findByUsername(@PathVariable String username){
        return accountService.findByUsername(username);
    }
       @PostMapping("/edit")
    public Account edit(@RequestBody Account account){
        return accountService.save(account);
    }
}
