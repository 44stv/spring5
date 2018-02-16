package com.sturc.spring5.repositories;

import com.sturc.spring5.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
