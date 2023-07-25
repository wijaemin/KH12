package jdbc.dto;

import java.sql.Date;

public class bookDto {
	private int book_id, book_page_count;
	private String book_title, book_author, book_publisher, book_genre;
	private double book_pirce;
	private Date book_publication_date;

	public int getBook_id() {
		return book_id;
	}

	public bookDto() {
		super();
	}

	@Override
	public String toString() {
		return "bookDto [book_id=" + book_id + ", book_page_count=" + book_page_count + ", book_title=" + book_title
				+ ", book_author=" + book_author + ", book_publisher=" + book_publisher + ", book_genre=" + book_genre
				+ ", book_pirce=" + book_pirce + ", book_publication_date=" + book_publication_date + ", getBook_id()="
				+ getBook_id() + ", getBook_page_count()=" + getBook_page_count() + ", getBook_title()="
				+ getBook_title() + ", getBook_author()=" + getBook_author() + ", getBook_publisher()="
				+ getBook_publisher() + ", getBook_genre()=" + getBook_genre() + ", getBook_pirce()=" + getBook_pirce()
				+ ", getBook_publication_date()=" + getBook_publication_date() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getBook_page_count() {
		return book_page_count;
	}

	public void setBook_page_count(int book_page_count) {
		this.book_page_count = book_page_count;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public double getBook_pirce() {
		return book_pirce;
	}

	public void setBook_pirce(double book_pirce) {
		this.book_pirce = book_pirce;
	}

	public Date getBook_publication_date() {
		return book_publication_date;
	}

	public void setBook_publication_date(Date book_publication_date) {
		this.book_publication_date = book_publication_date;
	}
}
