package com.example.crawlov2.Service;

import com.example.crawlov2.Model.Account;
import com.example.crawlov2.Repo.AccessRepo;
import com.example.crawlov2.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


    @Service
    public class AccountService implements AccountServiceInterface {

        @Autowired
        private AccountRepo accountRepo;

        @Autowired
        private AccessRepo accessRepo;


        @Override
        public Account CreateAccount(Account account) {
            return accountRepo.save(account);
        }


        @Override
        public Optional<Account> getAccountById(int account_id) {
            return accountRepo.findById(account_id);
        }


        @Override
        public List<Account> getAllAccounts() {
            return accountRepo.findAll();
        }

        @Override
        public Account updateAccount(int account_id, Account account) {

            Account accountToUpdate = accountRepo.findById(account_id).orElseThrow();
            accountToUpdate.setRegion(account.getRegion());
            accountToUpdate.setDefault_website(account.getDefault_website());
            accountToUpdate.setComponents(account.getComponents());
            accountToUpdate.setWebsites(account.getWebsites());
            return accountRepo.save(accountToUpdate);
        }

        @Override
        public void deleteAccount(int account_id) {
            accountRepo.deleteById(account_id);
        }

        public List<Account> getAccountsByUserId(int user_id) {
            return accessRepo.findAccountsByUserId(user_id);
        }
}
