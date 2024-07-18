package com.example.crawlov2.Service;

import com.example.crawlov2.Model.Users;
import com.example.crawlov2.Repo.AccessRepo;
import com.example.crawlov2.Repo.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccessRepo accessRepo;


    @Override
    public Users saveUsers(Users users) {
        return userRepo.save(users);
    }

    @Override
    public Optional<Users> getUserById(int user_id) {
        return userRepo.findById(user_id);
    }

    @Override
    public List<Users> getAllUsers() {

        return userRepo.findAll();
    }

    @Override
    public Users updateUser(int user_id, Users users) {

        Users userToUpdate = userRepo.findById(user_id).orElseThrow();
        userToUpdate.setFirstName(users.getFirstName());
        userToUpdate.setLastName(users.getLastName());
        userToUpdate.setEmail(users.getEmail());
        userToUpdate.setPassword(users.getPassword());
        userToUpdate.setAccount(users.getAccount());
        return userRepo.save(userToUpdate);
    }

    @Override
    public void deleteUser(int user_id) {
        userRepo.deleteById(user_id);
    }

    public List<Users> getUsersByAccountId(int account_id) {

        return accessRepo.findUsersByAccountId(account_id);
    }

}
