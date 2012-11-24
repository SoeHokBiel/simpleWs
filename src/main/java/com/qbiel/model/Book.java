package com.qbiel.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="book",catalog="simpleWs")
public class Book {

	@Id
	@Column(name = "ISBN")
	private int isbn;
	@Column(name = "TITTLE")
	private String tittle;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "PUBLISHER")
	private String publisher;
	@Column(name = "BOOKYEARS")
	private int years;
	@Column(name = "BUYDATE")
	@Temporal(TemporalType.DATE)
	private Date buyDate;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}


	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}



}
