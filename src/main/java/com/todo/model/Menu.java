package com.todo.model;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu() {
        System.out.println("\nTo-Do List!");
        System.out.println("\nMenu:\n");
        System.out.println("1. Add a Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Tasks");
        System.out.println("4. Mark Task as completed");
        System.out.println("5. Exit");
    }

    public void selectChoice(int choice, TodoList todoList) {
        switch (choice) {
            case 1:
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                todoList.addTask(description);
                break;

            case 2:
                todoList.viewTasks();
                break;

            case 3:
                System.out.print("Enter task number to delete: ");
                int deleteIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                todoList.deleteTask(deleteIndex);
                break;

            case 4:
                System.out.print("Enter task number to mark as completed: ");
                int completeIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                todoList.markTaskAsCompleted(completeIndex);
                break;

            case 5:
                System.out.println("Goodbye!");
                return;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

}
