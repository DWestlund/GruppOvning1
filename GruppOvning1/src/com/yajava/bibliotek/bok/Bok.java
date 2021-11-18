package com.yajava.bibliotek.bok;

import com.yajava.bibliotek.sab.Sab;

public class Bok {
	private String title;
	private String author;
	private Sab sabCode;
	
	
	public Bok(String title, String author, Sab sabCode) {
		this.title = title;
		this.author = author;
		this.sabCode = sabCode;
		
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Sab getSab() {
		return sabCode;
	}

}
