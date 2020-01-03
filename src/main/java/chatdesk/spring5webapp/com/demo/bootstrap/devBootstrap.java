package chatdesk.spring5webapp.com.demo.bootstrap;

import chatdesk.spring5webapp.com.demo.model.Author;
import chatdesk.spring5webapp.com.demo.model.Book;
import chatdesk.spring5webapp.com.demo.model.Publisher;
import chatdesk.spring5webapp.com.demo.repositories.AuthorRepository;
import chatdesk.spring5webapp.com.demo.repositories.BookRepository;
import chatdesk.spring5webapp.com.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class devBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public devBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){

        Author eric = new Author("Eric", "Evans");
        Publisher p1 = new Publisher("Harper", "Collins");
        publisherRepository.save(p1);

        Book ddd = new Book("Domain Driven Design", "1234", p1);
        eric.getBooks().add(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development", "1256", p1);
        eric.getBooks().add(ddd);
        rod.getBooks().add(noEJB);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        authorRepository.save(rod);
        bookRepository.save(noEJB);


    }
}
