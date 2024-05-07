package com.financetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financetrackerapi.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}