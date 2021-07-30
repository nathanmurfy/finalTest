package com.example.finalQuiz.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {

    String Title;
    String Author;
    int Year;

    public Books(int year, @JsonProperty("Title") String Title, @JsonProperty("Author") String Author){
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    public String getTitle() {return Title;}

    public void setTitle(String Title){this.Title = Title;}

    public String getAuthor(){return Author;}

    public void setAuthor(String Author){this.Author = Author;}

    public int getYear(){return Year;}

    public void setYear(int Year){this.Year = Year;}

}
