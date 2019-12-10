package com.springBootPractice.simpleSpring.repository;

import com.springBootPractice.simpleSpring.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("mockAccountRepo")
public class AccountRepository {

    public List<Account> GetAllAccounts() {
        Account account = new Account("test", "123456");

        return new ArrayList<Account>() {
            {
                add(account);
            }
        };
    }
}
