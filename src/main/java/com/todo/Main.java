package com.todo;

import com.todo.model.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        while (true) {
            menu.showMenu();
            int choice = scanner.nextInt();

            return;
        }

    }
}