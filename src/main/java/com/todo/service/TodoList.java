package com.todo.service;

import com.todo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are no Tasks Available");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + "." + tasks.get(i));
            }
        }
    }

    public void deleteTask(int choice) {
        if (choice >= 0 && choice < tasks.size()) {
            tasks.remove(choice);
        } else {
            System.out.println("The task index is invalid.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        } else {
            System.out.println("The task index is invalid.");
        }
    }
}
