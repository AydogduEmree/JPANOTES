package com.company.jpaFactoyrImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.company.jpaFactory.jpaFactory;

public class JpaFactoryImpl implements jpaFactory {
	private EntityManager manager;

	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		this.manager = factory.createEntityManager();
		return manager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {

		EntityTransaction transaction = this.manager.getTransaction();
		return transaction;
	}

}
