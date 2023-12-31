package com.jamescalenderdemo.contentcalenderdemo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jamescalenderdemo.contentcalenderdemo.model.Content;
import com.jamescalenderdemo.contentcalenderdemo.model.Status;

// @Repository

// Spring Data jdbc uses CrudRepository and simple "entity". creates queries for you without having to write native Crud queries over jdbc.

public interface ContentRepository extends ListCrudRepository<Content, Integer>{
    

    List<Content> findAllByTitleContains(String keyword);

    @Query("Select * FROM Content WHERE status = :status")
    List<Content> listByStatus(@Param("status") Status status);
}
