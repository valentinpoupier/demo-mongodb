package com.example.demomongodb.controller;

import com.example.demomongodb.model.entities.Book;
import com.example.demomongodb.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public String insert(Book book){
        return bookService.insert(book);
    }
}
