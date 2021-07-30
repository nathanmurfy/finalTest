package com.example.finalQuiz.Repository;

import com.example.finalQuiz.Entity.Books;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository {

    int insertBooks(Books books);

    List<Books> getAllBooks();

    Books SelectByYear(int Year);
}
