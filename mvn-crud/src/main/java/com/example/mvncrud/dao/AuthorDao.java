package com.example.mvncrud.dao;

import com.example.mvncrud.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author,Integer> {
}
