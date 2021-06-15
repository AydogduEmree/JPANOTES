package com.company.factory.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.factory.JPAFactory;
import com.company.model.Product;

public class JPAFactImpl implements JPAFactory {

	private EntityManager manager=null;
	
		
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		manager = factory.createEntityManager();
		return manager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction transaction = this.manager.getTransaction();
		return transaction;
	}

}
