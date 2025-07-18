package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.*;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private static ProductRepository productRepository;
    private static Product product;

    @BeforeAll
    static void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    void findAll() {
        assertNotNull(productRepository.findAll());
        assertEquals(3, productRepository.findAll().size());
    }

    @Test
    void findById() {
        Optional<Product> existingProduct = productRepository.findById(1L);
        assertTrue(existingProduct.isPresent());
        assertEquals("Laptop", existingProduct.get().getName());

        Optional<Product> nonExistingProduct = productRepository.findById(22L);
        assertFalse(nonExistingProduct.isPresent());
    }

    @Test
    void save() {
        Product product1 = new Product(1L, "Laptop", 1100.00);
        Product result1 = productRepository.save(product1);
        assertEquals(product1.getName(), result1.getName());

        Product product2 = new Product("Speaker", 8000.00);
        Product result2 = productRepository.save(product2);
        assertNotNull(product2.getId());
        assertEquals("Speaker", result2.getName());

        Optional<Product> product = productRepository.findById(1L);
        assertTrue(product.isPresent());
        assertEquals(1100.00, product.get().getPrice());
    }
}