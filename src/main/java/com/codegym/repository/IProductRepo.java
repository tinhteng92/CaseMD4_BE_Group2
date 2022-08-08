package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM case_md4.product where name_product like concat('%',:name,'%');")
    List<Product> findProductsByNameProductContaining(String name);

    @Query(nativeQuery = true, value = "select price from casemodule4 between 0 and 100")
    List<Product> findAllByPrice0_100(long price);
}
