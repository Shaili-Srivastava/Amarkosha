package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.model.Product;
import com.app.model.ProductQuantity;
import com.app.model.SalesOrder;
import com.app.repository.ProductRepository;
import com.app.repository.*;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    private salesOrderRepository salesOrderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public SalesOrder createSalesOrder(SalesOrder salesOrder) {
        List<ProductQuantity> productQuantities = salesOrder.getProductQuantities();
        for (ProductQuantity productQuantity : productQuantities) {
            Long productId = productQuantity.getProduct().getId();
            Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
            int quantityToReduce = productQuantity.getSaleQuantity();
            if (quantityToReduce > product.getStockQuantity()) {
                throw new RuntimeException("Insufficient stock for product " + product.getName());
            }
            product.setStockQuantity(product.getStockQuantity() - quantityToReduce);
            productRepository.save(product);
        }
        return salesOrderRepository.save(salesOrder);
    }

    @Override
    public List<SalesOrder> getAllSalesOrders() {
        return salesOrderRepository.findAll();
    }
}