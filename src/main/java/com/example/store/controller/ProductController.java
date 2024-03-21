package com.example.store.controller;

import com.example.store.product.Product;
import com.example.store.product.ProductRepository;
import com.example.store.product.ProductRequestDTO;
import com.example.store.product.ProductResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProductResponseDTO> get_all() {
        List<ProductResponseDTO> productList;
        productList = this.productRepository.findAll().stream().map(ProductResponseDTO::new).toList();

        return productList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Product save_product(@RequestBody ProductRequestDTO data) {
        Product product;
        product = new Product(data);

        this.productRepository.save(product);

        return product;
    }
}
