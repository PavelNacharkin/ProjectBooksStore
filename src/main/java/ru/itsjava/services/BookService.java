package ru.itsjava.services;

import ru.itsjava.domain.Book;

public interface BookService {
    Book takeBookByName(String name);
    void putBook(Book book);
    boolean hasBook(String name);

    void printBooks();
}
