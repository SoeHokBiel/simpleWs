package com.qbiel.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.qbiel.util.CustomHibernateDaoSupport;
import com.qbiel.model.Book;

@Repository
public class BookDaoImpl extends CustomHibernateDaoSupport implements BookDao {
	

	public void setSesFactory(SessionFactory sesFactory) {
		setSesFactory(sesFactory);
	}
	

	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("FROM Book");
		return list;
	}


	@Override
	public Book get(int isbn) {
		// TODO Auto-generated method stub
		return (Book) getHibernateTemplate().find("FROM Book b WHERE b.isbn = ? ",isbn).get(0);
	}

	
}
