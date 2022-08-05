package com.codegym.repository;

import com.codegym.model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface IAccountRepo extends CrudRepository<Account, Long> {
    @Query(nativeQuery = true, value = "select * from account where name =:username")
    Account findByUsername(String username);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "insert into account_roles value (:id,2)")

    void saveRole(@Param("id") long id);
}
