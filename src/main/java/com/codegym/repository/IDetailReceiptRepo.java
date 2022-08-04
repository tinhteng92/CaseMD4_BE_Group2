package com.codegym.repository;

import com.codegym.model.DetailReceipt;
import org.springframework.data.repository.CrudRepository;

public interface IDetailReceiptRepo extends CrudRepository<DetailReceipt, Long> {
}
