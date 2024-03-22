package com.example.store.product;

public record ProductRequestDTO(String title, String image, float price, float rate, String availability, String category) {
    public ProductRequestDTO(Product product) {
        this(product.getTitle(), product.getImage(), product.getPrice(), product.getRate(), product.getAvailability(), product.getCategory());
    }
}
