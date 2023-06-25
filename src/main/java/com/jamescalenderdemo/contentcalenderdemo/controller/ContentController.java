package com.jamescalenderdemo.contentcalenderdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import com.jamescalenderdemo.contentcalenderdemo.model.Content;
import com.jamescalenderdemo.contentcalenderdemo.repository.ContentCollectionRepository;

@RestController
@RequestMapping ("/api/content")
public class ContentController {
    
    private ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository contentCollectionRepository){
        this.repository = contentCollectionRepository;
    }


    // make request and find all pieces of content 
    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Content content){
        repository.save(content);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Content content,@PathVariable Integer id){
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!");
        }
        repository.save(content);
    }
}
