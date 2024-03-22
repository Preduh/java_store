package com.example.store.product;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String title, String image, float price, float rate, String availability, String category) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getTitle(), product.getImage(), product.getPrice(), product.getRate(), product.getAvailability(), product.getCategory());
    }
}
