package com.company.test;

import com.company.repositoryDB.BookRepository;
import com.company.repositoryDBImpl.BookRepositoryImpl;

public class AppTestBookFind {

	public static void main(String[] args) {
		BookRepository bookRepo = new BookRepositoryImpl();
		
		System.out.println(bookRepo.find(1).toString());
		
		//bookRepo.deleteBook(bookRepo.find(2));
	}

}
