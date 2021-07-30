package com.example.finalQuiz.Controller;

import com.example.finalQuiz.Entity.Books;
import com.example.finalQuiz.Repository.BooksRepository;
import com.example.finalQuiz.Repository.FakeBooksDatabase;
import com.example.finalQuiz.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/books")
@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    public BooksController(BooksService booksService){this.booksService = booksService;}

    @PostMapping
    public void addNewBooks(@RequestBody Books books) {booksService.addBook(books);}

    @GetMapping
    public List<Books> returnAllBooks(){return booksService.findAllBooks();}

    @GetMapping(path = "{Year}")
    public Books getBookByYear(@PathVariable("Year") int Year){return booksService.getBooksByYear(Year);}

}
