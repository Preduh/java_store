package com.example.store.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "products")
@Entity(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String image;
    private float price;
    private float rate;
    private String availability;
    private String category;

    public Product(ProductRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
        this.rate = data.rate();
        this.availability = data.availability();
        this.category = data.category();
    }
}
