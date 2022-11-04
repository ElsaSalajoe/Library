/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Melnikov
 */

public class Book implements Serializable{
    private String title;
    private int countBooksInLibrary;
    private Author[] authors = new Author[0]; 

    public Book() {
        
    }

    public Book(String title, Author[] authors, int countBooksInLibrary) {
        this.title = title;
        this.authors = authors;
        this.countBooksInLibrary = countBooksInLibrary;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getCountBooksInLibrary() {
        return countBooksInLibrary;
    }

    public void setCountBooksInLibrary(int countBooksInLibrary) {
        this.countBooksInLibrary = countBooksInLibrary;
    }
    
    @Override
    public String toString() {
        return "Book{"
                + "title=" + title 
                + ", authors=" + Arrays.toString(authors)
                + ", countBooksInLibrary=" + countBooksInLibrary
                + '}';
    }

    public void addAuthor(Author author) {
        Author[] newAuthors = Arrays.copyOf(authors, authors.length+1);
        newAuthors[newAuthors.length-1] = author;
        this.authors = newAuthors;
    }
    
    public void removeAuthor(int numberOfAuthor){
        //обнуляем указанного автора (по индексу)
        this.getAuthors()[numberOfAuthor-1]=null;
        //создаем массив с количеством элементов на 1 меньше
        Author[] newAuthors = new Author[this.getAuthors().length-1];
        // в цикле копируем элементы в новый массив не учитывая обнуленную ячейку
        int j = 0;
        for (Author author : this.getAuthors()) {
            if (author != null) {
                newAuthors[j] = author;
                j++;
            }
        }
        //копируем ссылку на новый массив в книгу
        this.setAuthors(newAuthors);
    }

    
}