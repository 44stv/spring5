package com.sturc.spring5.repositories;

import com.sturc.spring5.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long > {
}
