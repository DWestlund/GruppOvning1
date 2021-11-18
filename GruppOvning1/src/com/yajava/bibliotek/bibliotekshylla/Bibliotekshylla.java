package com.yajava.bibliotek.bibliotekshylla;

import java.util.ArrayList;
import com.yajava.bibliotek.bok.Bok;
import com.yajava.bibliotek.sab.Sab;///////////

public class Bibliotekshylla {
	private String category;
	private Sab sabCode; //////////////////////
	private ArrayList<Bok> books;
	
	
	public Bibliotekshylla(String category, Sab sabCode) {
		this.category = category;
		this.sabCode = sabCode;
		this.books = new ArrayList<Bok>();
	}

	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Sab getSabCode() {
		return sabCode;
	}

	public ArrayList<Bok> getBooks() {
		return books;
	}
	
	
}
