package com.codegym.repository;

import com.codegym.model.Product;
import com.codegym.model.Receipt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface IReceiptRepo extends PagingAndSortingRepository<Receipt, Long> {

}
