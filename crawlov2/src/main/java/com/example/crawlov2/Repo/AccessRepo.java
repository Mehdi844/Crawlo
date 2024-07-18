package com.example.crawlov2.Repo;

import com.example.crawlov2.Model.Access;
import com.example.crawlov2.Model.Account;

import com.example.crawlov2.Model.Users;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
@EntityScan

public interface AccessRepo extends JpaRepository<Access, Integer> {
    //@Query("SELECT a.user FROM Access a WHERE a.account.id = :account_id")
    List<Users> findUsersByAccountId(@Param("account_id") int account_id);
    //@Query("SELECT a.account FROM Access a WHERE a.user.id = :user_id")
    List<Account> findAccountsByUserId(@Param("user_id") int user_id);
    //@Query("SELECT a FROM Access a JOIN FETCH a.user JOIN FETCH a.account WHERE a.id = :accessId")
    Optional<Access> findAccessDetailsById(@Param("access_id") int access_id);

}
