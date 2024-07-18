package com.example.crawlov2.Controller;

import com.example.crawlov2.Model.Account;
import com.example.crawlov2.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Account")

public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/Create")
    public Account CreateAccount(@RequestBody Account account) {
        return accountService.CreateAccount(account);
    }
    @GetMapping
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable int account_id){
        return accountService.getAccountById(account_id);
    }

    @PutMapping("/Update")
    public Account updateAccount(@PathVariable int account_id, @RequestBody Account account){
        return accountService.updateAccount(account_id, account);
    }

    @DeleteMapping("/Delete")
    public void deleteAccount(@PathVariable int account_id){
        accountService.deleteAccount(account_id);
    }

    @GetMapping("/users/{user_id}")
    public ResponseEntity<List<Account>> getAccountsByUserId(@PathVariable int user_id) {
        List<Account> account = accountService.getAccountsByUserId(user_id);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
