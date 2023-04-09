package com.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.model.Product;
import com.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product adjustStockQuantity(Long id, int quantity) {
        Product product = productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setStockQuantity(product.getStockQuantity() + quantity);
        return productRepository.save(product);
    }
}
