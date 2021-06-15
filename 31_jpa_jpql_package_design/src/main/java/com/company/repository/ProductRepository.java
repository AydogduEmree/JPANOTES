package com.company.repository;

import java.util.List;

import com.company.model.Brand;
import com.company.model.Category;
import com.company.model.Product;

public interface ProductRepository {
	
	Product saveProduct(Product product);
	Brand 	saveBrand(Brand brand);
	Category saveCategory(Category category);
	
	List<Brand> findAllBrand();
	List<Product> findProducts();
	List<Product> findGreatPrice(double unitPrice);
	
	List<Object[]> findGroupByCategory();
}
