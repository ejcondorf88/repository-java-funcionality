package com.example.module.model.impl;

import com.example.module.model.IProductService;
import com.example.module.model.ProducRepository;
import com.example.module.model.ProductModel;

import java.util.Optional;
import java.util.stream.Stream;

public class ProductService implements IProductService {
    private ProducRepository producRepository;
    public ProductService() {
        this.producRepository = new ProducRepository();
    }


    @Override
    public Optional<ProductModel> findProduct(Integer id) {
        return this.producRepository.findProduct(id);
    }

    @Override
    public Optional<ProductModel> findProduct(String name) {
        return this.producRepository.findProduct(name);
    }

    @Override
    public Optional<ProductModel> findByPrice(Double price) {
        return this.producRepository.findByPrice(price);
    }

    @Override
    public Stream<ProductModel> orderByPrice() {
        return this.producRepository.orderByPrice().stream();
    }

    @Override
    public Stream<ProductModel> orderByName() {
        return this.producRepository.orderByName().stream();
    }

    @Override
    public double calculateTotal() {
        return this.producRepository.calculateTotal();
    }

    @Override
    public double calculateAverage() {
        return this.producRepository.calculateAverage();
    }

    @Override
    public double calculateMin() {
        return this.producRepository.calculateMin();
    }

    @Override
    public double calculateMax() {
        return this.producRepository.calculateMax();
    }

    @Override
    public double calculateCount() {
        return this.producRepository.calculateCount();
    }
}
