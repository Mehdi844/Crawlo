package com.example.crawlov2.Controller;


import com.example.crawlov2.Model.Users;
import com.example.crawlov2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/Save")
    public Users saveUser(@RequestBody Users users) {
        return userService.saveUsers(users);
    }

    @GetMapping
    public List<Users> getALlUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<Users> getUserById(@PathVariable int user_id) {
        return userService.getUserById(user_id);
    }

    @PutMapping("/Update")
    public Users updateUser(@PathVariable int user_id, @RequestBody Users users) {
        return userService.updateUser(user_id, users);
    }

    @DeleteMapping("/Delete")
    public void deleteUser(@PathVariable int user_id) {
        userService.deleteUser(user_id);
    }

    @GetMapping("/account/{account_id}")
    public ResponseEntity<List<Users>> getUsersByAccountId(@PathVariable int account_id) {
        List<Users> users = userService.getUsersByAccountId(account_id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

