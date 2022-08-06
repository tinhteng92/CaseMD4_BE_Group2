package com.codegym.service;

import com.codegym.model.DetailReceipt;
import com.codegym.model.Receipt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDetailReceiptService{
    DetailReceipt save(DetailReceipt detailReceipt);
    List<DetailReceipt> getAll ();
}
