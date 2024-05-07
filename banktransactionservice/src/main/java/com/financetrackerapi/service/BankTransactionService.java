package com.financetrackerapi.service;

import org.springframework.stereotype.Service;

import com.financetrackerapi.model.BankTransaction;
import com.financetrackerapi.repository.BankTransactionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BankTransactionService {

    final BankTransactionRepository bankTransactionRepository;

    public BankTransaction getBankTransaction(int id) {
        return bankTransactionRepository.findById(id).get();
    }

    public BankTransaction saveBankTransaction(BankTransaction bankTransaction) {
        bankTransactionRepository.save(bankTransaction);
        return bankTransaction;
    }

}