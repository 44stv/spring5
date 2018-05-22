package com.sturc.spring5.bootstrap;

import com.sturc.spring5.model.Author;
import com.sturc.spring5.model.Book;
import com.sturc.spring5.model.Publisher;
import com.sturc.spring5.repositories.AuthorRepository;
import com.sturc.spring5.repositories.BookRepository;
import com.sturc.spring5.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {


        Author eric = new Author("Eric", "Evans");
        Publisher harperCollins = new Publisher("Harper Collins", "address hC");
        Book ddd = new Book("Domain Driven Design", "1234", harperCollins);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(harperCollins);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Publisher worx = new Publisher("Worx", "address Worx");
        Book noEJB = new Book("J2EE Development without EJB", "2345", worx);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        publisherRepository.save(worx);
        bookRepository.save(noEJB);

    }
}
