package com.product.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalog.model.Product;
import com.product.catalog.service.ProductService;

@RestController
public class ProductCatalogController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		return ResponseEntity.ok().body(productService.getAllProduct());
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.ok().body(this.productService.createProduct(product));
	}

}
