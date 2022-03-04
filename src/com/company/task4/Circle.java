package com.company.task4;

public class Circle implements Shape{
    @Override
    public float area() {
        return (float) (Math.PI*Math.pow(LENGTH_OF_SEGMENT,2));
    }

    @Override
    public float perimeter() {
        return (float) (2*Math.PI*LENGTH_OF_SEGMENT);
    }

    public String printCircle(){
        return  "Circle: "+perimeter()+" "+area()+".";
    }
}
