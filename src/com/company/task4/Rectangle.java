package com.company.task4;

public class Rectangle implements Shape{




    @Override
    public float area() {
        return LENGTH_OF_SEGMENT*LENGTH_OF_SEGMENT_2;
    }

    @Override
    public float perimeter() {
        return 2*(LENGTH_OF_SEGMENT+LENGTH_OF_SEGMENT_2);
    }

    public String printRectangle(){
        return  "Rectangle: "+perimeter()+" "+area()+".";
    }
}
