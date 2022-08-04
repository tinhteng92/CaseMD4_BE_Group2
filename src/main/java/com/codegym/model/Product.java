package com.codegym.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;
    private String nameProduct;
    private String img;
    private long price;
    private int quantity;
    private String content;
    private String description;
    @OneToOne
    private Size size;
    @OneToOne
    private Color color;
    @ManyToOne
    private Category category;

}
