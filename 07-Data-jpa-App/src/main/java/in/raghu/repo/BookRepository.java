package in.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.raghu.entity.Book;
import in.raghu.entity.BookPK;

@Repository
public interface BookRepository extends JpaRepository<Book, BookPK> {

}
