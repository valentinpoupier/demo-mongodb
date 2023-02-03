package com.example.demomongodb.service;

import com.example.demomongodb.model.entities.Author;
import com.example.demomongodb.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public String insert(Author author){
        Author entity = this.repository.save(author);
        return entity.getId();
    }

}
