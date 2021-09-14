package com.bookPublicationHouse.model.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable	
public class ChapterKey implements Serializable{
	
	private static final long serialVersionUID = 4882882476539629913L;
	
	private String bookISBN;
	private Integer chapterNumber;

	public ChapterKey() {
		super();
	}
	public ChapterKey(String bookISBN, Integer chapterNumber) {
		super();
		this.bookISBN = bookISBN;
		this.chapterNumber = chapterNumber;
	}
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	public Integer getChapterNumber() {
		return chapterNumber;
	}
	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChapterKey [bookISBN=");
		builder.append(bookISBN);
		builder.append(", chapterNumber=");
		builder.append(chapterNumber);
		builder.append("]");
		return builder.toString();
	}
	
	
}
