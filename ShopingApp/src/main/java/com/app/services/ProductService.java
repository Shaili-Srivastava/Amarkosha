package com.app.services;

import java.util.List;

import com.app.model.Product;

public interface ProductService {
	
		Product createProduct(Product product);
	    List<Product> getAllProducts();
	    Product adjustStockQuantity(Long id, int quantity);
}
