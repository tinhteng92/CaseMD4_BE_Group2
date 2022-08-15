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

import java.util.List;

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
        return productService.getAll(PageRequest.of(page, 6));
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable long id){
        return productService.findById(id);
    }

    @GetMapping("/search")
    public List<Product> findByName(@RequestParam(defaultValue = "") String name){
        return productService.findByName(name);
    }


    @PutMapping
    public String updateQuantity(@RequestBody Product product) {
            productService.save(product);
        return "update quantity success";
    }

    @GetMapping("/color/{idColor}")
    public List<Product> findByColor(@PathVariable String idColor) {
        return productService.findByColor(idColor);
    }
    @GetMapping("/size/{idSize}")
    public List<Product> findBySize(@PathVariable String idSize) {
        return productService.findBySize(idSize);
    }

}
