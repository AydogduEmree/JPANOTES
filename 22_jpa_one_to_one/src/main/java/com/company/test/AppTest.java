package com.company.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Address;
import com.company.model.Customer;

public class AppTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		 
		EntityTransaction transaction =  manager.getTransaction();
		transaction.begin();
			Address a1 = new Address("sokak-1", "city-1", 12345);
			Customer c1 =	new Customer("Fname", "Lname", new Date());
			c1.setAddress(a1);
			manager.persist(a1);
			manager.persist(c1);
		transaction.commit();
		
		System.out.println("success!");

	}

}
