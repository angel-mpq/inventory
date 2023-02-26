package com.anperez.inventory.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int brandId;
    private Timestamp startDate;
    private Timestamp endDate;
    private int priceList;
    private int productId;
    private int priority;
    private Float price;
    private String curr;
}
