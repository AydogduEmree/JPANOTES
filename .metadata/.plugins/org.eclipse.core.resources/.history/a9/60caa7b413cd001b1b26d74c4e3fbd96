package com.company.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Department;
import com.company.model.Employee;

public class AppTestManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction =  manager.getTransaction();

			
		Department d1 = new Department("Software Developer", 1000, 15000);
		Department d2 = new Department("Software Tester", 1000, 9000);
		
		Employee e1 = new Employee("Emre", "AYDOGDU", new Date(), 9250, d1);
		 
		transaction.begin();
		manager.persist(d1);
		manager.persist(d2);
		
		manager.persist(e1);
		transaction.commit();
	}

}
