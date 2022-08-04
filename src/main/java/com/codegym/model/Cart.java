package com.codegym.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<Product,Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public List<Product> getListProducts() {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            productList.add(entry.getKey());
        }
        return productList;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    private boolean checkItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getIdProduct() == product.getIdProduct()) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getIdProduct() == product.getIdProduct()) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItemInCart(product)) {
            products.put(product,1);
        } else {
            Map.Entry<Product,Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity  = itemEntry.getValue() + 1;
            products.replace(itemEntry.getKey(),newQuantity);
        }
    }

    public void deleteProduct(Product product) {
        if (checkItemInCart((product))) {
            Map.Entry<Product,Integer> itemEntry = selectItemInCart(product);
            products.replace(itemEntry.getKey(),0);
            products.remove(itemEntry.getKey());
        }
    }
    public void decreaseProduct(Product product) {
        Map.Entry<Product,Integer> itemEntry = selectItemInCart(product);
        Integer newQuantity = 0;
        if (itemEntry.getValue() >= 1) {
            newQuantity  = itemEntry.getValue() - 1;
        }
        products.replace(itemEntry.getKey(),newQuantity);
    }
    public Integer countProductQuantity() {
        Integer productQuantity = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity() {
        return products.size();
    }

    public Double countTotalPayment(){
        double payment = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * (double) entry.getValue();
        }
        return payment;
    }

}
