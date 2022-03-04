package com.company.polymorphism;

public  class MainSecond {
    protected int numInt;
    protected float numFloat;


    public String overloading(int numInt,float numFloat){
        return numInt+" "+numFloat;

    }


    public String overloading(float numFloat,int numInt){
        return numFloat+" "+numInt;

    }

    public  String number(){
        return "num";
    }

    public static void main(String[] args) {
        MainSecond main = new MainSecond();
        Second second = new Second();

        System.out.println(second.number());
        System.out.println(main.overloading(3f,4));

        System.out.println(main.overloading(4,3f));
    }

}
