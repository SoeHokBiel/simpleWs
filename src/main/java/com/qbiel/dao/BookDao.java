package com.qbiel.dao;

import java.util.List;

import com.qbiel.model.Book;

public interface BookDao {
	public Book get(int isbn);
	public List<Book> getList();
	
}
