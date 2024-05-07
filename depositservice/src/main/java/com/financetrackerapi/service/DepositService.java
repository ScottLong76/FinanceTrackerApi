package com.financetrackerapi.service;

import org.springframework.stereotype.Service;

import com.financetrackerapi.model.Deposit;
import com.financetrackerapi.repository.DepositRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepositService {

    final DepositRepository depositRepository;

    public Deposit getDeposit(int id) {
        return depositRepository.findById((Long.valueOf(id))).get();
    }

    public Deposit saveDeposit(Deposit deposit) {
        depositRepository.save(deposit);
        return deposit;
    }

}