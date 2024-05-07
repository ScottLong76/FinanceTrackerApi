package com.financetrackerapi.service;

import org.springframework.stereotype.Service;

import com.financetrackerapi.model.Bill;
import com.financetrackerapi.repository.BillRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BillService {

    final BillRepository billRepository;

    public Bill getBill(int id) {
        return billRepository.findById((Long.valueOf(id))).get();
    }

    public Bill saveBill(Bill bill) {
        billRepository.save(bill);
        return bill;
    }

}