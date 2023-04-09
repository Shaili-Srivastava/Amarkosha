package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.SalesOrder;

public interface salesOrderRepository extends JpaRepository<SalesOrder, Long> {

}
