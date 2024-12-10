package com.example.case_study.repository;
import com.example.case_study.model.Book;
import java.util.List;

public interface IBookRepository {
    List<Book> getAllBooks();
    Book getBookById(int id);
    boolean updateAvailableCopies(int bookId, int newAvailableCopies);
}