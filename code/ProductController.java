package com.example.productservice.controllers;

import com.example.productservice.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/products")
public class ProductController {
    @GetMapping("/")
    public String getAllProducts() {
        return "All Products";
    }

    //    @GetMapping("/{id}")
//    public String getProductById(Long id) {
//        return "Product with product id " + id;
//    }
    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return "Product with product id " + id;
    }

    @PostMapping

    public String createProduct(@RequestBody ProductDto productDto) {
        return "Product created: " + productDto.toString();
    }
}
