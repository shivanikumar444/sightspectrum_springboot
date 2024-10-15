package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public Account createAccount(Account account) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }
}
