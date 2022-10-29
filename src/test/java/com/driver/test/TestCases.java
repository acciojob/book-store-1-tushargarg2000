package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.driver.Book;
import com.driver.BookController;
import com.driver.DemoApplication;

@SpringBootTest(classes = DemoApplication.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCases {

//    @Autowired
//    BookController bookController;
//
//    @Test
//    @Order(1)
//    public void saveBook(){
//        Book book1 = new Book();
//        book1.setName("Book 1");
//        book1.setAuthor("Author 1");
//        book1.setGenre("Genre 1");
//        bookController.createBook(book1);
//        int id = bookController.getBookList().get(0).getId();
//
//        assertEquals(bookController.getBookById(Integer.toString(id)).getBody().getAuthor(), "Author 1");
//    }
//
//    @Test
//    @Order(2)
//    public void saveBook2(){
//        Book book1 = new Book();
//        book1.setName("Book 2");
//        book1.setAuthor("Author 1");
//        book1.setGenre("Genre 2");
//        bookController.createBook(book1);
//        int id = bookController.getBookList().get(0).getId();
//
//        assertEquals(bookController.getBooksByAuthor("Author 1").getBody().size(), 2);
//    }
//
//    @Test
//    @Order(3)
//    public void saveBook3(){
//        assertEquals(bookController.getBooksByGenre("Genre 1").getBody().size(), 1);
//    }
//
//    @Test
//    @Order(4)
//    public void saveBook4(){
//        Book book1 = new Book();
//        book1.setName("Book 3");
//        book1.setAuthor("Author 2");
//        book1.setGenre("Genre 3");
//        bookController.createBook(book1);
//        assertEquals(bookController.getAllBooks().getBody().size(), 3);
//    }
//
//    @Test
//    @Order(5)
//    public void saveBook5(){
//        int firstId = bookController.getAllBooks().getBody().get(0).getId();
//        bookController.deleteBookById(Integer.toString(firstId));
//        assertEquals(bookController.getAllBooks().getBody().size(), 2);
//    }
//
//    @Test
//    @Order(6)
//    public void saveBook6(){
//        bookController.deleteAllBooks();
//        assertEquals(bookController.getAllBooks().getBody().size(), 0);
//    }
}