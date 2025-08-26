package com.example.module.model.impl;

public class ProducService implements IProducService{
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
    public Optional<ProductModel> findByPrice(Double price){
        return producRepository.findByPrice(price);
    }
    public Stream<ProductModel> orderByPrice(){
        return producRepository.orderByPrice();
    }
    public Stream<ProductModel> orderByName(){
        return producRepository.orderByName();
    }
    public double calculateTotal(){
        return producRepository.calculateTotal();
    }
    public double calculateAverage(){
        return producRepository.calculateAverage();
    }
    public double calculateMin(){
        return producRepository.calculateMin();
    }
    public double calculateMax(){
        return producRepository.calculateMax();
    }
    public long calculateCount(){
        return producRepository.calculateCount();
    }
}
