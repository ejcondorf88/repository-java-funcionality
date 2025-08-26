package com.example.module.model.impl;

public class ProducService {
    private final ProducRepository producRepository;
    public ProducService(ProducRepository producRepository) {
        this.producRepository = producRepository;
    }
    public Optional<ProductModel> findProduct(Integer id){
        return producRepository.findProduct(id);
    }
    public Optional<ProductModel> findProduct(String name){
        return producRepository.findProduct(name);
    }
}
