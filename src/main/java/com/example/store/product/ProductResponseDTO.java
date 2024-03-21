package com.example.store.product;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String title, String image, float price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getTitle(), product.getImage(), product.getPrice());
    }
}
