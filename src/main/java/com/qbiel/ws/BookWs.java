package com.qbiel.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qbiel.bo.BookBo;
import com.qbiel.model.Book;

@WebService
@Component("bookWs")
public class BookWs {

	@Autowired
	BookBo bookBo;
	
	@WebMethod(exclude=true)
	public void setBookBo(BookBo bookBo) {
		this.bookBo = bookBo;
	}
	
	@WebMethod(operationName="getBook")
	public Book getBook(@WebParam(name="isbn") int isbn){
		return bookBo.get(isbn);
	}
	
	@WebMethod(operationName="getListBook")
	public List<Book> getListBook(){
		return bookBo.getList();
	}
	
}
