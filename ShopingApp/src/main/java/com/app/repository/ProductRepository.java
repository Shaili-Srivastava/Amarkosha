package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Product;

import jakarta.persistence.Id;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
