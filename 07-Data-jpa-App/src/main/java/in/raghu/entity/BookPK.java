package in.raghu.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class BookPK {
	private Integer bookId;
	private String bookName;
	
	@Override
	public String toString() {
		return "BookPK [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	public BookPK(Integer bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public BookPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
