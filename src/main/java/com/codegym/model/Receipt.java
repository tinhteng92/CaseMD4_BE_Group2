package com.codegym.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReceipt;
    private Date date;
    private long totalPrice;
    @ManyToOne
    private Account account;
    @OneToOne
    private DetailReceipt detailReceipt;
}
