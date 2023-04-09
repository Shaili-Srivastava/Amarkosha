package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.*;
import com.app.services.*;

@RestController
@RequestMapping("/api/salesorders")
public class SalesOrderController {
    
    @Autowired
    private SalesOrderService salesOrderService;

    @PostMapping("")
    public ResponseEntity<SalesOrder> createSalesOrder(@RequestBody SalesOrder salesOrder) {
        SalesOrder createdSalesOrder = salesOrderService.createSalesOrder(salesOrder);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSalesOrder);
    }

    @GetMapping("")
    public ResponseEntity<List<SalesOrder>> getAllSalesOrders() {
        List<SalesOrder> salesOrders = salesOrderService.getAllSalesOrders();
        return ResponseEntity.ok().body(salesOrders);
    }

}




