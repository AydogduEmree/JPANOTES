package com.company.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.model.Contact;
import com.company.model.Personel;

public class AppTestEmbedd {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		Personel p = new Personel(10, "asdas", "LAST", new Date(), "66",
				new Contact("6545646","ccc@bbb.com","www.myCompany.com"));
		
		transaction.begin();
		
		manager.persist(p);
		
		transaction.commit();

	}

}
