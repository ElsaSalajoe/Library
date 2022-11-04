/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Melnikov
 */
public class History implements Serializable{
    private Reader reader;
    private Book book;
    private Date takeOnBook;
    private Date returnBook;
    private int countBooksInLibrary;

    public History() {
    }

    public History(Reader reader, Book book, Date takeOnBook, Date returnBook, int countBooksInLibrary) {
        this.reader = reader;
        this.book = book;
        this.takeOnBook = takeOnBook;
        this.returnBook = returnBook;
        this.countBooksInLibrary = countBooksInLibrary;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getTakeOnBook() {
        return takeOnBook;
    }

    public void setTakeOnBook(Date takeOnBook) {
        this.takeOnBook = takeOnBook;
    }
    
    public int getCountBooksInLibrary() {
        return countBooksInLibrary;
    }

    public void setCountBooksInLibrary(int countBooksInLibrary) {
        this.countBooksInLibrary = countBooksInLibrary;
    }

    @Override
    public String toString() {
        return "History{" 
                + "reader=" + reader 
                + ", book=" + book 
                + ", takeOnBook=" + takeOnBook 
                + ", returnBook=" + returnBook
                + ", countBooksInLibrary=" + countBooksInLibrary 
                + '}';
    }
    
    
}
