package com.codegym.repository;

import com.codegym.model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

public interface IAccountRepo extends CrudRepository<Account, Long> {
//    @Query(nativeQuery = true, value = "select * from account where name =:username")
    Account findByUsername(String username);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "insert into account_roles values (:id,2)")
    void saveRole(@Param("id") long id);



    @Query(nativeQuery = true,value = "select role.name from role join account_roles on role.id = account_roles.roles_id join account on account_roles.account_id_account = account.id_account where account.username =:username")
    List<String> findRoleByUsername(@Param("username") String username);


    @Query(nativeQuery = true, value = "select account.id_account from account where account.username = :username ")
    Long findIdByUsername(@Param("username") String username);


}

