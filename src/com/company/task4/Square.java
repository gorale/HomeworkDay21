package com.company.task4;

public class Square implements Shape{

    @Override
    public float area() {
        return (float) Math.pow(LENGTH_OF_SEGMENT,2);
    }

    @Override
    public float perimeter() {
        return LENGTH_OF_SEGMENT*4;
    }

    public String printSquare(){
        return  "Square: "+perimeter()+" "+area()+".";
    }
}
