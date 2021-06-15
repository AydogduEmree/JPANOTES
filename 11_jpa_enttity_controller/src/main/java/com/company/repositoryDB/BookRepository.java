package com.company.repositoryDB;

import com.company.jpaFactory.jpaFactory;
import com.company.jpaFactoyrImpl.JpaFactoryImpl;
import com.company.model.Book;

public interface BookRepository {

	jpaFactory jpaFac = new JpaFactoryImpl();
	
	void saveBook(Book b);
	void deleteBook(Book b);
	Book find(int id);
	Book update(Book b);
	
}
