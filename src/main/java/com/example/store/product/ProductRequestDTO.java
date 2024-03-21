package com.example.store.product;

public record ProductRequestDTO(String title, String image, float price) {
    public ProductRequestDTO(Product product) {
        this(product.getTitle(), product.getImage(), product.getPrice());
    }
}
