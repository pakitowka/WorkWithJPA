package com.andrew.dataexam.service;

import com.andrew.dataexam.entity.BankAccount;

import java.util.List;

/**
 * Created by Andrew on 4/14/2015.
 */
public interface BankAccountService {
    BankAccount addBank(BankAccount bankAccount);
    void delete(long id);
    BankAccount getByName(String name);
    BankAccount editBank (BankAccount bankAccount);
    List<BankAccount> getAll();
}

