package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/user/carts")
public class CartController {
        static Cart cart = new Cart();
        @Autowired
        private IProductService productService;


        @GetMapping
        public List<Product> showCart() {
            return cart.getListProducts();
        }

//        @GetMapping("/soLuongList")
//        public List<Integer> showSoLuong1sp() {
//             return cart.getListSoLuong();
//        }

        @PostMapping
        public Product save(@RequestBody Product product) {
            cart.addProduct(product);
            return product;
        }


        @GetMapping("/delete/{id}")
        public String delete(@PathVariable long id) {
            Product product = productService.findById(id);
            cart.deleteProduct(product);
            return "Deleted";
        }

        @GetMapping("/delete")
        public List<Product> deleteCart() {
            cart = new Cart();
            return cart.getListProducts();
        }

}

