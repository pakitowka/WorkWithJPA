package com.andrew.dataexam.test.util;

import com.andrew.dataexam.entity.Bank;


public class BankUtil {
    public static Bank createBank(){
        Bank bank = new Bank();
        bank.setName("Gold Bank");

        return bank;
    }
}
