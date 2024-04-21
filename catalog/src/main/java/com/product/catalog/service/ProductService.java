package com.product.catalog.service;

import java.util.List;

import com.product.catalog.model.Product;

public interface ProductService {
	
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}
