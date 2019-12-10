package com.springBootPractice.simpleSpring.config;

import com.springBootPractice.simpleSpring.model.Account;
import com.springBootPractice.simpleSpring.repository.AccountDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private AccountDao accountDao;

    public DbSeeder(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Account a1 = new Account("the223o", "123456");
        Account a2 = new Account("chew2323y", "232553");

        accountDao.deleteAll();
        List<Account> accountsToAdd = new ArrayList<Account>(){
            {
                add(a1);
                add(a2);
            }
        };
        accountDao.saveAll(accountsToAdd);
    }
}
