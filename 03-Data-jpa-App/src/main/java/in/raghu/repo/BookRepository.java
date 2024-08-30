package in.raghu.repo;

import org.springframework.data.repository.CrudRepository;

import in.raghu.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
