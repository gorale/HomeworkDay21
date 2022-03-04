package com.company.task3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public String sound() {
        return "Cat sound";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
