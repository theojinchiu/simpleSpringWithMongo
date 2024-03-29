package com.springBootPractice.simpleSpring.controller;
import com.springBootPractice.simpleSpring.model.Account;
import com.springBootPractice.simpleSpring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/api/v1/accounts")
@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> GetAllAccounts() {
        return accountService.GetAllAccounts();
    }
}
