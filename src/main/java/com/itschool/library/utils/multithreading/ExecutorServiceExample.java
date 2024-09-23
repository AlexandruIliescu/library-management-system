package com.itschool.library.utils.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable task1 = () -> System.out.println("Task1 executed in a fixed thread pool");
        Runnable task2 = () -> System.out.println("Task2 executed in a fixed thread pool");

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.shutdown();
    }
}