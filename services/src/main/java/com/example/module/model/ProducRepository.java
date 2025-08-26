package com.example.module.model;

import java.util.*;
import java.util.stream.Collectors;

public class ProducRepository {
    private final List<ProductModel> products;
    public ProducRepository() {
        this.products = new ArrayList<>();
    }

    public Optional<ProductModel> findProduct(Integer id) {
        Optional<ProductModel> existProduct = products.stream()
                .filter(product -> Objects.equals(product.getId(), id)) // ✅ CORRECTO
                .findFirst();

        boolean isPresent = existProduct.isPresent();
        if (!isPresent) {
            throw new RuntimeException("Product not found");
        }
        return existProduct;
    };

    public Optional<ProductModel> findProduct(String name ){
        Optional<ProductModel> existProduct = products.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst();
        if(!existProduct.isPresent()){
            throw new RuntimeException("Product not found");
        }
        return existProduct;
    }

    public Optional<ProductModel> findByPrice(Double price){
        return products.stream()
                .filter(product -> Objects.equals(product.getPrice(), price))
                .findFirst();
    }

    public List<ProductModel> orderByPrice(){
        return products.stream()
                .sorted(Comparator.comparing(ProductModel::getPrice))
                .collect(Collectors.toList());
    }

    public List<ProductModel> orderByName(){
        return products.stream()
                .sorted(Comparator.comparing(ProductModel::getName))
                .collect(Collectors.toList());
    }

    public double calculateTotal(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .sum();
    }

    public double calculateAverage(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .average()
                .orElse(0.0);
    }

    public double calculateMin(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .min()
                .orElse(0.0);
    }

    public double calculateMax(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .max()
                .orElse(0.0);
    }

    public  double calculateCount(){
        return products.stream()
                .count();
    }
}


