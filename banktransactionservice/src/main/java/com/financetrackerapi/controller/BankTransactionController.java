package com.financetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financetrackerapi.model.BankTransaction;
import com.financetrackerapi.service.BankTransactionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("bankTransaction")
@RequiredArgsConstructor
public class BankTransactionController {

    final BankTransactionService bankTransactionService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public BankTransaction getBankTransaction(@PathVariable int id) {

        return bankTransactionService.getBankTransaction(id);
    }

    @PostMapping("/save")
    BankTransaction newBankTransaction(@RequestBody BankTransaction newBankTransaction) {
        return bankTransactionService.saveBankTransaction(newBankTransaction);
    }

}