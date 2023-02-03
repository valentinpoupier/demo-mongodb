package com.example.demomongodb.service;

import com.example.demomongodb.model.entities.Book;
import com.example.demomongodb.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String insert(Book book){
        Book entity = bookRepository.save(book);

        return entity.getId();
    }

}
