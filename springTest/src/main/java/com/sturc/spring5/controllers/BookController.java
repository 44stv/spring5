package com.sturc.spring5.controllers;

import com.sturc.spring5.model.Book;
import com.sturc.spring5.model.Publisher;
import com.sturc.spring5.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }

    @RequestMapping("/jsontest")
    @ResponseBody
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            books.add(i, new Book("test " + i,
                "isbn " + i, new Publisher("name " + i, "address " + i)));
        }
        return books;
    }

}
