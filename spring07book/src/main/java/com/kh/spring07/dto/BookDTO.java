package com.kh.spring07.dto;

public class BookDTO {
private int bookID,bookPageCount;
private String bookTitle,bookAuthor,bookPublicationDate, bookGenre,bookPublisher;

public String getBookPublisher() {
	return bookPublisher;
}
public void setBookPublisher(String bookPublisher) {
	this.bookPublisher = bookPublisher;
}
private double bookPrice;
@Override
public String toString() {
	return "BookDTO [bookID=" + bookID + ", bookPageCount=" + bookPageCount + ", bookTitle=" + bookTitle
			+ ", bookAuthor=" + bookAuthor + ", bookPublicationDate=" + bookPublicationDate + ", bookGenre=" + bookGenre
			+ ", bookPublisher=" + bookPublisher + ", bookPrice=" + bookPrice + "]";
}
public BookDTO() {
	super();
}
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
public int getBookPageCount() {
	return bookPageCount;
}
public void setBookPageCount(int bookPageCount) {
	this.bookPageCount = bookPageCount;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBookPublicationDate() {
	return bookPublicationDate;
}
public void setBookPublicationDate(String bookPublicationDate) {
	this.bookPublicationDate = bookPublicationDate;
}
public String getBookGenre() {
	return bookGenre;
}
public void setBookGenre(String bookGenre) {
	this.bookGenre = bookGenre;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
}
