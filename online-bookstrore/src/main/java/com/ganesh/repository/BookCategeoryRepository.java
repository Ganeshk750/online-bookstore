package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ganesh.model.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategory", path="book-category")
public interface BookCategeoryRepository extends JpaRepository<BookCategory, Long>{

	
}
