package com.app.services;

import java.util.List;

import com.app.model.SalesOrder;

public interface SalesOrderService {
	
	SalesOrder createSalesOrder(SalesOrder salesOrder);
    List<SalesOrder> getAllSalesOrders();

}
