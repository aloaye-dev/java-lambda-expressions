package com.java.functionalinterface;


interface Shape{
    void draw();
}

public class LambdaExample implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle draw shape");
    }
}

