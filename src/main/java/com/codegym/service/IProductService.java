package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> getAll (Pageable pageable);
    void delete(long id);
    Product findById(long id);
    Product save(Product product);
    List<Product> findByName(String name);
    List<Product> findByColor(String idColor);
    List<Product> findBySize(String idSize);

}

