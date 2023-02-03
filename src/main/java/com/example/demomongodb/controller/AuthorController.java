package com.example.demomongodb.controller;

import com.example.demomongodb.model.entities.Author;
import com.example.demomongodb.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @PostMapping
    public String insert(@RequestBody Author author){
        return this.service.insert(author);
    }
}
