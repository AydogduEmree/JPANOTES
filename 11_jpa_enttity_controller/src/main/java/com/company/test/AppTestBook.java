package com.company.test;

import java.util.Calendar;
import java.util.Date;

import com.company.model.Book;
import com.company.repositoryDB.BookRepository;
import com.company.repositoryDBImpl.BookRepositoryImpl;

public class AppTestBook {

	public static void main(String[] args) {
		
		BookRepository bookRepo = new BookRepositoryImpl();
		
		
		
		Date sampleDate = createCustomDate(2, 5, 1996);
		Book b = new Book(2, "Korkusuz Korkak", 200, "fun", "EA", sampleDate);
		
		Book b2 = new Book(1, "Korkusuz Korkak", 2300, "fun", "EA", createCustomDate(3,5, 2002));

		bookRepo.saveBook(b2);
		bookRepo.saveBook(b);
	}
	
	public static Date createCustomDate(int day, int month, int year) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.YEAR, year);
		
		
		return cal.getTime();
	}

}
