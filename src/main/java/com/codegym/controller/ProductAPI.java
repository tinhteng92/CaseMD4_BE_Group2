package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ICategoryService;
import com.codegym.service.IColorService;
import com.codegym.service.IProductService;
import com.codegym.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class ProductAPI {
    @Autowired
    IProductService productService;

    @Autowired
    ICategoryService categoryService;

    @Autowired
    IColorService colorService;

    @Autowired
    ISizeService iSizeService;

    @GetMapping
    public Page<Product> getAll(@RequestParam(defaultValue = "0") int page) {
        return productService.getAll(PageRequest.of(page, 9));
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable long id){
        return productService.findById(id);
    }


}
