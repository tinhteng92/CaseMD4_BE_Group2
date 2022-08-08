package com.codegym.controller;

import com.codegym.model.Receipt;
import com.codegym.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/admin/receipts")
public class ReceiptAdmin {
    @Autowired
    IReceiptService receiptService;



    @GetMapping
    public Page<Receipt> getAll(@RequestParam(defaultValue = "0") int page) {
        return receiptService.getAll(PageRequest.of(page, 9));
    }
}
