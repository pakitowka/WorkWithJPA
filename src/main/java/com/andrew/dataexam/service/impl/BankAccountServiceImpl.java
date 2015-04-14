package com.andrew.dataexam.service.impl;

import com.andrew.dataexam.entity.BankAccount;
import com.andrew.dataexam.repository.BankAccountRepository;
import com.andrew.dataexam.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount addBank(BankAccount bankAccount) {
        BankAccount savedBankAccount = bankAccountRepository.saveAndFlush(bankAccount);
        return savedBankAccount;
    }

    @Override
    public void delete(long id) {
        bankAccountRepository.delete(id);
    }

    @Override
    public BankAccount getByName(String name) {
        return bankAccountRepository.findByName(name);
    }

    @Override
    public BankAccount editBank(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    @Override
    public List<BankAccount> getAll() {
        return bankAccountRepository.findAll();
    }
}
