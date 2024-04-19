package com.product.catalog.service;

import java.util.List;

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
		//return null;
       return this.productRepository.findAll();
    }

	@Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		
	}

    

    

   

}
