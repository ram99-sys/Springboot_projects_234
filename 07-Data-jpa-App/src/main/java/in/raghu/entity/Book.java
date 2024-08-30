package in.raghu.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="book_info")
public class Book {
	@Override
	public String toString() {
		return "Book [bookPrice=" + bookPrice + ", author=" + author + ", bookpk=" + bookpk + "]";
	}

	private float bookPrice;
	private String author;
	
	@EmbeddedId
	private BookPK bookpk;

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookPK getBookpk() {
		return bookpk;
	}

	public void setBookpk(BookPK bookpk) {
		this.bookpk = bookpk;
	}

	public Book(float bookPrice, String author, BookPK bookpk) {
		super();
		this.bookPrice = bookPrice;
		this.author = author;
		this.bookpk = bookpk;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
