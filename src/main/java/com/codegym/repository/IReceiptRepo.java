package com.codegym.repository;

import com.codegym.model.Receipt;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IReceiptRepo extends PagingAndSortingRepository<Receipt, Long> {
}
