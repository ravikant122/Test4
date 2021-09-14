package com.bookPublicationHouse.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODE", length = 4, nullable = false)
	private String code;
	
	@Column(name = "PUBLISHER_NAME", length = 100, nullable = false)
	private String name;

	@OneToMany(mappedBy = "publisher")
	private List<Book> books=new ArrayList<Book>();
	
	public Publisher() {}	
	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publisher [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}














