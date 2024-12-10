package com.example.case_study.service;

import com.example.case_study.model.Book;
import com.example.case_study.repository.IBookRepository;
import com.example.case_study.repository.BookRepository;
import com.example.case_study.service.IBookService;

import java.util.List;

public class BookService implements IBookService {
    private final IBookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.getBookById(id);
    }

    @Override
    public boolean updateAvailableCopies(int bookId, int newAvailableCopies) {
        return bookRepository.updateAvailableCopies(bookId, newAvailableCopies);
    }
}
