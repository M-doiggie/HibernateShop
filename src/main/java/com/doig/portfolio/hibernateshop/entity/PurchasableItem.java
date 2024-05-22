package com.doig.portfolio.hibernateshop.entity;

import jakarta.persistence.*;

@Entity
@Table
public class PurchasableItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int price;
}
