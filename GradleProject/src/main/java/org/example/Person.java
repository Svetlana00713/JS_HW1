package org.example;

import  java.util.Random;

public final class Person {
    private static final String[] names = new String[]{"Алексей", "Олег", "Сергей", "Алина", "Вера", "Нина", "Борис"};
    private static final Random random = new Random();
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person create() {
        return new Person(names[random.nextInt(names.length)], random.nextInt(20,45) );
    }
}

