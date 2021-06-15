package com.company.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Department;
import com.company.model.Employee;

public class TestFind {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction =  manager.getTransaction();

		Department mDepartment = manager.find(Department.class, 2);
		
		Employee e2 = new Employee("Emre", "AYDOGDU", new Date(), 9250, mDepartment);
		
		transaction.begin();
		manager.persist(e2);
		transaction.commit();
	}

}
