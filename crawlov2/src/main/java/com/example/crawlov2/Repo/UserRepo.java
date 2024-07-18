package com.example.crawlov2.Repo;

import com.example.crawlov2.Model.Admin;

import com.example.crawlov2.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
}
