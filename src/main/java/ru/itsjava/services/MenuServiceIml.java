package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceIml implements MenuService {

    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        printMenu();
        while (true) {
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Вы выбрали купить книгу");
                clientService.buyBook();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали положить книгу");
                clientService.putBook();
            } else if (menuNum ==3) {
                System.out.println("Вы выбрали показать список книг");
                clientService.printBooks();
            } else {
                System.out.println("До встречи");
                break;
            }

        }
    }

    @Override
    public void printMenu() {
        System.out.println("1-Купить; 2- Положить;3- Показать список книг; Все остальное выход");

    }
}
