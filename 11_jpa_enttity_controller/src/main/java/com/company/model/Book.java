package com.company.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {
	@Id
	private int bookId;
	
	private String name;
	
	private int pageCount;
	
	private String topic;
	
	private String authorName;
	
	@Temporal(TemporalType.DATE)
	private Date publisherDate;
	
	public Book() {
		
	}

	public Book(int bookId, String name, int pageCount, String topic, String authorName, Date publisherDate) {
		this.bookId = bookId;
		this.name = name;
		this.pageCount = pageCount;
		this.topic = topic;
		this.authorName = authorName;
		this.publisherDate = publisherDate;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", pageCount=" + pageCount + ", topic=" + topic
				+ ", authorName=" + authorName + ", publisherDate=" + publisherDate + "]";
	}
	
	
	
}
