package com.example.crawlov2.Repo;

import com.example.crawlov2.Model.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
}
