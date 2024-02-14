package com.example.springbootmysqleks.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "exchange-rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer transactionId;
    private String sourceCurrency;
    private String targetCurrency;
    private double amount;
    private Date lastUpdated;
}
