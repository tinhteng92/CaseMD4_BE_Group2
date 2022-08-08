package com.codegym.controller;

import com.codegym.model.DetailReceipt;
import com.codegym.model.Receipt;
import com.codegym.service.IDetailReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user/detailReceipts")
public class DetailReceiptController {
    @Autowired
    IDetailReceiptService detailReceiptService;

    @PostMapping
    public DetailReceipt save(@RequestBody DetailReceipt detailReceipt) {
        detailReceipt.setTimeOrder(LocalDateTime.now());
        detailReceiptService.save(detailReceipt);
        return detailReceipt;
    }

    @GetMapping
    public List<DetailReceipt> getAll(@RequestParam(defaultValue = "0") int page) {
        return detailReceiptService.getAll();
    }
}
