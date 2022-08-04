package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM case_md4.product where nameProduct like concat('%',:name,'%');")
    List<Product> findProductsByNameProductContaining(String name);
}
