package com.codegym.service.impl;

import com.codegym.model.Receipt;
import com.codegym.repository.IReceiptRepo;
import com.codegym.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService implements IReceiptService {
    @Autowired
    IReceiptRepo iReceiptRepo;

    @Override
    public Receipt save(Receipt receipt) {
        return iReceiptRepo.save(receipt);
    }

    @Override
    public Page<Receipt> getAll(Pageable pageable) {
        return iReceiptRepo.findAll(pageable);
    }
}
