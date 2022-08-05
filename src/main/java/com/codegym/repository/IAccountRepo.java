package com.codegym.repository;

import com.codegym.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IAccountRepo extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
