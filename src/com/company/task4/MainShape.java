package com.company.task4;

import java.util.Arrays;

public class MainShape {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        String[] shape = {square.printSquare(), circle.printCircle(), rectangle.printRectangle()};
        System.out.println(Arrays.toString(shape));
    }
}
