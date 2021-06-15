package com.company.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	private String name;
	
	private double unitPrice;
	
	private int available;
	
	@ManyToOne
	@JoinColumn(name="brandId")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	private Date updatedDate;
	
	public Product() {
		
	}

	public Product(String name, double unitPrice, int available, Brand brand, Category category, Date createdDate) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.available = available;
		this.brand = brand;
		this.category = category;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", available="
				+ available + ", brand=" + brand + ", category=" + category + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
}
