package com.company.carAndEngine;

public class Car {

    private final Integer year;
    private final String model;
    private final String  mark;
    private final Engine engine;


    public Integer getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {

        return new Engine(this.engine);
    }

    public Car(Integer year, String model, String mark, Engine engine) {
        this.year = year;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }
}
