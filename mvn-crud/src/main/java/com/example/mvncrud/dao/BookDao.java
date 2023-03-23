package com.example.mvncrud.dao;

import com.example.mvncrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
