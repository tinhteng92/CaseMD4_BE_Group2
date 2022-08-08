package com.codegym.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class UserQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUserQuestion;
    private String email;
    private String subject;
    private String message;
    private LocalDateTime timeMessage;
    @ManyToOne
    private Account account;
}
