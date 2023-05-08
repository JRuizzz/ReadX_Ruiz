package model;

import java.util.Calendar;

public class Book extends BiblioProducts {
    
    private String shortReview;
    private Genre genre;
    private int numSoldBooks;
    
    public Book(String name, String id, int numberPages, Calendar postDate, int value,int readedPages,String URL, String shortReview, Genre genre, int numSoldBooks) {
        super(name, id, numberPages, postDate, value, readedPages, URL);
        this.shortReview = shortReview;
        this.genre = genre;
        this.numSoldBooks = numSoldBooks;
    }

    public String getShortReview() {
        return shortReview;
    }

    public void setShortReview(String shortReview) {
        this.shortReview = shortReview;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public int getNumSoldBooks() {
        return numSoldBooks;
    }

    public void setNumSoldBooks(int numSoldBooks) {
        this.numSoldBooks = numSoldBooks;
    }
    
 
}
