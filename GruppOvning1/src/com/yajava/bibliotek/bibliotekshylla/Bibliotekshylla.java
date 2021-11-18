package com.yajava.bibliotek.bibliotekshylla;

import java.util.ArrayList;
import com.yajava.bibliotek.bok.Bok;

public class Bibliotekshylla {
	private String category;
	private ArrayList<Bok> books;
	
	
	public Bibliotekshylla(String category) {
		this.category = category;
		this.books = new ArrayList<Bok>();
	}

	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
	public ArrayList<Bok> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Bok> books) {
		this.books = books;
	}
	
	
}
