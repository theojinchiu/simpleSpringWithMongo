package com.springBootPractice.simpleSpring.repository;
import com.springBootPractice.simpleSpring.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountDao extends MongoRepository<Account, String> {
}
