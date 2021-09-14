package com.bookPublicationHouse.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Chapter {
	
	@Id
	private ChapterKey chapterKey;
	
	@Column(name = "TITLE", length = 100, nullable = false)
	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Book book;
	
	public Chapter() {}

	public Chapter(ChapterKey chapterKey, String title) {
		super();
		this.chapterKey = chapterKey;
		this.title = title;
	}

	public ChapterKey getChapterKey() {
		return chapterKey;
	}

	public void setChapterKey(ChapterKey chapterKey) {
		this.chapterKey = chapterKey;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chapter [chapterKey=");
		builder.append(chapterKey);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}	
	
	
	
}














