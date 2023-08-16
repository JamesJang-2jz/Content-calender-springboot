package com.jamescalenderdemo.contentcalenderdemo.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.jamescalenderdemo.contentcalenderdemo.model.Content;

// @Repository unnecessary
public interface ContentRepository extends ListCrudRepository<Content, Integer>{
    
}
