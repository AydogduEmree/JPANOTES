package com.company.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.company.factory.JPAFactory;
import com.company.factory.Impl.JPAFactImpl;
import com.company.model.Brand;
import com.company.model.Category;
import com.company.model.Product;
import com.company.queries.ProductQueries;
import com.company.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {
	
		private JPAFactory jpaFactory = new JPAFactImpl();
		
		private EntityManager manager = jpaFactory.getEntityManager();
		
		private EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

		@SuppressWarnings("unchecked")
		@Override
		public List<Product> findProducts() {
		//	Query query = this.manager.createQuery(ProductQueries.findProductsAll);
			Query query = this.manager.createQuery("Select g from product g",Product.class);

			List<Product> products = query.getResultList();
			
	//		TypedQuery<Product> typedQuery = this.manager.createQuery(ProductQueries.findProductsAll,Product.class);
	//		List<Product> products =typedQuery.getResultList();
			return products;
			
		}
		@SuppressWarnings("unchecked")
		@Override
		public List<Product> findGreatPrice(double unitPrice) {
			TypedQuery<Product> typedQuery = this.manager.createQuery(ProductQueries.findProducts,Product.class);
			typedQuery.setParameter("unitPrice", unitPrice);
			List<Product> products =typedQuery.getResultList();
			return products;
		}

		@Override
		public List<Object[]> findGroupByCategory() {
			// Since it is Object, use Query
			Query query = this.manager.createQuery(ProductQueries.findGroupByCategory);
			List<Object[]> functionCategory = query.getResultList();
			return functionCategory;
		}

		@Override
		public Product saveProduct(Product product) {
			this.entityTransaction.begin();
			this.manager.persist(product);
			this.entityTransaction.commit();
			return product;
		}

		@Override
		public Brand saveBrand(Brand brand) {
			this.entityTransaction.begin();
			this.manager.persist(brand);
			this.entityTransaction.commit();
			return brand;
		}

		@Override
		public Category saveCategory(Category category) {
			this.entityTransaction.begin();
			this.manager.persist(category);
			this.entityTransaction.commit();
			return category;
		}
		@Override
		public List<Brand> findAllBrand() {
			Query query = this.manager.createQuery("Select b from brand b",Brand.class);
			List<Brand> brands = query.getResultList();
			return brands;
		}

		
		

		
}
