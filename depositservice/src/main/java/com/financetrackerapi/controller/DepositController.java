package com.financetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financetrackerapi.model.Deposit;
import com.financetrackerapi.service.DepositService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("deposit")
@RequiredArgsConstructor
public class DepositController {

    final DepositService depositService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Deposit getDeposit(@PathVariable int id) {

        return depositService.getDeposit(id);
    }

    @PostMapping("/save")
    Deposit newDeposit(@RequestBody Deposit newDeposit) {
        return depositService.saveDeposit(newDeposit);
    }

}