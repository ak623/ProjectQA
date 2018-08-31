package com.qa.backend.repository;


import com.qa.backend.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

    public Account findAccountByFirstName(String firstName);


}