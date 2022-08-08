package com.codegym.controller;

import com.codegym.model.DetailReceipt;

import com.codegym.service.IDetailReceiptService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/detailReceipts")

public class DetailReceiptAdmin {
    @Autowired
    IDetailReceiptService detailReceiptService;

    @GetMapping("/{idAccount}/{timePayment}")
    public List<DetailReceipt> getDetailReceipt(@PathVariable long idAccount, @PathVariable String timePayment) {

        return detailReceiptService.findDetailReceipt(idAccount,timePayment);
    }
}

