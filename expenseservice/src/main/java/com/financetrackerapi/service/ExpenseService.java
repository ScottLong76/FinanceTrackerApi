package com.financetrackerapi.service;

import org.springframework.stereotype.Service;

import com.financetrackerapi.model.Expense;
import com.financetrackerapi.repository.ExpenseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    final ExpenseRepository expenseRepository;

    public Expense getExpense(int id) {
        return expenseRepository.findById((Long.valueOf(id))).get();
    }

    public Expense saveExpense(Expense expense) {
        expenseRepository.save(expense);
        return expense;
    }

}