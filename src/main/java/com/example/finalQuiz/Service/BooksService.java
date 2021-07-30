package com.example.finalQuiz.Service;

import com.example.finalQuiz.Entity.Books;
import com.example.finalQuiz.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository){this.booksRepository = booksRepository;}

    public int addBook(Books books){return  booksRepository.insertBooks(books);}

    public List<Books> findAllBooks(){return booksRepository.getAllBooks();}

    public Books getBooksByYear(int Year){return booksRepository.SelectByYear(Year);}

}
