package com.app.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

public class ProductQuantity {
	
	@ManyToOne
    private Product product;

    private int saleQuantity;

    private BigDecimal discount;

	public ProductQuantity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductQuantity(Product product, int saleQuantity, BigDecimal discount) {
		super();
		this.product = product;
		this.saleQuantity = saleQuantity;
		this.discount = discount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
    
    
    
}
