package com.company.test;



import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.company.model.Brand;
import com.company.model.Category;
import com.company.model.Product;
import com.company.repository.ProductRepository;
import com.company.repository.impl.ProductRepositoryImpl;

public class TestFactory {
	private static ProductRepository productRepository = new ProductRepositoryImpl();
	public static void main(String[] args) {
		//commented after first execution
		// insertData();
		
	
		List<Brand> brands = productRepository.findAllBrand();
		for(Brand b: brands) {
			System.out.println(b.toString());
		 		}
		
		List<Product> products = productRepository.findProducts();
		for(Product p: products) {
		System.out.println(p.toString());
		}
		System.out.println("-----------");
		
		products = productRepository.findGreatPrice(2751);
		for(Product p: products) {
			System.out.println(p.toString());
		}
		
		
		System.out.println("-----------");
		
		
		List<Object[]> list =  productRepository.findGroupByCategory();
		for(Object[] hp: list) {
			System.out.println(hp[0] + "     " + hp[1]);
		}
		
		
		Calendar calendar =Calendar.getInstance();
		calendar.set(2021, 5, 6);
		calendar.set(Calendar.DAY_OF_MONTH, 6);
		calendar.set(Calendar.MONTH, 5);
		calendar.set(Calendar.YEAR, 2021);
		
	}
	
	public static void insertData() {
		Brand brand1 = new Brand("APPLE");
		Brand brand2 = new Brand("LG");
		Brand brand3 = new Brand("SONY");
		Brand brand4 = new Brand("SAMSUNG");
		Brand brand5 = new Brand("ASUS");
		
		Category category1 = new Category("Computer");
		Category category2 = new Category("Tablet");
		Category category3 = new Category("Phone");
		
		Product p1 = new Product("Iphone 7", 3500, 2, brand1, category3, new Date());
		Product p2 = new Product("LG G15", 2500, 1, brand2, category3, new Date());
		Product p3 = new Product("SONY EXP", 2700, 1, brand3, category3, new Date());
		
		
		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		productRepository.saveBrand(brand5);
		
		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);
		
		
		productRepository.saveProduct(p1);
		productRepository.saveProduct(p2);
		productRepository.saveProduct(p3);
		
	}

}
