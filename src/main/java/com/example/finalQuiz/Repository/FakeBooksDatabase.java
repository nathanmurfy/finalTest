package com.example.finalQuiz.Repository;

import com.example.finalQuiz.Entity.Books;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public abstract class FakeBooksDatabase implements BooksRepository{

    private static List<Books> BOOKSDATA = new ArrayList<>();

    @Override
    public int insertBooks(Books books) {
        BOOKSDATA.add(new Books(books.getYear(), books.getTitle(), books.getAuthor()));
        return 1;
    }

    @Override
    public List<Books> getAllBooks() {return BOOKSDATA;}


    public Books SelectByTitle(int Year){
        Books found = null;

        for(Books books : BOOKSDATA){
            if(books.getYear() == Year){
                found = books;
            }
        }
        return found;
    }


}
