package com.todo;

import com.todo.model.Menu;
import com.todo.service.TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        TodoList todoList = new TodoList();

        while (true) {
            menu.showMenu();

            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            menu.selectChoice(choice, todoList);
            return;
        }
    }
}