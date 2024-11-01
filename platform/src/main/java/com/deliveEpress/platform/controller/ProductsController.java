package com.deliveEpress.platform.controller;

import com.deliveEpress.platform.dto.ProductsDTO;
import com.deliveEpress.platform.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping
    public ResponseEntity<ProductsDTO> createProduct(@RequestBody ProductsDTO productsDTO) {
        return ResponseEntity.ok(productsService.createProduct(productsDTO));
    }

    @PutMapping
    public ResponseEntity<ProductsDTO> updateProduct(@RequestBody ProductsDTO productsDTO) {
        return ResponseEntity.ok(productsService.updateProduct(productsDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        productsService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductsDTO> getProductById(@PathVariable Integer id) {
        return ResponseEntity.ok(productsService.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductsDTO>> getAllProducts() {
        return ResponseEntity.ok(productsService.getAllProducts());
    }
}
