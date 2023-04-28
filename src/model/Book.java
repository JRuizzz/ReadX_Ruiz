package model;

import java.util.Calendar;

public class Book extends BiblioProducts{
    
    private String shortReview;
    private Genre genre;
    private String urlBook;
    private double priceBook;
    private int numSoldBooks;

    
    public Book(String name, String id, int numberPages, Calendar postDate, int readedPages, String shortReview, Genre genre, String urlBook, double priceBook, int numSoldBooks) {
        super(name, id, numberPages, postDate, readedPages);
        this.shortReview = shortReview;
        this.genre = genre;
        this.urlBook = urlBook;
        this.priceBook = priceBook;
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

    public String getUrlBook() {
        return urlBook;
    }

    public void setUrlBook(String urlBook) {
        this.urlBook = urlBook;
    }

    public double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(double priceBook) {
        this.priceBook = priceBook;
    }

    public int getNumSoldBooks() {
        return numSoldBooks;
    }

    public void setNumSoldBooks(int numSoldBooks) {
        this.numSoldBooks = numSoldBooks;
    }
}
