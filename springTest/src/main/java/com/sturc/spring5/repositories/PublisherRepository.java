package com.sturc.spring5.repositories;

import com.sturc.spring5.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
