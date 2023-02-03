package com.example.demomongodb.repository;

import com.example.demomongodb.model.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String > {

}
