package com.example.crawlov2.Service;


import com.example.crawlov2.Model.Admin;
import com.example.crawlov2.Model.Users;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    public Users saveUsers(Users users);
    public Optional<Users> getUserById(int user_id);
    List<Users> getAllUsers();
    Users updateUser(int user_id, Users users);
    void deleteUser(int user_id);
}
