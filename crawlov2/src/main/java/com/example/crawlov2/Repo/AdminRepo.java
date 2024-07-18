package com.example.crawlov2.Repo;

import com.example.crawlov2.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}

