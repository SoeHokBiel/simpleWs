package com.qbiel.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qbiel.dao.BookDao;
import com.qbiel.model.Book;

@Service
public class BookBoImpl implements BookBo {
	
	@Autowired
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Transactional
	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		return bookDao.getList();
	}

	@Override
	public Book get(int isbn) {
		// TODO Auto-generated method stub
		return bookDao.get(isbn);
	}

}
