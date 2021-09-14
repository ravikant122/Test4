package com.bookPublicationHouse.model.service;

import com.bookPublicationHouse.model.entities.Book;

public interface BookService {
	public void persistObjectGraph(Book book);
	public Book retrieveObjectGraph(String isbn);
}
