package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepo;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo iProductRepo;

    @Override
    public Page<Product> getAll(Pageable pageable) {
        return (Page<Product>) iProductRepo.findAll(pageable);
    }

    @Override
    public Product save(Product product) {
        return iProductRepo.save(product);
    }


    @Override
    public void delete(long id) {
        iProductRepo.deleteById(id);

    }

    @Override
    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepo.findProductsByNameProductContaining(name);
    }

    @Override
    public List<Product> findByColor(String idColor) {
        return iProductRepo.findProductsByColor(idColor);
    }
    @Override
    public List<Product> findBySize(String idSize) {
        return iProductRepo.findProductsBySize(idSize);
    }
}
