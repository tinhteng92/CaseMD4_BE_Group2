package com.codegym.repository;

import com.codegym.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IAccountRepo extends PagingAndSortingRepository<Account, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM case_md4.account where username like concat('%',:name,'%');")
    List<Account> findAccountsByUsernameContaining(String name);
}
