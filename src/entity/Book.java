/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Melnikov
 */
@Entity
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private int countBooksInLibrary;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "book_authos")
    private List<Author> authors = new ArrayList<>(); 

    public Book() {
        
    }

    public Book(String title, List<Author> authors, int countBooksInLibrary, Long Id) {
        this.Id = Id;
        this.title = title;
        this.authors = authors;
        this.countBooksInLibrary = countBooksInLibrary;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
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
        Author[] authorsArray = (Author[])authors.toArray();
        return "Book{"
                + "Id=" + Id 
                + "title=" + title 
 //               + ", authors=" + Arrays.toString(authorsArray)
                + ", countBooksInLibrary=" + countBooksInLibrary
                + '}';
    }

    public void addAuthor(Author author) {
//        Author[] newAuthors = Arrays.copyOf(authors, authors.length+1);
//        newAuthors[newAuthors.length-1] = author;
        this.authors.add(author);
    }
    
    public void removeAuthor(int numberOfAuthor){
        //обнуляем указанного автора (по индексу)
        Author[] authors = (Author[])this.authors.toArray();
        //создаем массив с количеством элементов на 1 меньше
        Author[] newAuthors = new Author[authors.length-1];
        // в цикле копируем элементы в новый массив не учитывая обнуленную ячейку
        int j = 0;
        for (Author author : authors) {
            if (author != null) {
                newAuthors[j] = author;
                j++;
            }
        }
        //копируем ссылку на новый массив в книгу
        this.authors = Arrays.asList(newAuthors);
    }

    

    
}