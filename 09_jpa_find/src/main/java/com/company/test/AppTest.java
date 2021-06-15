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
		
	//	Personel p2 = new Personel(15,"Emre2","Aydoğdu2",new Date(),"20546879+64");

	
		Personel returnedPersonel = manager.find(Personel.class, 109);
	
		if(returnedPersonel != null) {
			System.out.println(returnedPersonel.toString());
		System.out.println("success!");
		
		}
	}

}
