package com.codegym.repository;

import com.codegym.model.DetailReceipt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDetailReceiptRepo extends CrudRepository<DetailReceipt, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM case_md4.detail_receipt where account_id_account = :idAccount and time_order = :timePayment")
    List<DetailReceipt> findDetailReceipt(@Param(value = "idAccount") long idAccount, @Param(value = "timePayment") String timePayment);
}
