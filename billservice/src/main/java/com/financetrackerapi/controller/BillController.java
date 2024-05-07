package com.financetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financetrackerapi.model.Bill;
import com.financetrackerapi.service.BillService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("bill")
@RequiredArgsConstructor
public class BillController {

    final BillService billService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Bill getBill(@PathVariable int id) {

        return billService.getBill(id);
    }

    @PostMapping("/save")
    Bill newBill(@RequestBody Bill newBill) {
        return billService.saveBill(newBill);
    }

}