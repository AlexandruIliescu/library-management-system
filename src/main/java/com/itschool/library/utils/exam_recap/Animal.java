package com.itschool.library.utils.exam_recap;


/*
 * Animal Sounds (Inheritance and Polymorphism)
 * Create a base class Animal with a method makeSound()
 * Then create subclasses Dog and Cat, each with its own implementation of makeSound()
 * Demonstrate polymorphism by calling the method on different animals
 */

public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Ham");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}