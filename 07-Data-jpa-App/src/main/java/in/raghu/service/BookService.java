package in.raghu.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.raghu.entity.Book;
import in.raghu.entity.BookPK;
import in.raghu.repo.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	public void saveBook() {
		BookPK bookPK = new BookPK(202,"Java");
		Book book=new Book(600, "james", bookPK);
		bookRepo.save(book);
	}
	
	public void getData() {
		BookPK pk=new BookPK(202,"Java");
		Optional<Book> book = bookRepo.findById(pk);
		if(book.isPresent()) {
			System.out.println(book.get());
		}	
	}
}
