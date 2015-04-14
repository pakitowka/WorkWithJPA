package com.andrew.dataexam.service;

import com.andrew.dataexam.entity.Bank;

import java.util.List;

public interface BankService {
    Bank addBank(Bank bank);
    void delete(long id);
    Bank getByName(String name);
    Bank editBank (Bank bank);
    List<Bank> getAll();
}
