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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LoginAPI {
    @Autowired
    JwtService jwtService;

    @Autowired
    AccountService accountService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/login")
    public UserLogin login(@RequestBody Account account){

            // Tạo ra 1 đối tượng Authentication.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(account.getUsername(), account.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            Long idAccount = accountService.findIdByName(account.getUsername());
            String token = jwtService.createToken(authentication);
            String username = account.getUsername();
            String role = accountService.findRoleByUsername(account.getUsername()).get(0);
            return new UserLogin(idAccount,username,role, token);

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

