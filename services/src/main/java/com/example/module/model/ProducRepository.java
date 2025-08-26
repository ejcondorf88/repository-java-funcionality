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


}