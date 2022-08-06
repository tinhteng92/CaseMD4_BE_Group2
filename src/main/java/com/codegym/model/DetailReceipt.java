package com.codegym.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class DetailReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailReceipt;
    @OneToOne
    private Product product;
    private int quantityOrder;
    private LocalDateTime timeOrder;
    @ManyToOne
    private Account account;
}
