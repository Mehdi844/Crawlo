package com.example.crawlov2.Service;

import com.example.crawlov2.Model.Admin;
import com.example.crawlov2.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepo.findByUsername(username);
        if (admin == null) {
            throw new UsernameNotFoundException("Admin not found");
        }
        return new org.springframework.security.core.userdetails.User(admin.getUsername(), admin.getPassword(), new ArrayList<>());
    }
}

