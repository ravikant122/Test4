package com.bookPublicationHouse.model.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ISBN", length = 50, nullable = false)
	private String isbn;

	@Column(name = "BOOK_NAME", length = 100, nullable = false)
	private String name;
	
	@JoinColumn(name = "PUBLISHER_CODE")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Publisher publisher;
	
	@OneToMany(mappedBy = "book")
	private List<Chapter> chapters;

	public Book() {
		super();
	}

	public Book(String isbn, String name, Publisher publisher, List<Chapter> chapters) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.chapters = chapters;
	}

	public Book(String isbn, String name) {
		super();
		this.isbn = isbn;
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=");
		builder.append(isbn);
		builder.append(", name=");
		builder.append(name);
		builder.append(", publisher=");
		builder.append(publisher);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}












































