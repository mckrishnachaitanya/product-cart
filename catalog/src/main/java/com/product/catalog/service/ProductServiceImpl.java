package com.product.catalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.catalog.dao.ProductRepository;
import com.product.catalog.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductRepository productRepository;

	@Override
    public List < Product > getAllProduct() {
       return this.productRepository.findAll();
    }

	@Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(long productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product.isEmpty() ? new Product() : product.get();
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}

    

    

   

}
