package com.financetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financetrackerapi.model.Bank;
import com.financetrackerapi.service.BankService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("bank")
@RequiredArgsConstructor
public class BankController {

    final BankService bankService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Bank getBank(@PathVariable int id) {

        return bankService.getBank(id);
    }

    @PostMapping("/save")
    Bank newBank(@RequestBody Bank newBank) {
        return bankService.saveBank(newBank);
    }

}