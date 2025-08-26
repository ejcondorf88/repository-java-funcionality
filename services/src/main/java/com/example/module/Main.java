package com.example.module;

import com.example.module.controller.ProducController;
import com.example.module.model.IProductService;
import com.example.module.model.impl.ProductService;
import com.example.module.view.ProductView;

public class Main {
    public static void main(String[] args) {
        IProductService productService = new ProductService();
        ProductView productView = new ProductView(new ProducController( productService ));
        productView.showMenu();
    }
}