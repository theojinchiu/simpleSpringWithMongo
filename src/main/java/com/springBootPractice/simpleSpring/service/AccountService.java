package com.springBootPractice.simpleSpring.service;

import com.springBootPractice.simpleSpring.model.Account;
import com.springBootPractice.simpleSpring.repository.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    public AccountDao accountDao;

    @Autowired
    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> GetAllAccounts() {
        return accountDao.findAll();
    }
}
