package com.codegym.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class DetailReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailReceipt;
    private String item;
    private int quantity;
    private long price;
}
