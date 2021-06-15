package com.company.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		//EntityTransaction transaction =  manager.getTransaction();
		
		
		System.out.println("success!");

	}

}
