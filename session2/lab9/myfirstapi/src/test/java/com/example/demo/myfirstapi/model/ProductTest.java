package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.*;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setup() {
        product = new Product(10L, "Bread", 50.5);
    }

    @Test
    void getId() {
        assertEquals(10L, product.getId());
    }

    @Test
    void getName() {
        assertEquals("Bread", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(50.5, product.getPrice());
    }

    @Test
    void setId() {
        product.setId(5L);
        assertEquals(5L, product.getId());
    }

    @Test
    void setName() {
        product.setName("Milk");
        assertEquals("Milk", product.getName());
    }

    @Test
    void setPrice() {
        product.setPrice(70.0);
        assertEquals(70.0, product.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("Product{id=10, name='Bread', price=50.5}", product.toString());
    }

    @Test
    void testEquals() {
        Product product2 = new Product(10L, "Bread", 50.5);
        Product product3 = new Product(5L, "Milk", 50.5);
        assertTrue(product.equals(product2));
        assertFalse(product.equals(product3));
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash(10, "Bread", 50.5), product.hashCode());
    }
}