package chatdesk.spring5webapp.com.demo.repositories;

import chatdesk.spring5webapp.com.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
