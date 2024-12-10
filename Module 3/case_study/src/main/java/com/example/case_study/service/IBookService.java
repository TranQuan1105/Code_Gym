package com.example.case_study.service;

import com.example.case_study.model.Book;
import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    Book getBookById(int id);
    boolean updateAvailableCopies(int bookId, int newAvailableCopies);
}