package chatdesk.spring5webapp.com.demo.repositories;

import chatdesk.spring5webapp.com.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
