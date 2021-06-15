package com.company.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Department;

public class TestFindAll {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction =  manager.getTransaction();
		
		
		Department department = manager.find(Department.class, 2);
		
		System.out.println(department.getEmployees());
		
}

}
