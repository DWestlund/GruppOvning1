package com.yajava.bibliotek.bibliotekshylla;

import java.util.ArrayList;

import com.yajava.bibliotek.bok.Bok;

public class Bibliotekshylla {
	private String category;
	private char sabChar;
	private ArrayList<Bok> books;
	
	
	public Bibliotekshylla(String category, char sabChar) {
		this.category = category;
		this.sabChar = sabChar;
		this.books = new ArrayList<Bok>();
		
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public char getSabChar() {
		return sabChar;
	}

	public ArrayList<Bok> getBooks() {
		return books;
	}
	
	
}
