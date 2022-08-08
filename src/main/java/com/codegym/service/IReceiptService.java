package com.codegym.service;

import com.codegym.model.Receipt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReceiptService {
    Receipt save(Receipt receipt);
    Page<Receipt> getAll (Pageable pageable);
}
