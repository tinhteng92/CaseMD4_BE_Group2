package com.codegym.service.impl;

import com.codegym.model.DetailReceipt;
import com.codegym.repository.IDetailReceiptRepo;
import com.codegym.service.IDetailReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DetailService implements IDetailReceiptService {
    @Autowired
    IDetailReceiptRepo iDetailReceiptRepo;

    @Override
    public DetailReceipt save(DetailReceipt detailReceipt) {
        return iDetailReceiptRepo.save(detailReceipt);
    }

    @Override
    public List<DetailReceipt> getAll() {
        return (List<DetailReceipt>) iDetailReceiptRepo.findAll();
    }

    @Override
    public List<DetailReceipt> findDetailReceipt(long idAccount, String timePayment) {
        return iDetailReceiptRepo.findDetailReceipt(idAccount, timePayment);
    }
}
