/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DatabaseManager {

    public void saveBooks(Book[] books) {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        for (Book book : books) {
            if(book.getId() == null){
                em.persist(book);
                for (Author author : book.getAuthors()) {
                    em.persist(author);
                }
                break;
            }
        }
        tx.commit();
    }  

    public void saveReaders(Reader[] readers) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        for (Reader reader: readers) {
           if(reader.getId() == null){
                em.persist(reader);
                break;
            }
        }
        tx.commit();
        
    }
    
    /*public void saveHistory(History[] histories) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        for (History history: histories) {
           if(history.getId() == null){
                em.persist(history);
                break;
            }
        }
        tx.commit();
    }*/
    
}
