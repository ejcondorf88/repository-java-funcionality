package com.example.module.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Builder
@ToString
@Getter
@Setter
public class ProductModel {
    private int id;
    private String name;
    private String description;
    private double price;
    private ProductCategory category;

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(final Object o) {
        if (null == o || this.getClass() != o.getClass()) return false;
        final ProductModel that = (ProductModel) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return this.category;
    }

    public void setCategory(final ProductCategory category) {
        this.category = category;
    }
}
