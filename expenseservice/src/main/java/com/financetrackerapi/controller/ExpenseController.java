package com.financetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financetrackerapi.model.Expense;
import com.financetrackerapi.service.ExpenseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("expense")
@RequiredArgsConstructor
public class ExpenseController {

    final ExpenseService expenseService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Expense getExpense(@PathVariable int id) {

        return expenseService.getExpense(id);
    }

    @PostMapping("/save")
    Expense newExpense(@RequestBody Expense newExpense) {
        return expenseService.saveExpense(newExpense);
    }

}