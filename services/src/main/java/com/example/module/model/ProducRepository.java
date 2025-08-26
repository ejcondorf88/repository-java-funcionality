package com.example.module.model;
public class ProducRepository {
    private final List<ProductModel> products;
    public ProducRepository() {
        this.products = new ArrayList<>();
    }
    public Optional<ProductModel> findProduct(Integer id){
        Optional<ProductModel> existProduct = products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
        if(existProduct.isEmpty()){
            throw new RuntimeException("Product not found");
        }
        return existProduct.get();
    }
    public Optional<ProductModel> findProduct(String name ){
        Optional<ProductModel> existProduct = products.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst();
        if(existProduct.isEmpty()){
            throw new RuntimeException("Product not found");
        }
        return existProduct.get();
    }
    public findByPrice(Double price){
        return products.stream()
                .filter(product -> product.getPrice().equals(price))
                .findFirst();
    }
    public orderByPrice(){
        return products.stream()
                .sorted(Comparator.comparing(ProductModel::getPrice));
    }
    public orderByName(){
        return products.stream()
                .sorted(Comparator.comparing(ProductModel::getName));
    }
    public calculateTotal(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .sum();
    }
    public calculateAverage(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .average();
    }
    public calculateMin(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .min();
    }
    public calculateMax(){
        return products.stream()
                .mapToDouble(ProductModel::getPrice)
                .max();
    }
    public calculateCount(){
        return products.stream()
                .count();
    }


}