package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.model.BookCategory;


public interface BookCategeoryRepository extends JpaRepository<BookCategory, Long>{

}
