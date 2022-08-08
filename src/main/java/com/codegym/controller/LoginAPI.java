package com.codegym.controller;


import com.codegym.model.Account;
import com.codegym.model.UserLogin;
import com.codegym.service.impl.AccountService;
import com.codegym.service.impl.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@Component
public class LoginAPI {
    @Autowired
    JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    AccountService accountService;


    @PostMapping("/login")
    public ResponseEntity<UserLogin> login(@RequestBody Account account){
        try {
            // Tạo ra 1 đối tượng Authentication.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(account.getUsername(), account.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);

            String token = jwtService.createToken(authentication);
            return new ResponseEntity<>(new UserLogin(accountService.findAccountByUserName(account.getUsername()).getIdAccount(),account.getUsername(),token,account.getRoles()),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
}
    @PostMapping("/register")
    public void register(@RequestBody Account account){
        accountService.save(account);
        accountService.setRoleByID(account.getIdAccount());
    }
    @GetMapping("/account")
    public List<Account> allAccount(){
        return accountService.getAll();
    }
}
