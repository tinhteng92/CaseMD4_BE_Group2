package com.codegym.controller;




import com.codegym.model.Account;
import com.codegym.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class UserAPI {
    @Autowired
    AccountService accountService;

    @GetMapping("/showUser")
    public List<Account> getRegister() {
        return accountService.getAll();
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        accountService.delete(id);
    }
}
