package com.company.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Address;
import com.company.model.Customer;

public class AppTestFindWithMappedBy {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		 
		EntityTransaction transaction =  manager.getTransaction();
		transaction.begin();
			
		Customer cExample = manager.find(Customer.class, 2);
			System.out.println(cExample.toString());
		transaction.commit();
		
		System.out.println("success!");

	}

}
