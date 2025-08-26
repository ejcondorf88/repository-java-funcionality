package com.example.module.controller;

import com.example.module.model.IProductService;
import com.example.module.model.IProductService;
import com.example.module.model.ProductModel;

import java.util.Optional;
import java.util.stream.Stream;

public class ProducController {
    private final IProductService producService;
    public ProducController(IProductService producService) {
        this.producService = producService;
    }
    public Optional<ProductModel> findProduct(Integer id){
        return producService.findProduct(id);
    }
    public Optional<ProductModel> findProduct(String name){
        return producService.findProduct(name);
    }
    public Optional<ProductModel> findByPrice(Double price){
        return producService.findByPrice(price);
    }
    public Stream<ProductModel> orderByPrice(){
        return producService.orderByPrice();
    }
    public Stream<ProductModel> orderByName(){
        return producService.orderByName();
    }
    public double calculateTotal(){
        return producService.calculateTotal();
    }
    public double calculateAverage(){
        return producService.calculateAverage();
    }
    public double calculateMin(){
        return producService.calculateMin();
    }
    public double calculateMax(){
        return producService.calculateMax();
    }

}