package com.app.model;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SalesOrder {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customer;

    private LocalDateTime timestamp;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductQuantity> productQuantities;

	public SalesOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesOrder(Long id, String customer, LocalDateTime timestamp, List<ProductQuantity> productQuantities) {
		super();
		this.id = id;
		this.customer = customer;
		this.timestamp = timestamp;
		this.productQuantities = productQuantities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public List<ProductQuantity> getProductQuantities() {
		return productQuantities;
	}

	public void setProductQuantities(List<ProductQuantity> productQuantities) {
		this.productQuantities = productQuantities;
	}
    
    
}
