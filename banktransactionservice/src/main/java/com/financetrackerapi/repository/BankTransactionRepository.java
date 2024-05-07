package com.financetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financetrackerapi.model.BankTransaction;

@Repository
public interface BankTransactionRepository extends JpaRepository<BankTransaction, Integer> {

}