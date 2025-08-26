package com.example.module.model;

import java.util.Optional;
import java.util.stream.Stream;

public interface IProductService {

    Optional<ProductModel> findProduct(Integer id);

    Optional<ProductModel> findProduct(String name);

    Optional<ProductModel> findByPrice(Double price);

    Stream<ProductModel> orderByPrice();

    Stream<ProductModel> orderByName();

    double calculateTotal();

    double calculateAverage();

    double calculateMin();

    double calculateMax();

    double calculateCount();
}
