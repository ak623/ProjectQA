package com.qa.backend.controller;


import com.qa.backend.model.Account;
import com.qa.backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {

    Logger logger = Logger.getLogger(AccountController.class.getName());

    @Autowired
    private AccountRepository accountRepository;

    // NOTE TO SELF ERROR ON THE ACTUAL CREATE METHOD ITSELF HMMM??
//java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'accountController' method

    //Create
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Account account){
        accountRepository.save(account);
    }

    //Read
    @RequestMapping(value = "/accountId/{id}")
    public Account read(@PathVariable String id){
        Optional<Account> optAccount = accountRepository.findById(id);
        if (optAccount.isPresent()) {
            return optAccount.get();
        } return null;
    }

    //Read
    @RequestMapping(value = "/allAccounts")
    public Iterable<Account> readAllAccount(){
        return  accountRepository.findAll();
    }


    //Update
    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Account account){
        accountRepository.save(account);
    }

    //Delete
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        accountRepository.deleteById(id);
    }

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello() {
        return "Hello from backend";
    }
}