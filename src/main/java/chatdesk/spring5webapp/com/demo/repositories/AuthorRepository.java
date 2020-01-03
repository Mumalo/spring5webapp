package chatdesk.spring5webapp.com.demo.repositories;

import chatdesk.spring5webapp.com.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
