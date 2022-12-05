package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Book;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final BookService bookService;

    @Override

    public void buyBook() {
        System.out.println("Введите название книги");
        String title = scanner.next();
        if (bookService.hasBook(title)) {
            System.out.println("Покуапем книгу");
            bookService.takeBookByName(title);
            System.out.println("Купили книжку");
        } else {
            System.out.println("Не смогли купить книгу(( такой книги нет ");
        }

    }

    @Override
    public void putBook() {
        System.out.println("Введите название книги");
        String title = scanner.next();
        System.out.println("Введите автора книги");
        String author = scanner.next();

        Book book = new Book(title, author);
        bookService.putBook(book);
        System.out.println("Положили книгу"+ title);
    }

    @Override
    public void printBooks() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наши книги");
        bookService.printBooks();

    }
}