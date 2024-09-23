package com.itschool.library.utils.multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        System.out.println("Thread state: " + thread.getState());

        thread.start();
        System.out.println("Thread state: " + thread.getState());
    }
}