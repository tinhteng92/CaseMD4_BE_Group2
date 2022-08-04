package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/carts")
public class CartController {
        static Cart cart = new Cart();
        @Autowired
        private IProductService productService;


        @GetMapping
        public List<Product> showCart() {
            return cart.getListProducts();
        }


        @PostMapping
        public Product save(@RequestBody Product product) {
            cart.addProduct(product);
            return product;
        }


        @DeleteMapping("/{id}")
        public String delete(@PathVariable long id) {
            Product product = productService.findById(id);
            cart.deleteProduct(product);
            return "Deleted";
        }

    }

