package org.example;

import  java.util.Random;

public record Person(String name, int age) {
    private static final String[] names = new String[]{"Алексей", "Олег", "Сергей", "Алина", "Вера", "Нина", "Борис"};
    private static final Random random = new Random();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person create() {
        return new Person( names[random.nextInt( names.length )], random.nextInt( 20, 45 ) );
    }
}
