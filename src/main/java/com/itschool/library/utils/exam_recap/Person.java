package com.itschool.library.utils.exam_recap;

/*
 * Person (Encapsulation)
 * Create a class Person with private attributes name and age,
 * and provide getter and setter methods to access them.
 * Demonstrate encapsulation by setting and getting the values.
 */

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException();
        }
        this.age = age;
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(27);

        System.out.println(person.getName() + " " + person.getAge());
    }
}