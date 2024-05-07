package com.financetrackerapi.service;

import org.springframework.stereotype.Service;

import com.financetrackerapi.model.Bank;
import com.financetrackerapi.repository.BankRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BankService {

    final BankRepository bankRepository;

    public Bank getBank(int id) {
        return bankRepository.findById((Long.valueOf(id))).get();
    }

    public Bank saveBank(Bank bank) {
        bankRepository.save(bank);
        return bank;
    }

}