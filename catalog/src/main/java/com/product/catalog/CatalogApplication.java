package com.product.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(CatalogApplication.class, args);
	}

}
