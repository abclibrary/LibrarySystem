package com.spring.learn.library.controllers;

import com.spring.learn.library.dto.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "/books/{bookId}")
    public Book getData(@PathVariable Integer bookId) {
        Book book = new Book(); //todo get from service layer
        book.setTitle("test title");
        book.setDescription("test Description");
        return book;
    }

}
