package com.bookPublicationHouse.web.controller;

import java.util.ArrayList;
import java.util.List;

import com.bookPublicationHouse.model.entities.Book;
import com.bookPublicationHouse.model.entities.Chapter;
import com.bookPublicationHouse.model.entities.ChapterKey;
import com.bookPublicationHouse.model.entities.Publisher;
import com.bookPublicationHouse.model.service.BookService;
import com.bookPublicationHouse.model.service.BookServiceImpl;

public class Main {
	public static void main(String[] args) {
		
		Book book = new Book("1","spring in action");
		
		ChapterKey chapterKey11 = new ChapterKey("1",1);
		Chapter chapter1=new Chapter(chapterKey11,"chapter 1");
		chapter1.setBook(book);
		
		ChapterKey chapterKey12 = new ChapterKey("1",2);
		Chapter chapter2=new Chapter(chapterKey12,"chapter 2");
		chapter2.setBook(book);
		
		ChapterKey chapterKey13 = new ChapterKey("1",3);
		Chapter chapter3=new Chapter(chapterKey13,"chapter 3");
		chapter3.setBook(book);
		
		List<Chapter> chapters=new ArrayList<>();
		chapters.add(chapter1);
		chapters.add(chapter2);
		chapters.add(chapter3);
		
		book.setChapters(chapters);
		
		Publisher publisher=new Publisher("TMH","Tata book house");
		
		book.setPublisher(publisher);
		
		BookService service = new BookServiceImpl();
		service.persistObjectGraph(book);
		
		Book book1=service.retrieveObjectGraph("1");
		
		System.out.println(book1);
		List<Chapter> chapters1=book1.getChapters();
		chapters1.forEach(System.out::println);
	}
}
