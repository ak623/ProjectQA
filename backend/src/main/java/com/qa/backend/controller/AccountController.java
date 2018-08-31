package com.qa.backend.controller;


import com.qa.backend.model.Account;
import com.qa.backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    // NOTE TO SELF ERROR ON THE ACTUAL CREATE METHOD ITSELF HMMM??
//java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'accountController' method

    //Create
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Account account){
        accountRepository.save(account);
    }

    //Read
    @RequestMapping(value = "/accountId/{id}")
    public Account read(@PathVariable Integer id){
        Optional<Account> optAccount = accountRepository.findById(id);
        if (optAccount.isPresent()) {
            return optAccount.get();
        } return null;
    }

    //Update
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Account account){
        accountRepository.save(account);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        accountRepository.deleteById(id);
    }

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        return "Hello from backend";
    }
}