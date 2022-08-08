package com.codegym.repository;

import com.codegym.model.Color;
import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM case_md4.product where name_product like concat('%',:name,'%');")
    List<Product> findProductsByNameProductContaining(String name);

    // Tim kiem bang Color
    Iterable<Product> findAllByColor(Color color);

//    @Query(nativeQuery = true, value = "SELECT * FROM case_md4.product where color_id_color =:idColor and ")


}
