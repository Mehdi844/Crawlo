package com.example.crawlov2.Service;

import com.example.crawlov2.Model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountServiceInterface {
    Account CreateAccount(Account account);
    public Optional<Account> getAccountById(int account_id);
    List<Account> getAllAccounts();
    Account updateAccount(int account_id, Account account );
    void deleteAccount(int account_id);
}
