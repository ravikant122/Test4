package com.bookPublicationHouse.model.service;

import com.bookPublicationHouse.model.dao.BookDao;
import com.bookPublicationHouse.model.dao.BookDaoImpl;
import com.bookPublicationHouse.model.entities.Book;

public class BookServiceImpl implements BookService{

	private BookDao bookDao=new BookDaoImpl();
	
	@Override
	public void persistObjectGraph(Book book) {
		bookDao.persistObjectGraph(book);
	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		return bookDao.retrieveObjectGraph(isbn);
	}

}
