package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.model.Receipt;
import com.codegym.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("/receipts")
public class ReceiptController {
    @Autowired
    IReceiptService receiptService;

    @PostMapping
    public Receipt save(@RequestBody Receipt receipt) {
        receipt.setTimePayment(LocalDateTime.now());
        receiptService.save(receipt);
        return receipt;
    }

    @GetMapping
    public Page<Receipt> getAll(@RequestParam(defaultValue = "0") int page) {
        return receiptService.getAll(PageRequest.of(page, 9));
    }
}
