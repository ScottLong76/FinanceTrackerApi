package com.financetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financetrackerapi.model.Deposit;

@Repository
public interface DepositRepository extends JpaRepository<Deposit, Long> {

}