package com.codegym.service;

import com.codegym.model.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IAccountService extends UserDetailsService {
    List<Account> getAll();
    void save(Account account);
    void delete(Long id);

}

