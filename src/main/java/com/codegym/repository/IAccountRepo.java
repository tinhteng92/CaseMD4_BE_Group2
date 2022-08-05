package com.codegym.repository;

import com.codegym.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface IAccountRepo extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
