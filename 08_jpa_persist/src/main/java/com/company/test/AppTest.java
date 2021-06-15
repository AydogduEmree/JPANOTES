package com.company.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Personel;

public class AppTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction =  manager.getTransaction();
		
		// create Personel p1 = new Personel(2,"Emre","Aydoğdu",new Date(),"0546879+64");
		//<!-- <property name = "hibernate.hbm2ddl.auto" value="create"/> -->
		
		
		//update 
		Personel p2 = new Personel(15,"Emre2","Aydoğdu2",new Date(),"20546879+64");
		
		transaction.begin();
		
		manager.persist(p2);
		
		transaction.commit();
		
		System.out.println("success!");

	}

}
