package com.qbiel.bo;

import java.util.List;

import com.qbiel.model.Book;


public interface BookBo {
	public Book get(int isbn);
	public List<Book> getList();
}
