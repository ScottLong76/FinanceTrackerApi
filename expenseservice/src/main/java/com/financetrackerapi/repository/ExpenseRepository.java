package com.financetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financetrackerapi.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}