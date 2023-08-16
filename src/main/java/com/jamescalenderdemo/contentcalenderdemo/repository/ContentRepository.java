package com.jamescalenderdemo.contentcalenderdemo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.jamescalenderdemo.contentcalenderdemo.model.Content;
import com.jamescalenderdemo.contentcalenderdemo.model.Status;

// @Repository
public interface ContentRepository extends ListCrudRepository<Content, Integer>{
    

    List<Content> findAllByTitleContains(String keyword);

    @Query("Select * FROM Content WHERE status = :status")
    List<Content> listByStatus(Status status);
}
