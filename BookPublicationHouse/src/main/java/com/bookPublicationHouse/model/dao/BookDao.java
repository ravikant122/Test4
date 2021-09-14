package com.bookPublicationHouse.model.dao;

import com.bookPublicationHouse.model.entities.Book;

public interface BookDao {
	public void persistObjectGraph(Book book);
	public Book retrieveObjectGraph(String isbn);
}
