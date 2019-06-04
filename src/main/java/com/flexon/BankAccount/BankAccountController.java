package com.flexon.BankAccount;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class BankAccountController {
    List<BankAccount> accounts=new ArrayList<>();

    @GetMapping(value="/getAccount")
    public BankAccount getAccountInfo(@RequestParam String id){

        for(BankAccount item: accounts){
            if(item.getAccountNumber().equals(id)){
                return item;
            }
        }
        return null;
    }

    @PostMapping(value="/addAccount")
    public String addAccount(@RequestBody BankAccount account){
        accounts.add(account);
        return "New user id:"+account.getAccountNumber();
    }
}
