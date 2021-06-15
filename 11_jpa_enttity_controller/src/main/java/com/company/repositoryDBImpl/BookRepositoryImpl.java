package com.company.repositoryDBImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.company.model.Book;
import com.company.repositoryDB.BookRepository;

public class BookRepositoryImpl implements BookRepository {

	EntityManager manager = jpaFac.getEntityManager();
	EntityTransaction transaction = jpaFac.getEntityTransaction();

	@Override
	public void saveBook(Book b) {
		this.transaction.begin();

		this.manager.persist(b);

		this.transaction.commit();
	}

	@Override
	public void deleteBook(Book b) {
		transaction.begin();
		manager.remove(b);
		transaction.commit();
	}

	@Override
	public Book find(int id) {
		 Book bo  = this.manager.find(Book.class, id);
		 
		 if(bo != null) {
			 return bo;
		 }
		 
		return null; 
	}

	@Override
	public Book update(Book b) {
		transaction.begin();
		manager.merge(b);
		transaction.commit();
		return b;
	}

}
