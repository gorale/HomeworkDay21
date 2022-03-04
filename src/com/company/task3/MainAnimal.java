package com.company.task3;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal(12,"Animal");
        System.out.println(animal.sound());
        System.out.println(animal.toString());
        Cat cat = new Cat(23,"Cat");
        System.out.println(cat.sound());
        System.out.println(cat.toString());


    }
}
