package com.codegym.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReceipt;
    private LocalDateTime timePayment;
    private long totalPrice;
    @ManyToOne
    private Account account;

}
