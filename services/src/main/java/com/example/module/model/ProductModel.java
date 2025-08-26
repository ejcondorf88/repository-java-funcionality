package com.example.module.model;
import lombok.Builder;
@Builder
@ToString
@Getter
@Setter
public class ProductModel {
    private Long id;
    private String name;
    private String description;
    private double price;
    private ProductCategory category;
}
